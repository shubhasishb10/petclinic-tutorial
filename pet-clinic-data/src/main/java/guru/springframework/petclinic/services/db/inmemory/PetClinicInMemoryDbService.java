package guru.springframework.petclinic.services.db.inmemory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class PetClinicInMemoryDbService<T, ID> {

    protected Map<ID, T> db = new HashMap<>();

    protected Set<T> findAll() {
        return new HashSet<>(db.values());
    }

    protected T findById(ID id) {
        return db.get(id);
    }

    protected T save(ID id, T t) {
        db.put(id, t);
        return t;
    }

    protected void deleteById(ID id ){
        db.remove(id);
    }

    protected void delete(T t) {
        db.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }
}
