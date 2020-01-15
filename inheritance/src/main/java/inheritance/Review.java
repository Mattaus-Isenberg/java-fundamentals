package inheritance;

public class Review
{
    public int stars;
    public String body;
    public String author;
    public  Restaurant restaurant;
    public Shop shop;
    public Theater theater;
    public String movie;

    public Review(String body, String author, int stars)
    {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(Restaurant restaurant, String body, String author, int stars) {
        this.restaurant = restaurant;
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(Shop shop, String body, String author, int stars) {
        this.shop = shop;
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(Theater theater, String movie, String body, String author, int stars) {
        this.theater = theater;
        this.movie = movie;
        this.body = body;
        this.author = author;
        this.stars = stars;
    }



    public String toString()
    {
        String returnString = "";
        String movieString;
        for(int i = 0; i < this.stars; i++)
        {
            returnString += "*";
        }
        if(movie == null)
        {
            movieString = "";
        }
        else
            {
                movieString = " Movie: " + movie;
            }

        return returnString + " " + body + " Written by: " + author + "." + movieString + "\n";

    }
}

