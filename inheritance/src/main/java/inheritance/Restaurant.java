
package inheritance;

public class Restaurant extends SuperStore
{

    public Restaurant(String name, int price)
    {
        super(name, 0, price);
    }

    public String toString()
    {
        String reviews = "";
        for(Review review : super.review_List)
        {
            reviews += review.toString();
        }
        return name + ": Price: " + price_Category + ", Stars: " + stars + "\n" + "Reviews: " + reviews;
    }
}