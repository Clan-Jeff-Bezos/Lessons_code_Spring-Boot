package com.riwi.RiwiMovies.controllers.interfaces;

import com.riwi.RiwiMovies.controllers.generic.Create;
import com.riwi.RiwiMovies.controllers.generic.ReadById;
import com.riwi.RiwiMovies.dtos.request.MovieWithoutRating;
import com.riwi.RiwiMovies.dtos.response.MovieWithoutPrice;
import com.riwi.RiwiMovies.entities.Movie;

public interface IMovieController extends
        ReadById<MovieWithoutPrice, Long>
        ,Create<MovieWithoutRating, Movie> {
}
