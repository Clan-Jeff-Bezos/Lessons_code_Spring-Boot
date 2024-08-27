package com.riwi.RiwiMovies.controllers.impl;

import com.riwi.RiwiMovies.controllers.interfaces.IMovieController;
import com.riwi.RiwiMovies.dtos.request.MovieWithoutRating;
import com.riwi.RiwiMovies.dtos.response.MovieWithoutPrice;
import com.riwi.RiwiMovies.entities.Movie;
import com.riwi.RiwiMovies.services.interfaces.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController implements IMovieController {

    @Autowired
    IMovieService movieService;

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<MovieWithoutPrice> readById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.readById(id)); // 200
    }

    @Override
    @PostMapping
    public ResponseEntity<Movie> create(@RequestBody MovieWithoutRating movie) {
        return ResponseEntity.ok(movieService.create(movie)); // 201
    }
}
