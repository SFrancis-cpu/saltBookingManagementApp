package com.saltsoftware.service;

//Author: Sakeena Francis, Repository for common methods

    public interface IService<T, genericID> {

        T create(T t);
        static T read(genericID id);
        T update(T t);
        boolean delete(genericID id);

    }
