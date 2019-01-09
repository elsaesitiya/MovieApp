package com.example.elsa.movieapp.api;

import com.example.elsa.movieapp.model.Movie;
import com.example.elsa.movieapp.model.MovieResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IRetrofit {
    //    itu API_KEY ku, ganti pake API_KEY mu :D
    @GET("now_playing?api_key=280af572647b3e8153b144e478ba7a36")
    Call<List<Movie>> getMoviesT();

    @GET("now_playing?api_key=280af572647b3e8153b144e478ba7a36")
    Call<MovieResponse> getMovies();

}