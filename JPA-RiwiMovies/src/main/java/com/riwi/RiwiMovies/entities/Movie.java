package com.riwi.RiwiMovies.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String genre;

    private Time duration;

    @Column(nullable = false)
    private Integer rating = 0;

    @Column(nullable = false)
    private Float price;

    @OneToMany
    private List<Purchase> purchases;
}
