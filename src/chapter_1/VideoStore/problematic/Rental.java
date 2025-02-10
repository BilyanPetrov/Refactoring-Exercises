package chapter_1.VideoStore.problematic;

/**
 * The Rental class represents a rental of a movie for a specified number of days.
 */
class Rental {

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
}
