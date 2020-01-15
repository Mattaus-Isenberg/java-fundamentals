package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testToString()
    {
        Theater theater = new Theater("AMC");
        theater.movies_List.add("Rambo");
        theater.movies_List.add("Gremlins");
        theater.movies_List.add("Back To The Future");
        theater.movies_List.add("I Shrunk the Kids");
        theater.movies_List.add("Gattaca");
        Review rev = new Review(theater, "Gremlins", "Sweet movie, clean theater", "me", 5);
        Review rev2 = new Review(theater, "Rambo", "Cool movie, clean theater", "me", 1);

        theater.addReview(rev);
        theater.addReview(rev2);
        System.out.println(theater);
    }
}