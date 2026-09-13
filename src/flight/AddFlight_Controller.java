/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class AddFlight_Controller extends Access {

    Flight f = new Flight();

    public void addFlight(Access a, String Flight_name, int Flight_ID, int capacity, String desc, int price_F, int price_E, String origin, String destination, String Date, String depTime, String arrivalTime) throws IOException, ClassNotFoundException {
        f.addFlight(a, Flight_name, Flight_ID, capacity, desc, price_F, price_E, origin, destination, Date, depTime, arrivalTime);
    }
}
