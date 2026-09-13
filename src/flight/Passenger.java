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
public class Passenger extends Person implements Serializable {

    private int passport_num;

    private Person ps;

    public Passenger() {
    }

    public Passenger(int passport_num, Reservation r, Person ps) {
        super(ps.getName(), ps.getAge(), ps.getGender(), ps.getEmail(), ps.getPhone_Number(), ps.getAccount());

        this.ps = ps;
        this.passport_num = passport_num;

    }

    public Passenger(int passport_num, Person ps) {
        super(ps.getName(), ps.getAge(), ps.getGender(), ps.getEmail(), ps.getPhone_Number(), ps.getAccount());

        this.ps = ps;
        this.passport_num = passport_num;

    }

    public Person getPs() {
        return ps;
    }

    public void setPs(Person ps) {
        this.ps = ps;
    }

    public int getPassport_num() {
        return passport_num;
    }

    public void setPassport_num(int passport_num) {
        this.passport_num = passport_num;
    }

    public void addPassenger(Access a, Passenger p) throws IOException, ClassNotFoundException {

        a.people.add(p.getPs());
        a.accounts.add(p.getPs().getAccount());
        a.passengers.add(p);

        Account.writeAccounts(a.accounts);

        Person.writePeople(a.people);

        Passenger.writePassenger(a.passengers);

    }

     public Passenger manageAccount(Access a, Passenger p, String name, int age, String gender, String email, String phone, int Pid, String username, String pass) throws IOException, ClassNotFoundException {
        for (int i = 0; i < a.people.size(); i++) {
            if (a.people.get(i).getAccount().getUsername().equals(p.getAccount().getUsername())) {

                a.people.get(i).setName(name);
                a.people.get(i).setAge(i);
                a.people.get(i).setGender(gender);
                a.people.get(i).setEmail(email);
                a.people.get(i).setPhone_Number(phone);
                a.people.get(i).getAccount().setUsername(username);
                a.people.get(i).getAccount().setPassword(pass);

                Account.writeAccounts(a.accounts);

                Person.writePeople(a.people);

                p.setName(name);
                p.setAge(age);
                p.setGender(gender);
                p.setEmail(email);
                p.setPhone_Number(phone);
                p.setPassport_num(Pid);
                p.getAccount().setUsername(username);
                p.getAccount().setPassword(pass);

                Passenger.writePassenger(a.passengers);
                return p;
            }
        }

        return p;

    }
    public Passenger ifPassenger(Access a, String u, String p) {

        for (int i = 0; i < a.passengers.size(); i++) {
            if (a.passengers.get(i).getAccount().getUsername().equals(u)) {

                return a.passengers.get(i);
            }
        }

        return null;

    }

    public static void writePassenger(ArrayList<Passenger> passengers) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("src/passengers.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileWriter);
            outputStream.writeObject(passengers);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Passenger> readPassenger() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("src/passengers.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        var passengers = (ArrayList<Passenger>) objectIn.readObject();
        return passengers;
    }
}
