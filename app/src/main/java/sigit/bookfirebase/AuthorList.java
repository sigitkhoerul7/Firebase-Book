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

public class AuthorList extends ArrayAdapter<Author> {
    private Activity context;
    List<Author> authors;

    public AuthorList(Activity context, List<Author>authors){
        super(context, R.layout.author_list, authors);
        this.context = context;
        this.authors = authors;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.author_list, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewGenre = (TextView) listViewItem.findViewById(R.id.textViewGenre);

        Author author = authors.get(position);
        textViewName.setText(author.getAuthorName());
        textViewGenre.setText(author.getAuthrGenre());

        return listViewItem;
    }
}
