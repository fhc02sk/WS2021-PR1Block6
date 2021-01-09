package org.campus02.live;
import java.util.ArrayList;

// Customer is-a Person
public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses;// = new ArrayList<>();

    public Customer(String firstname, String lastname, int customerNumber) {
        super(firstname, lastname);
        this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                ", firstname='" + firstname + '\'' +
                ", firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                '}';
    }

    @Override
    public void doSomething() {
        System.out.println("customerNumber = " + customerNumber);
        super.doSomething();
    }
    
}
