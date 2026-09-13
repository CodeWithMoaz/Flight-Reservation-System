/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Reservation implements Serializable {

    private int Reservation_ID;
    private Passenger passenger;
    private Flight flight;
    private int quantity;

    public Reservation() {
    }

    public Reservation(int Reservation_ID, Passenger passenger, Flight flight, int quantity) {
        this.Reservation_ID = Reservation_ID;
        this.passenger = passenger;
        this.flight = flight;
        this.quantity = quantity;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setReservation_ID(int Reservation_ID) {
        this.Reservation_ID = Reservation_ID;
    }

    public int getReservation_ID() {
        return Reservation_ID;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public boolean hasReservation(Access a, Passenger p) {

        for (int i = 0; i < a.reservations.size(); i++) {
            if (p.getAccount().getUsername().equals(a.reservations.get(i).getPassenger().getAccount().getUsername())) {
                return true;
            }
        }

        return false;

    }

    public ArrayList<Reservation> searchReservation(Access a, Passenger p) {

        ArrayList<Reservation> b = new ArrayList<>();

        for (int i = 0; i < a.reservations.size(); i++) {
            if (p.getAccount().getUsername().equals(a.reservations.get(i).getPassenger().getAccount().getUsername())) {
                b.add(a.reservations.get(i));
            }
        }

        return b;

    }

    public Reservation searchReservation(Access a, int rid) {

        for (int i = 0; i < a.reservations.size(); i++) {
            if (a.reservations.get(i).getReservation_ID() == rid) {
                return a.reservations.get(i);
            }
        }

        return null;
    }

    public static void writeReservations(ArrayList<Reservation> reservations) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("src/reservations.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileWriter);
            outputStream.writeObject(reservations);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Reservation> readReservations() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("src/reservations.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        var reservations = (ArrayList<Reservation>) objectIn.readObject();
        return reservations;
    }
}
