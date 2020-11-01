package com.saltsoftware.repository;

//Author: Sakeena Francis, Repository for common methods

@Deprecated
public interface Repository <T, genericID> {

    T create(T t);
    T read(genericID id);
    T update(T t);
    boolean delete(genericID id);

}
