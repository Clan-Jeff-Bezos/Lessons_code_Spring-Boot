package com.riwi.RiwiMovies.services.CRUD;

public interface ReadById<Entity, ID> {
    public Entity readById(ID id);
}
