/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

/**
 *
 * @author ibrahim ashraf
 */
public class Payment_C extends Access {

    Payment pp=new Payment();
    Reservation makePayment(Access a,Passenger p, Flight f,int q) {

       return pp.makePayment(a, p, f, q);
    }

    public boolean checkCvv(String cv) {
        return pp.checkCvv(cv);
    }

    public boolean checkCredit_num(String num) {
    return pp.checkCredit_num(num);
    }
}
