package com.riwi.RiwiMovies.services.CRUD;

public interface Create<EntityRequest, Entity> {
    public Entity create(EntityRequest entity);
}
