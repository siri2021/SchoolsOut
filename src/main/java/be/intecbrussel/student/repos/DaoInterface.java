package be.intecbrussel.student.repos;

import java.util.List;
import java.util.Optional;

public interface DaoInterface<T>{
    Optional<T> get(String s);
    Optional<T> get(Long id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);
}