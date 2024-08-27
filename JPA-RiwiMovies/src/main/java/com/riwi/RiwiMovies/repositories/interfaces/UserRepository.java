package com.riwi.RiwiMovies.repositories.interfaces;

import com.riwi.RiwiMovies.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
