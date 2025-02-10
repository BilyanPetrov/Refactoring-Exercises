package chapter_1.VideoStore.initial;

/**
 * The Movie class represents a movie with a title and a price code.
 */
public class Movie {

    // Price codes for different movie categories
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title; // The title of the movie
    private int _priceCode; // The price code of the movie

    /**
     * Constructs a new Movie object with the specified title and price code.
     *
     * @param title     the title of the movie
     * @param priceCode the price code of the movie
     */
    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    /**
     * Gets the price code of the movie.
     *
     * @return the price code of the movie
     */
    public int getPriceCode() {
        return _priceCode;
    }

    /**
     * Sets the price code of the movie.
     *
     * @param arg the new price code of the movie
     */
    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    /**
     * Gets the title of the movie.
     *
     * @return the title of the movie
     */
    public String getTitle() {
        return _title;
    }
}
