package flight;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable{
    
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phone_Number;
    private Account account;

    public Person() {

    }

    public Person(String name, int age, String gender, String email, String phone_Number, Account account) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone_Number = phone_Number;
        this.account = account;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public void setAccount(Account a) {
        account = a;
    }

    public Account getAccount() {
        return account;
    }
     public boolean notExists(Access a, String username) {
        for (int i = 0; i < a.people.size(); i++) {
            if (a.people.get(i).getAccount().getUsername().equals(username)) {

                return false;
            }

        }
        return true;

    }
      public boolean alreadyExists(Access a, String username, String uname) {

        if (username.equals(uname)) {
            return true;
        } else {
            for (int i = 0; i < a.people.size(); i++) {
                if (a.people.get(i).getAccount().getUsername().equals(username) && !a.people.get(i).getAccount().getUsername().equals(uname)) {

                    return false;
                }

            }
            return true;

        }
    }
      public Person login(Access a,String username, String pass) {
        for (int i = 0; i < a.people.size(); i++) {
            if (a.people.get(i).getAccount().getUsername().equals(username) && a.people.get(i).getAccount().getPassword().equals(pass)) {

                return a.people.get(i);
            }

        }
        return null;

    }
    
 public static void writePeople(ArrayList<Person> people) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("src/people.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileWriter);
            outputStream.writeObject(people);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Person> readPeople() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("src/people.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        var people = (ArrayList<Person>) objectIn.readObject();
        return people;
    }
}
