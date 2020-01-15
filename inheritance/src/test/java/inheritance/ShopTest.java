package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testToString()
    {
        Shop shop = new Shop("Sucky Shop","Sucky description", 3);
        Review rev = new Review("Place Sucks", "Me", 2);
        shop.addReview(rev);

        System.out.println(shop);
    }
}