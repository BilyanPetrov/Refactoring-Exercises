package chapter_1.VideoStore.iteration_3;

import chapter_1.VideoStore.initial.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Customer class.
 */
public class CustomerTest {

    @Test
    public void testHtmlStatementNoRentals() {
        Customer customer = new Customer("John Doe");
        String expectedStatement = "<H1>Rentals for <EM>John Doe</EM></H1><P>\n" +
                "<P>You owe <EM>0.0</EM><P>\n" +
                "On this rental you earned <EM>0</EM> frequent renter points<P>";
        assertEquals(expectedStatement, customer.htmlStatement());
    }

    @Test
    public void testHtmlStatementWithRegularMovie() {
        Customer customer = new Customer("John Doe");
        Movie movie = new Movie("Regular Movie", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String expectedStatement = "<H1>Rentals for <EM>John Doe</EM></H1><P>\n" +
                "Regular Movie: 3.5<BR>\n" +
                "<P>You owe <EM>3.5</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>";
        assertEquals(expectedStatement, customer.htmlStatement());
    }

    @Test
    public void testHtmlStatementWithNewReleaseMovie() {
        Customer customer = new Customer("John Doe");
        Movie movie = new Movie("New Release Movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String expectedStatement = "<H1>Rentals for <EM>John Doe</EM></H1><P>\n" +
                "New Release Movie: 6.0<BR>\n" +
                "<P>You owe <EM>6.0</EM><P>\n" +
                "On this rental you earned <EM>2</EM> frequent renter points<P>";
        assertEquals(expectedStatement, customer.htmlStatement());
    }

    @Test
    public void testHtmlStatementWithChildrensMovie() {
        Customer customer = new Customer("John Doe");
        Movie movie = new Movie("Children's Movie", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);
        customer.addRental(rental);

        String expectedStatement = "<H1>Rentals for <EM>John Doe</EM></H1><P>\n" +
                "Children's Movie: 3.0<BR>\n" +
                "<P>You owe <EM>3.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>";
        assertEquals(expectedStatement, customer.htmlStatement());
    }

    @Test
    public void testHtmlStatementWithMultipleRentals() {
        Customer customer = new Customer("John Doe");
        Movie regularMovie = new Movie("Regular Movie", Movie.REGULAR);
        Movie newReleaseMovie = new Movie("New Release Movie", Movie.NEW_RELEASE);
        Movie childrensMovie = new Movie("Children's Movie", Movie.CHILDRENS);

        Rental rental1 = new Rental(regularMovie, 3);
        Rental rental2 = new Rental(newReleaseMovie, 2);
        Rental rental3 = new Rental(childrensMovie, 4);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        String expectedStatement = "<H1>Rentals for <EM>John Doe</EM></H1><P>\n" +
                "Regular Movie: 3.5<BR>\n" +
                "New Release Movie: 6.0<BR>\n" +
                "Children's Movie: 3.0<BR>\n" +
                "<P>You owe <EM>12.5</EM><P>\n" +
                "On this rental you earned <EM>4</EM> frequent renter points<P>";
        assertEquals(expectedStatement, customer.htmlStatement());
    }

    @Test
    public void testStatementNoRentals() {
        Customer customer = new Customer("John Doe");
        String expectedStatement = "Rental Record for John Doe\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";
        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void testStatementWithRegularMovie() {
        Customer customer = new Customer("John Doe");
        Movie movie = new Movie("Regular Movie", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String expectedStatement = "Rental Record for John Doe\n" +
                "\tRegular Movie\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";
        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void testStatementWithNewReleaseMovie() {
        Customer customer = new Customer("John Doe");
        Movie movie = new Movie("New Release Movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String expectedStatement = "Rental Record for John Doe\n" +
                "\tNew Release Movie\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points";
        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void testStatementWithChildrensMovie() {
        Customer customer = new Customer("John Doe");
        Movie movie = new Movie("Children's Movie", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);
        customer.addRental(rental);

        String expectedStatement = "Rental Record for John Doe\n" +
                "\tChildren's Movie\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";
        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void testStatementWithMultipleRentals() {
        Customer customer = new Customer("John Doe");
        Movie regularMovie = new Movie("Regular Movie", Movie.REGULAR);
        Movie newReleaseMovie = new Movie("New Release Movie", Movie.NEW_RELEASE);
        Movie childrensMovie = new Movie("Children's Movie", Movie.CHILDRENS);

        Rental rental1 = new Rental(regularMovie, 3);
        Rental rental2 = new Rental(newReleaseMovie, 2);
        Rental rental3 = new Rental(childrensMovie, 4);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        String expectedStatement = "Rental Record for John Doe\n" +
                "\tRegular Movie\t3.5\n" +
                "\tNew Release Movie\t6.0\n" +
                "\tChildren's Movie\t3.0\n" +
                "Amount owed is 12.5\n" +
                "You earned 4 frequent renter points";
        assertEquals(expectedStatement, customer.statement());
    }
}