
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;
    private int mins;
    private int hours;
    private String hourString;
    private String minString;
    private int inttostringm;
    private int inttostringh;
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        duration = 0;
    }
    //duration
    public void setDuration(int duration2) {
         duration = duration2;
    }
    public String getDuration() {
        inttostringh = duration / 60;
        inttostringm = duration % 60;
        hourString = Integer.toString(inttostringh);
        minString = Integer.toString(inttostringm);
        return hourString + ":" + minString;
    }
    //titile
    public void setTitle(String title2) {
        title = title2;
    }
    public String getTitle() {
        return title;
    }
    //rating
    public void setRating(int rating2) {
        rating = rating2;
    }
    public int getRating() {
        return rating;
    }
}
