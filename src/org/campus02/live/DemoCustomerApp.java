package org.campus02.live;

public class DemoCustomerApp {
    public static void main(String[] args) {
        // Neue Addresse
        Address a = new Address("Musterstraße 1", "8010", "Graz", "AT");
        System.out.println("a.toString() = " + a.toString());

        // Neuen Customer
        Customer c = new Customer("Susi", "Sorglos", 123);
        c.addAddress(a);
        System.out.println("c.toString() = " + c.toString());
        c.doSomething();

    }
}
