/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

/**
 *
 * @author 20111
 */
public class BookingControl extends Access {

    Flight f=new Flight();
    
    public boolean checkSeat(Flight f, int n) {
       return f.checkSeat(f, n);
        
    }

    public boolean bookSeat(Flight f, int n) {
       return f.bookSeat(f, n);

    }

    public int BookingPriceE(Flight f) {
       return f.BookingPriceE(f);
    }

    public int BookingPriceF(Flight f) {
       return f.BookingPriceF(f);
    }

}
