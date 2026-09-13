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
public class Update_FLight extends Access {

    Flight f=new Flight();
    
    public void updateflight(Access a, Flight f, String FlightNam, int flightID, int capacity, String depTime, String arrivalTime, String origin, String destination) throws IOException, ClassNotFoundException {
       f.updateflight(a, f, FlightNam, flightID, capacity, depTime, arrivalTime, origin, destination);
    }

    public boolean alreadyExists(Access a, int fID, int fid) {

      return f.alreadyExists(a, fid, fid);
    }

    public boolean Exists(Access a, int fID) {
       return f.Exists(a, fID);
    }
}
