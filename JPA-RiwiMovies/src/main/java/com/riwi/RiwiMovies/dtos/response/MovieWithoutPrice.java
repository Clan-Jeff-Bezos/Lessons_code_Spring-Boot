package com.riwi.RiwiMovies.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieWithoutPrice {
    private Long id;
    private String title;
    private String genre;
    private Time duration;
    private Integer rating;
}
