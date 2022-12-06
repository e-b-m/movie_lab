package com.example.movie.services;
import com.example.movie.models.Movie;
import com.example.movie.models.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;


    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie>  getMovieById(int id){
        return  movieRepository.findById(id);
    }

    public Movie addNewMovie(Movie movie) {
          return movieRepository.save(movie);
    }
}
