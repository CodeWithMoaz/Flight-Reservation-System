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
public class AddAccount extends Access {
Person p=new Person();
Passenger pp=new Passenger();

    public boolean notExists(Access a, String username) {
       return p.notExists(a, username);
    }

    public void addPassenger(Access a, Passenger p) throws IOException, ClassNotFoundException {

        pp.addPassenger(a, p);

    }

}
