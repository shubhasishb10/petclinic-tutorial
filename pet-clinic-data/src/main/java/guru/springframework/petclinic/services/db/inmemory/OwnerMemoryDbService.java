package guru.springframework.petclinic.services.db.inmemory;

import guru.springframework.petclinic.models.Owner;
import guru.springframework.petclinic.services.CrudService;

import java.util.Set;

public class OwnerMemoryDbService extends PetClinicInMemoryDbService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner t) {
        super.delete(t);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
