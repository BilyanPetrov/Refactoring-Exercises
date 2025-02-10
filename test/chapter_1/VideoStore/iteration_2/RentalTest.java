package chapter_1.VideoStore.iteration_2;

import chapter_1.VideoStore.initial.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Rental class.
 */
public class RentalTest {

    @Test
    void testGetChargeForRegularMovie() {
        Movie movie = new Movie("Regular Movie", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);

        double expectedCharge = 3.5; // 2 + (3 - 2) * 1.5
        assertEquals(expectedCharge, rental.getCharge());
    }

    @Test
    void testGetChargeForNewReleaseMovie() {
        Movie movie = new Movie("New Release Movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);

        double expectedCharge = 6.0; // 2 * 3
        assertEquals(expectedCharge, rental.getCharge());
    }

    @Test
    void testGetChargeForChildrensMovie() {
        Movie movie = new Movie("Children's Movie", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);

        double expectedCharge = 3.0; // 1.5 + (4 - 3) * 1.5
        assertEquals(expectedCharge, rental.getCharge());
    }

    @Test
    void testGetChargeForShortRegularMovie() {
        Movie movie = new Movie("Short Regular Movie", Movie.REGULAR);
        Rental rental = new Rental(movie, 1);

        double expectedCharge = 2.0; // 2
        assertEquals(expectedCharge, rental.getCharge());
    }

    @Test
    void testGetChargeForShortChildrensMovie() {
        Movie movie = new Movie("Short Children's Movie", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 2);

        double expectedCharge = 1.5; // 1.5
        assertEquals(expectedCharge, rental.getCharge());
    }
}
