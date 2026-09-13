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
public class AddFeedback {

    Reservation r = new Reservation();
    Feedback f=new Feedback();
   
    
     public String getName(Person p) {
       return p.getName();
    }
    
    public ArrayList<Reservation> searchReservation(Access a, Passenger p) {

        return r.searchReservation(a, p);

    }

    public void addFeedback(Access a, Feedback f) throws ClassNotFoundException, IOException {
        f.addFeedback(a, f);
    }

    public Reservation searchReservation(Access a, int rid) {

        return r.searchReservation(a, rid);
    }

    public Feedback searchFeedback(Access a, Reservation r) {

      return f.searchFeedback(a, r);
    }

    public void updateFeedback(Access a, int id, String status, int rating) throws IOException, ClassNotFoundException {

        f.updateFeedback(a, id, status, rating);
    }
}
