package com.riwi.RiwiMovies.repositories.interfaces;

import com.riwi.RiwiMovies.entities.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PucharseRepository extends JpaRepository<Purchase, Long> {
}
