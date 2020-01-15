package inheritance;

public class Shop extends SuperStore
{
    private String description;


    public Shop(String name, String description, int price)
    {
        super(name, 0, price);
        this.description = description;
    }

    @Override
    public String toString()
    {
        String reviews = "";
        for(Review review : super.review_List)
        {
            reviews += review.toString();
        }
        return name + " " + description + ", Stars: " + stars + "\n" + "Reviews: " + reviews + "\n";
    }
}
