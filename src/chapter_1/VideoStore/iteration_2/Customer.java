package chapter_1.VideoStore.iteration_2;

import chapter_1.VideoStore.initial.Movie;

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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two-day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    &&
                    each.getDaysRented() > 1) frequentRenterPoints++;
            //show figures for this rental
            // Refactored: Replace Temp (thisAmount) with Query
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
            totalAmount += each.getCharge();
        }

        //add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

}

