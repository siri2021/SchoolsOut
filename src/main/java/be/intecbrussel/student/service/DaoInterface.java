package be.intecbrussel.student.service;

import java.util.List;
import java.util.Optional;

public interface DaoInterface<T>{
    Optional<T> get(String s);
    Optional<T> get(Integer id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);
}