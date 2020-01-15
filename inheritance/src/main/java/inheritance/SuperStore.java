package inheritance;

import java.util.LinkedList;

public class SuperStore
{
    public String name;
    public int stars;
    public static int price_Category;
    LinkedList<Review> review_List = new LinkedList<>();

    public SuperStore(String name, int stars, int price_Category)
    {
        this.name = name;
        this.stars = stars;
        this.price_Category = price_Category;
    }

    public void addReview(Review review)
    {
        review_List.add(review);

        double star_Count = 0;
        double average = 0;

        for(Review reviews : review_List)
        {
            star_Count += review.stars;
        }
        average = star_Count / review_List.size();
        this.stars = (int)average;
        //return (int)average;
    }
}
