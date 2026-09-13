package flight;

import java.util.ArrayList;

public class Access {

    Person p = new Person();
    Passenger pp = new Passenger();
    Employee ee=new Employee();

    ArrayList<Account> accounts;
    ArrayList<Person> people;
    ArrayList<Passenger> passengers;
    ArrayList<Employee> employees;
    ArrayList<Flight> flights;
    ArrayList<Reservation> reservations;
    ArrayList<Payment> payments;
    ArrayList<Feedback> feedbacks;

    public Access() {

        accounts = new ArrayList<>();
        accounts.add(new Account("Moaz1", "momo"));
        accounts.add(new Account("Kareem1", "koko"));
        accounts.add(new Account("Ahmad1", "aoao"));
        accounts.add(new Account("Ibrahim1", "ioio"));
        accounts.add(new Account("Nour1", "nono"));
        accounts.add(new Account("Yassin1", "yoyo"));

        people = new ArrayList<>();
        people.add(new Person("Moaz", 20, "Male", "Moaz@gmail.com", "01008896758", (Account) accounts.get(0)));
        people.add(new Person("Kareem", 21, "Male", "Kareem@gmail.com", "0100125832", (Account) accounts.get(1)));
        people.add(new Person("Ahmad", 22, "Male", "Ahmad@gmail.com", "01008929522", (Account) accounts.get(2)));
        people.add(new Person("Ibrahim", 20, "Male", "Ibrahim@gmail.com", "01008891238", (Account) accounts.get(3)));
        people.add(new Person("Nour", 20, "Female", "Nour@gmail.com", "01285884433", (Account) accounts.get(4)));
        people.add(new Person("Yassin", 20, "Male", "Yassin@gmail.com", "01778899112", (Account) accounts.get(5)));

        employees = new ArrayList<>();
        employees.add(new Employee(1, "3 Years Experience ", 4000.00, people.get(3)));    //Ibrahim1
        employees.add(new Employee(1, "2 Years Experience  ", 5500.00, people.get(4)));   //Nour1
        employees.add(new Employee(1, "5 Years Experience  ", 7500.00, people.get(5)));  //Yassin1

        passengers = new ArrayList<>();
        passengers.add(new Passenger(787878, people.get(0)));
        passengers.add(new Passenger(123123, people.get(1)));
        passengers.add(new Passenger(343343, people.get(2)));

        flights = new ArrayList<>();
        flights.add(new Flight("bika", 121, 150, 150, "6;00AM", "9;00AM", "Dubai", "Egypt", "Egypt is the best country", 200, 100, "11/5"));
        flights.add(new Flight("te5a", 122, 20, 20, "2;00PM", "9;00AM", "India", "Saudi Arabia", "Saudi the 2nd best country", 300, 200, "5/3"));
        flights.add(new Flight("bolbol", 123, 10, 20, "2;00PM", "9;00AM", "India", "Saudi Arabia", "Saudi the 2nd best country", 300, 200, "6/7"));

        reservations = new ArrayList<>();

        reservations.add(new Reservation(1, passengers.get(0), flights.get(0), 3));
        reservations.add(new Reservation(2, passengers.get(0), flights.get(1), 2));
        reservations.add(new Reservation(3, passengers.get(1), flights.get(0), 4));
        reservations.add(new Reservation(4, passengers.get(2), flights.get(1), 1));

        payments = new ArrayList<>();

        payments.add(new Payment(1, "Cash", reservations.get(0)));
        payments.add(new Payment(2, "Visa", reservations.get(1)));
        payments.add(new Payment(3, "Visa", reservations.get(2)));
        payments.add(new Payment(4, "Cash", reservations.get(3)));

        feedbacks = new ArrayList<>();
        feedbacks.add(new Feedback(1, "It Was Amazing!", 5, reservations.get(0)));
        feedbacks.add(new Feedback(1, "It Was cool!", 3, reservations.get(1)));
        feedbacks.add(new Feedback(1, "I didn't like it.", 1, reservations.get(2)));
    }

    public Person login(Access a, String username, String pass) {
        return p.login(a, username, pass);
    }

    public Passenger ifPassenger(Access a, String u, String p) {
        return pp.ifPassenger(a, u, p);
    }

    public Employee ifEmployee(Access a,String u, String p) {

       return  ee.ifEmployee(a, u, p);

    }

}
