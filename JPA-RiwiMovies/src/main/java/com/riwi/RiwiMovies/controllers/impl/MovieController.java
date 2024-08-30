package com.riwi.RiwiMovies.controllers.impl;

import com.riwi.RiwiMovies.controllers.interfaces.IMovieController;
import com.riwi.RiwiMovies.dtos.exception.ErrorsResponse;
import com.riwi.RiwiMovies.dtos.request.MovieWithoutRating;
import com.riwi.RiwiMovies.dtos.response.MovieWithoutPrice;
import com.riwi.RiwiMovies.entities.Movie;
import com.riwi.RiwiMovies.services.interfaces.IMovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
@Tag(name = "Movies", description = "este es el controlador de Movies")
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
    @Operation(summary = "Este endpoint es para crear", description = "Este enpoint requiere que envies la información de las peliculas")
    @ApiResponse(
                responseCode = "400",
                description = "Este error sale cuando falta un atributo o el tipo es invalido",
                content = {
                        @Content(
                                mediaType = "application/json",
                                schema = @Schema(implementation = ErrorsResponse.class)
                        )
                })
    public ResponseEntity<Movie> create(@RequestBody @Valid MovieWithoutRating movie) {
        return ResponseEntity.ok(movieService.create(movie)); // 201
    }
}
