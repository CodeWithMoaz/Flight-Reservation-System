package flight;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

//Account a;


public class Account implements Serializable{

    private String username;
    private String password;
    static private int noofacc;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        noofacc++;
        
    }
 public static int getnoofacc() {
        return noofacc;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    

    public static void writeAccounts(ArrayList<Account> accounts) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("src/accounts.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileWriter);
            outputStream.writeObject(accounts);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Account> readAccounts() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("src/accounts.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        var accounts = (ArrayList<Account>) objectIn.readObject();
        return accounts;
    }
}
