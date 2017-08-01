package sigit.bookfirebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sigit on 25/07/17.
 */

public class BookList extends ArrayAdapter<Book> {

    private Activity context;
    List<Book> books;

    public BookList(Activity context, List<Book> books){
        super(context, R.layout.author_list, books);
        this.context = context;
        this.books = books;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.author_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewRating = (TextView) listViewItem.findViewById(R.id.textViewGenre);

        Book book = books.get(position);
        textViewName.setText(book.getBookName());
        textViewRating.setText(String.valueOf(book.getRating()));

        return listViewItem;
    }

}

