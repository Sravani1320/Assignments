package com.example.afinal;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

class CustomAdapterList extends BaseAdapter {

    ArrayList<Movie> moviesarraylist;
    TextView title,ratings,description;
    ImageView imageview;

    public CustomAdapterList(ArrayList<Movie> moviesarraylist) {
        this.moviesarraylist = moviesarraylist;
    }

    @Override
    public int getCount() {
        return moviesarraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return moviesarraylist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private Integer[ ] images = {
            R.drawable.love_aaj_kal,
            R.drawable.gulabo_sitabo,
            R.drawable.panga,
            R.drawable.mrs_serial_killer,
            R.drawable.dil_bechara
    };

    @Override
    public View getView(int position, View rowView, ViewGroup parent) {


        rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_list_item,null);



        title = rowView.findViewById(R.id.moviename);
        ratings = rowView.findViewById(R.id.movierating);
        description = rowView.findViewById(R.id.moviedescription);
        imageview = rowView.findViewById(R.id.imageView);

        Movie moviesarraylist = (Movie) getItem(position);
        title.setText(moviesarraylist.getMovieName());
        ratings.setText(moviesarraylist.getMovieRating());
        description.setText(moviesarraylist.getMovieDescription());
        imageview.setImageResource(images[position]);
        return rowView;
    }
}