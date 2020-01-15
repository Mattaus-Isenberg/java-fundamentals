package inheritance;

import java.util.LinkedList;

public class Theater extends SuperStore
{
    LinkedList<String> movies_List;

    public Theater(String name)
    {
        super(name, 0, price_Category);
        this.movies_List = new LinkedList<>();
    }

    public void add_Movie(String movie)
    {
        movies_List.add(movie);
    }

    public void remove_Movie(String movie)
    {
        movies_List.remove(movie);
    }

    @Override
    public String toString()
    {
        String reviews = "";
        String moviesString = "";
        for(Review review : super.review_List)
        {
            reviews += review.toString();
        }
        for(String movie : movies_List)
        {
            moviesString += movie + ", ";
        }
        return name + ", Stars:" + stars + "\n" + "Reviews: " + reviews + " Movies Playing: " + moviesString + "\n";
    }

}
