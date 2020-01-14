
package inheritance;

import java.util.LinkedList;


public class Restaurant {

    private String name;
    private int price;
    private int stars;
    LinkedList<Review> linked_Reviews;

    public class Review
    {
        private String body;
        private String author;
        private int stars;

        public Review(String body, String author, int stars) {
            this.body = body;
            this.author = author;
            this.stars = stars;
        }

        public String toString()
        {
            String returnString = "";
            for(int i = 0; i < this.stars; i++) {
                returnString += "*";
            }

            return returnString + " " + body + " Created by: " + author + ".";
        }
    }

    public Restaurant(String name, int price) {
        this.name = name;
        this.price = price;
        this.stars = 0;
        this.linked_Reviews = new LinkedList<>();
    }

    public void addReview(Review review)
    {
        linked_Reviews.add(review);
        int total = 0;
        for(Review review : linked_Reviews)
        {
            total += review.stars;
        }
        this.stars = total / linked_Reviews.size();
    }


    public String toString()
    {
        String reviews = "";
        for(Review review : linked_Reviews) {
            reviews += review.toString();
        }
        return name + ": Price:" + price + ", Stars:" + stars + "\n" + "Reviews: " + reviews;
    }
}