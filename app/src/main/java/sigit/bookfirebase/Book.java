package sigit.bookfirebase;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by sigit on 25/07/17.
 */
@IgnoreExtraProperties
public class Book {
    private String id;
    private String bookName;
    private int rating;

    public Book(){

    }
    public Book(String id, String bookName, int  rating){
        this.id = id;
        this.bookName= bookName;
        this.rating = rating;

    }
    public String getBookName(){
        return bookName;
    }
    public int getRating(){
        return rating;
    }
}
