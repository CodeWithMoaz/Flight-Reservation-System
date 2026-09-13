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
public class Employee extends Person implements Serializable {

    private int emp_ID;
    private Person ps;
    private String CV;
    private double salary;

    public Employee() {
    }

    public Employee(int emp_ID, String CV, double salary, Person ps) {
        super(ps.getName(), ps.getAge(), ps.getGender(), ps.getEmail(), ps.getPhone_Number(), ps.getAccount());
        this.emp_ID = emp_ID;
        this.ps = ps;
        this.CV = CV;
        this.salary = salary;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public void setPs(Person ps) {
        this.ps = ps;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getEmp_ID() {
        return emp_ID;
    }

    public Person getPs() {
        return ps;
    }

    public String getCV() {
        return CV;
    }

    public double getSalary() {
        return salary;
    }

    
      public Employee ifEmployee(Access a,String u, String p) {

        for (int i = 0; i < a.employees.size(); i++) {
            if (a.employees.get(i).getAccount().getUsername().equals(u)) {

                return a.employees.get(i);
            }
        }

        return null;

    }
    
    
    
    
    
    
    public static void writeEmployees(ArrayList<Employee> employees) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("src/employees.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileWriter);
            outputStream.writeObject(employees);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Employee> readEmployees() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("src/employees.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        var employees = (ArrayList<Employee>) objectIn.readObject();
        return employees;
    }
}
