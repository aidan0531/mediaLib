
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int rating;
    private String Title;
    public Book()
    {
        // initialise instance variables
        rating = 0;
        Title = "";
    }
    //title
    public void setTitle(String title2) {
        Title = title2;
    }
    public String getTitle() {
        return Title;
    }
    //stars
    public void setRating(int rating2) {
        rating = rating2;
    }
    public int getRating() {
        return rating;
    }
}
