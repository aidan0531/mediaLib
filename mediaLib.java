
/**
 * @author me
 */
public class mediaLib
{
    
    public static void Media()
    {
       
        //media
        System.out.println("Welcome to your media library");
        
        
        //song 1
        Song song1 = new Song("purp",9.0,3);
        System.out.println(song1.getTitle());
        System.out.println(song1.getPrice());
        System.out.println(song1.getRating());
        
        //song 2
        Song song2 = new Song("bob the builder",.73,1);
        System.out.println(song2.getTitle());
        System.out.println(song2.getPrice());
        System.out.println(song2.getRating());
        
        //song 3
        Song song3 = new Song("maybe",7.69,16);
        System.out.println(song3.getTitle());
        System.out.println(song3.getPrice());
        System.out.println(song3.getRating());
        
        //math
        System.out.println(song3.getNumSongs() + song1.getNumSongs() + song2.getNumSongs());
        System.out.println(song3.getPrice() + song2.getPrice() + song1.getPrice());
        System.out.println((song3.getPrice() + song2.getPrice() + song1.getPrice())/(song3.getNumSongs() + song1.getNumSongs() + song2.getNumSongs()));
        System.out.println((song3.getRating() + song2.getRating() + song1.getRating())/(song3.getNumSongs() + song1.getNumSongs() + song2.getNumSongs()));
        
    
        //movie 1
        Movie movie1 = new Movie();
        movie1.setTitle("knox college");
        System.out.println(movie1.getTitle());
        movie1.setRating(66);
        System.out.println(movie1.getRating());
        movie1.setDuration(128);
        System.out.println(movie1.getDuration());
        
        //book 1
        Book book1 = new Book();
        book1.setTitle("50 shards of black");
        System.out.println(book1.getTitle());
        book1.setRating(2);
        System.out.println(book1.getRating());
    }
}
