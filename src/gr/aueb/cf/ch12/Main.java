package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Ioannis", "Ntakoumis");
        User user = new User(1, "Xrysostomos", "Dionisiou", "cmask", "152896", true);
        User user2 = new User(2, "Alice", "W.", "alicew", "156896", false);
        Customer customer = new Customer(1, "Andrew", "Dimitriou", "076543289", "6981564084", "West Attica", "Attica", "Athens", "Patission", "76", "10434");
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.5, "Meat", "Ordered");

        System.out.println("Teacher full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer vat: " + customer.getVatRegistrationNo());
        System.out.println("Order Formatted Timestamp: " + order.getFormattedTimestamp());
        System.out.printf("Point: {%d, %d }\n", point.getX(), point.getY());
    }
}
