package com.riwi.RiwiMovies.dtos.request;

import java.sql.Time;

public class MovieWithoutRating {
    private Long id;
    private String title;
    private String genre;
    private Time duration;
    private Float price;

    public MovieWithoutRating() {
    }

    public MovieWithoutRating(Long id, String title, String genre, Time duration, Float price) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MovieWithoutRating{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
