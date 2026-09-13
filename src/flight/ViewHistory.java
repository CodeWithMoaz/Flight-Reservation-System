/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ViewHistory extends Access {

    Reservation r = new Reservation();
    Feedback f = new Feedback();

    public ArrayList<Reservation> searchReservation(Access a, Passenger p) {
        return r.searchReservation(a, p);
    }

    public boolean hasReservation(Access a, Passenger p) {
        return r.hasReservation(a, p);
    }

    public ArrayList<Feedback> searchFeedback(Access a, Passenger p) {
        return f.searchFeedback(a, p);

    }

    public boolean hasFeedback(Access a, Reservation r) {

        return f.hasFeedback(a, r);

    }

}
