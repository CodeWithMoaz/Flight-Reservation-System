/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

import flight.Access;
import flight.Flight;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class viewTopRecords_controller {
    
ArrayList<Flight> getFlights(Access a, Flight f) {

        ArrayList<Flight> ff = new ArrayList<>();

        for (int i = 0; i < a.flights.size(); i++) {

            if (a.flights.get(i).getFlightID() == f.getFlightID()) {
                ff.add(f);
            }
        }
        return ff;
    }    

Flight getFlights(Access a, int f) {


        for (int i = 0; i < a.flights.size(); i++) {

            if (a.flights.get(i).getFlightID()==f) {
                return a.flights.get(i);
            }
        }
        return null;
    }    
}
