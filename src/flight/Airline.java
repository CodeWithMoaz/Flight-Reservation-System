package flight;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class Airline {

    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        Access a = new Access();

        ArrayList<Account> accs;
        accs = a.accounts;
        Account.writeAccounts(accs);

        ArrayList<Person> po;
        po = a.people;
        Person.writePeople(po);

        ArrayList<Passenger> ps;
        ps = a.passengers;
        Passenger.writePassenger(ps);

        ArrayList<Feedback> fbs;
        fbs = a.feedbacks;
        Feedback.writeFeedbacks(fbs);

        ArrayList<Employee> emps;
        emps = a.employees;
        Employee.writeEmployees(emps);

        ArrayList<Flight> fls;
        fls = a.flights;
        Flight.writeFlights(fls);

        ArrayList<Reservation> rvs;
        rvs = a.reservations;
        Reservation.writeReservations(rvs);

        ArrayList<Payment> pays;
        pays = a.payments;
        Payment.writePayments(pays);

        Login_Frame lf = new Login_Frame();
        Flight_Intro gf = new Flight_Intro();
        gf.setVisible(true);
        Thread.sleep(100);
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(40);
            gf.ProgressBar.setValue(i);

            if (i % 2 == 0) {

            } else {

            }

            if (i == 100) {
                Thread.sleep(900);
                lf.setVisible(true);
                gf.dispose();

            }
        }

        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer: ");
        number = input.nextInt();
        if (number != 7) {
            System.out.print("Welcome %n%s%n");
        }
        if ((number % 5) == 0) {
            System.out.println("To Java Programming");
        }
    }
}
