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
public class Payment implements Serializable {

    private int payment_id;

    private String payment_meth;

    private Reservation reservation;

    public Payment() {
    }

    public Payment(int payment_id, String payment_meth, Reservation r) {
        this.payment_id = payment_id;

        this.payment_meth = payment_meth;
        this.reservation = r;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_meth() {
        return payment_meth;
    }

    public void setPayment_meth(String payment_meth) {
        this.payment_meth = payment_meth;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
     Reservation makePayment(Access a,Passenger p, Flight f,int q) {

        Reservation nb = new Reservation(a.reservations.size()+1, p,f,q);

        a.reservations.add(nb);
        
        Reservation.writeReservations(a.reservations);
        
        return a.reservations.get(a.reservations.size() - 1);
    }

    public boolean checkCvv(String cv) {
        boolean check = false;

        if (cv.length() == 3) {

            check = true;
        }
        return check;
    }

    public boolean checkCredit_num(String num) {
        boolean check = false;

        if (num.length() == 16) {

            check = true;
        }
        return check;
    }
 public static void writePayments(ArrayList<Payment> payments) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("src/payments.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileWriter);
            outputStream.writeObject(payments);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Payment> readPayments() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("src/payments.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        var payments = (ArrayList<Payment>) objectIn.readObject();
        return payments;
    }
}
