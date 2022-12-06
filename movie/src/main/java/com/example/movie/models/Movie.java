package com.example.movie.models;

import javax.persistence.*;

@Entity(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private static int nextId = 1;

    @Column(name ="title")
    private String title;

    @Column(name ="rating")
    private String rating;

    @Column(name = "duration")
    private int duration;


    public Movie(String title, String rating, int duration){
        this.id = nextId;
        nextId += 1;
        this.title = title;
        this.rating = rating;
        this.duration = duration;

    }

    public Movie (){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
