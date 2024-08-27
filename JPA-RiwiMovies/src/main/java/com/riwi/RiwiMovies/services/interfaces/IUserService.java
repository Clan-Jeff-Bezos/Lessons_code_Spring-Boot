package com.riwi.RiwiMovies.services.interfaces;

import com.riwi.RiwiMovies.entities.UserEntity;
import com.riwi.RiwiMovies.services.CRUD.Archive;
import com.riwi.RiwiMovies.services.CRUD.ReadAll;
import com.riwi.RiwiMovies.services.CRUD.ReadById;
import com.riwi.RiwiMovies.services.CRUD.Save;

public interface IUserService extends
        Save<UserEntity>,
        ReadById<UserEntity, String>,
        ReadAll<UserEntity>,
        Archive<String> {

}
