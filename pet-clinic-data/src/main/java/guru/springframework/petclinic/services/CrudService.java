package guru.springframework.petclinic.services;

import java.util.Set;

// Generic common interface for crud operations
public interface CrudService<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T t);
    void delete(T t);
    void deleteById(ID id);
}
