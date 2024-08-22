package com.riwi.RiwiMovies.repositories.interfaces;

import com.riwi.RiwiMovies.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
