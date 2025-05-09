package chapter_1.VideoStore.iteration_3;

import chapter_1.VideoStore.initial.Movie;

/**
 * The Rental class represents a rental of a movie for a specified number of days.
 */
public class Rental {

    private Movie _movie; // The movie being rented
    private int _daysRented; // The number of days the movie is rented for

    /**
     * Constructs a new Rental object with the specified movie and number of days rented.
     *
     * @param movie      the movie being rented
     * @param daysRented the number of days the movie is rented for
     */
    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    /**
     * Gets the number of days the movie is rented for.
     *
     * @return the number of days the movie is rented for
     */
    public int getDaysRented() {
        return _daysRented;
    }

    /**
     * Gets the movie being rented.
     *
     * @return the movie being rented
     */
    public Movie getMovie() {
        return _movie;
    }

    // Refactored: Move Method - moved charge calculations from Customer.amountFor into this.getCharge method below

    /**
     * Calculates the total charge for the rental based on the movie's price code and days rented.
     *
     * @return The total charge for the rental.
     */
    double getCharge() {
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
    }

    int getFrequentRenterPoints() {
        // Base frequent renter points
        int result = 1;
        // add bonus for a two-day new release rental
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1) {
            result++;
        }
        return result;
    }
}
