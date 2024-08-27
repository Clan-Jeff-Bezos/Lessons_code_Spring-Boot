package com.riwi.RiwiMovies.services.interfaces;

import com.riwi.RiwiMovies.dtos.request.MovieWithoutRating;
import com.riwi.RiwiMovies.dtos.response.MovieWithoutPrice;
import com.riwi.RiwiMovies.entities.Movie;
import com.riwi.RiwiMovies.services.CRUD.Create;
import com.riwi.RiwiMovies.services.CRUD.ReadById;
import com.riwi.RiwiMovies.services.CRUD.Save;

public interface IMovieService extends
        ReadById<MovieWithoutPrice, Long>
        , Create<MovieWithoutRating, Movie> {
}
