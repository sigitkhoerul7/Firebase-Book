package sigit.bookfirebase;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by sigit on 25/07/17.
 */
@IgnoreExtraProperties
public class Author {
    private String authorId;
    private String authorName;
    private String authrGenre;

    public Author(){
        //konstruktor is required
    }

    public Author (String authorId, String authorName, String authrGenre){
            this.authorId = authorId;
            this.authorName =  authorName;
            this.authrGenre = authrGenre;
    }
    public String getAuthorId(){
        return authorId;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getAuthrGenre(){
        return authrGenre;
    }
}
