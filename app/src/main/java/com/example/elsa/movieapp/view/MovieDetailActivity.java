package com.example.elsa.movieapp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.elsa.movieapp.R;
import com.example.elsa.movieapp.api.API;
import com.example.elsa.movieapp.model.Movie;
import com.squareup.picasso.Picasso;

public class MovieDetailActivity extends AppCompatActivity {
    private Movie movie;
    private ImageView imgMovie;
    private TextView tvTitle, tvDate, tvDescription;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        movie = (Movie) getIntent().getSerializableExtra("movie");
        initUI();
    }

    private void initUI() {
        imgMovie = findViewById(R.id.imgMovieD);
        Picasso.get().load(API.POSTER + movie.getUrl()).centerCrop().fit().into(imgMovie);

        tvTitle = findViewById(R.id.tvTitleD);
        tvTitle.setText(movie.getTitle());

        tvDate = findViewById(R.id.tvDateD);
        tvDate.setText(getResources().getString(R.string.tayang_tanggal) + " " + movie.getDate());

        tvDescription = findViewById(R.id.tvDescriptionD);
        tvDescription.setText(movie.getDescription());

        ratingBar = findViewById(R.id.rbMovieD);
        ratingBar.setRating((float) (movie.getRating() / 2));
    }
}
