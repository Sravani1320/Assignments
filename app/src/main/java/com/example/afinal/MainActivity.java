package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    List<Movie> movieList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("panga", "10-10", "women oriented"));
        movieList.add(new Movie("dil_bechara","9-10", "love and life"));
        movieList.add(new Movie("gulabo_sitabo","8-10", "love is in the air"));
        movieList.add(new Movie( "mrs_serial_killer", "9-10", "crime"));
        movieList.add(new Movie("love_aaj_kal","7.5-10", "Love line"));

        listView = (ListView) findViewById(R.id.list_view);

        CustomAdapterList adapter = new CustomAdapterList(movieList);

        listView.setAdapter(adapter);
    }
}