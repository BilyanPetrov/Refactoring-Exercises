package chapter_1.VideoStore.iteration_3;

import java.util.Enumeration;
import java.util.Vector;

/**
 * The Customer class represents a customer with a name and a list of rentals.
 */
public class Customer {

    private String _name; // The name of the customer
    private Vector<Rental> _rentals = new Vector(); // The list of rentals for the customer

    /**
     * Constructs a new Customer object with the specified name.
     *
     * @param name the name of the customer
     */
    public Customer(String name) {
        _name = name;
    }

    /**
     * Adds a rental to the customer's list of rentals.
     *
     * @param arg the rental to add
     */
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    /**
     * Gets the name of the customer.
     *
     * @return the name of the customer
     */
    public String getName() {
        return _name;
    }

    /**
     * Generates a statement for the customer, detailing the rentals, total amount owed,
     * and frequent renter points earned.
     *
     * @return a statement for the customer
     */
    public String statement() {
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        // Refactored: Replace temp vars assigned within the loop with 2 queries to new methods
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    each.getCharge() + "\n";
        }
        //add footer lines
        result += "Amount owed is " +
                getTotalCharge() + "\n";
        result += "You earned " +
                getTotalFrequentRenterPoints() +
                " frequent renter points";
        return result;
    }

    /**
     * Gets the total charged amount for the customer.
     *
     * @return charge-amount for all rentals.
     */
    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    /**
     * Gets the total frequent renter points for the customer.
     *
     * @return total frequent renter points that this customer has.
     */
    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

}

