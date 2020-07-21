package com.saltsoftware.repository;

//Author: Sakeena Francis, Repository for common methods

public interface Repository <T, genericID> {

    T create(T t);
    T read(genericID id);
    T update(T t);
    void delete(genericID id);

}
