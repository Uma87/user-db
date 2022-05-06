package ru.telegram.userdb.srvice;

import java.util.List;
import java.util.Optional;

public interface UsersCrud <T,ID>{
    List<T> findAll();
    Optional<T> findById(ID id);
    void save (T t);
    void update(T t);
    void delete(ID id);
}
