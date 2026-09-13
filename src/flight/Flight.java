package flight;

import java.io.*;

import java.util.ArrayList;

public class Flight implements Serializable {

    private String flightName;
    private int flightID;
    private int Capacity;
    private int CapacityLeft;
    private String depTime;
    private String arrivalTime;
    private String origin;
    private String destination;
    private String description;
    private int price_F;
    private int price_E;
    private String Date;

    public Flight() {
    }

    public Flight(String flightName, int flightID, int Capacity, int CapacityLeft, String depTime, String arrivalTime, String origin, String destination, String description, int price_F, int price_E, String Date) {
        this.flightName = flightName;
        this.flightID = flightID;
        this.Capacity = Capacity;
        this.CapacityLeft = CapacityLeft;
        this.depTime = depTime;
        this.arrivalTime = arrivalTime;
        this.origin = origin;
        this.destination = destination;
        this.description = description;
        this.price_F = price_F;
        this.price_E = price_E;
        this.Date = Date;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getCapacityLeft() {
        return CapacityLeft;
    }

    public void setCapacityLeft(int CapacityLeft) {
        this.CapacityLeft = CapacityLeft;
    }

    public void setPrice_F(int price_F) {
        this.price_F = price_F;
    }

    public void setPrice_E(int price_E) {
        this.price_E = price_E;
    }

    public int getPrice_F() {
        return price_F;
    }

    public int getPrice_E() {
        return price_E;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public boolean checkSeat(Flight f, int n) {
        boolean check = false;
        if (n > f.getCapacity()) {
            check = false;
        } else if (n < f.getCapacity()) {
            check = true;
        } else if (n == f.getCapacity()) {
            check = true;
        }
        return check;
    }

    public boolean bookSeat(Flight f, int n) {
        if (checkSeat(f, n)) {
            int num = f.getCapacityLeft();
            int num1;
            num1 = num - n;

            f.setCapacityLeft(num1);
            return true;
        }
        return false;
    }

    public int BookingPriceE(Flight f) {
        int Economy_Price;
        Economy_Price = f.getPrice_E();
        return Economy_Price;
    }

    public int BookingPriceF(Flight f) {
        int First_Price;
        First_Price = f.getPrice_F();
        return First_Price;
    }

    public void updateflight(Access a, Flight f, String FlightNam, int flightID, int capacity, String depTime, String arrivalTime, String origin, String destination) throws IOException, ClassNotFoundException {
        for (int i = 0; i < a.flights.size(); i++) {

            if (a.flights.get(i).getFlightID() == f.getFlightID()) {

                a.flights.get(i).setFlightName(FlightNam);
                a.flights.get(i).setFlightID(flightID);
                a.flights.get(i).setCapacity(capacity);
                a.flights.get(i).setDepTime(depTime);
                a.flights.get(i).setArrivalTime(arrivalTime);
                a.flights.get(i).setOrigin(origin);
                a.flights.get(i).setDestination(destination);

                ArrayList<Flight> flightss = Flight.readFlights();
                for (Flight flight : flightss) {
                    if (flight.getFlightID() == a.flights.get(i).getFlightID()) {

                        flight.setFlightName(FlightNam);
                        flight.setFlightID(flightID);
                        flight.setCapacity(capacity);
                        flight.setDepTime(depTime);
                        flight.setArrivalTime(arrivalTime);
                        flight.setOrigin(origin);
                        flight.setDestination(destination);

                    }
                }
                Flight.writeFlights(flightss);

            }
        }
    }

    public boolean alreadyExists(Access a, int fID, int fid) {

        if (fID == fid) {
            return true;
        } else {
            for (int i = 0; i < a.flights.size(); i++) {
                if (a.flights.get(i).getFlightID() == fID && !(a.flights.get(i).getFlightID() == fid)) {

                    return false;
                }
            }
            return true;
        }
    }

    public boolean Exists(Access a, int fID) {

        for (int i = 0; i < a.flights.size(); i++) {
            if (a.flights.get(i).getFlightID() == fID) {

                return false;
            }
        }
        return true;
    }

    void removeFlight(Access a, int id) throws IOException, ClassNotFoundException {

        for (int i = 0; i < a.flights.size(); i++) {
            if (id == a.flights.get(i).getFlightID()) {
                a.flights.remove(i);
                Flight.writeFlights(a.flights);

            }
        }
    }

    public void addFlight(Access a, String Flight_name, int Flight_ID, int capacity, String desc, int price_F, int price_E, String origin, String destination, String Date, String depTime, String arrivalTime) throws IOException, ClassNotFoundException {
        a.flights.add(new Flight(Flight_name, Flight_ID, capacity, capacity, depTime, arrivalTime, origin, destination, desc, price_F, price_E, Date));
        Flight.writeFlights(a.flights);

    }

    public static void writeFlights(ArrayList<Flight> flights) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("src/flights.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileWriter);
            outputStream.writeObject(flights);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Flight> readFlights() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("src/flights.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        var flights = (ArrayList<Flight>) objectIn.readObject();
        return flights;
    }

}
