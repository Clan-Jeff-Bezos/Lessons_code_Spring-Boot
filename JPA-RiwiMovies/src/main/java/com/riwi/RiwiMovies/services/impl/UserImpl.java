package com.riwi.RiwiMovies.services.impl;

import com.riwi.RiwiMovies.entities.UserEntity;
import com.riwi.RiwiMovies.repositories.interfaces.UserRepository;
import com.riwi.RiwiMovies.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void archive(String s) {
        UserEntity user = userRepository.findById(s).orElseThrow();

        user.setStatus(false);
        userRepository.save(user);
    }

    @Override
    public List<UserEntity> readAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity readById(String s) {
        return userRepository.findById(s).orElseThrow();
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
