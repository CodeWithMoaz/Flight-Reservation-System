/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class UpdateAccount extends Access {

    Person p = new Person();
    Passenger pp = new Passenger();

    public int getPassport_num() {
        return pp.getPassport_num();
    }

    public String getName(Passenger p) {
        return p.getName();
    }

    public void setName(String name) {
        p.setName(name);
    }

    public int getAge(Passenger p) {
        return p.getAge();
    }

    public void setAge(int age) {
        p.setAge(age);
    }

    public String getGender(Passenger p) {
        return p.getGender();
    }

    public void setGender(String gender) {
        p.setGender(gender);
    }

    public String getEmail(Passenger p) {
        return p.getEmail();
    }

    public void setEmail(String email) {
        p.setEmail(email);
    }

    public String getPhone_Number(Passenger p) {
        return p.getPhone_Number();
    }

    public void setPhone_Number(String phone_Number) {
        p.getPhone_Number();
    }

    public Account getAccount(Passenger p) {
       return p.getAccount();
    }

    public Passenger manageAccount(Access a, Passenger p, String name, int age, String gender, String email, String phone, int Pid, String username, String pass) throws IOException, ClassNotFoundException {
        return pp.manageAccount(a, p, name, age, gender, email, phone, Pid, username, pass);

    }

    public boolean alreadyExists(Access a, String username, String uname) {

        return p.alreadyExists(a, username, uname);
    }

}
