package com.riwi.RiwiMovies.entities;

import jakarta.persistence.*;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private UserEntity user;

    @ManyToOne( fetch = FetchType.LAZY)
    private Movie movie;

    public Purchase() {
    }

    public Purchase(Long id, UserEntity userId, Movie movieId) {
        this.id = id;
        this.user = userId;
        this.movie = movieId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", userId='" + user + '\'' +
                ", movieId=" + movie +
                '}';
    }
}
