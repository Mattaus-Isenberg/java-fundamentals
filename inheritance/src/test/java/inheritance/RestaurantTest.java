package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString() {
        Restaurant rest = new Restaurant("Sucky Restaurant",10);
        Review rev = new Review("Place Sucks", "Me", 2);
        rest.addReview(rev);

        System.out.println(rest);
    }
}