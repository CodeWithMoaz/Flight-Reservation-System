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
public class Feedback implements Serializable {

    private int feedback_id;
    private String status;
    private int rating;
    private Reservation reservation;

    public Feedback() {
    }

    public Feedback(int feedback_id, String status, int rating, Reservation reservation) {
        this.feedback_id = feedback_id;
        this.status = status;
        this.rating = rating;
        this.reservation = reservation;
    }

    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public void addFeedback(Access a, Feedback f) throws ClassNotFoundException, IOException {
        a.feedbacks.add(f);

        Feedback.writeFeedbacks(a.feedbacks);

    }

    public Feedback searchFeedback(Access a, Reservation r) {

        for (int i = 0; i < a.feedbacks.size(); i++) {
            if (a.feedbacks.get(i).getReservation().getReservation_ID() == r.getReservation_ID()) {
                return a.feedbacks.get(i);
            }
        }

        return null;
    }

    public ArrayList<Feedback> searchFeedback(Access a, Passenger p) {

        ArrayList<Feedback> b = new ArrayList<>();

        for (int i = 0; i < a.feedbacks.size(); i++) {
            if (p.getAccount().getUsername().equals(a.feedbacks.get(i).getReservation().getPassenger().getAccount().getUsername())) {
                b.add(a.feedbacks.get(i));
            }
        }

        return b;

    }

    public boolean hasFeedback(Access a, Reservation r) {

        for (int i = 0; i < a.feedbacks.size(); i++) {
            if (r.getReservation_ID() == a.feedbacks.get(i).getReservation().getReservation_ID()) {
                return true;
            }
        }

        return false;

    }

    public void updateFeedback(Access a, int id, String status, int rating) throws IOException, ClassNotFoundException {

        for (int i = 0; i < a.feedbacks.size(); i++) {
            if (a.feedbacks.get(i).getReservation().getReservation_ID() == id) {

                a.feedbacks.get(i).setRating(rating);
                a.feedbacks.get(i).setStatus(status);

                Feedback.writeFeedbacks(a.feedbacks);
            }

        }
    }

    public static void writeFeedbacks(ArrayList<Feedback> feedbacks) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("src/feedbacks.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileWriter);
            outputStream.writeObject(feedbacks);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Feedback> readFeedbacks() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("src/feedbacks.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        var feedbacks = (ArrayList<Feedback>) objectIn.readObject();
        return feedbacks;
    }
}
