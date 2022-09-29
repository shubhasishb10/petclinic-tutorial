package guru.springframework.petclinic.services.db.inmemory;

import guru.springframework.petclinic.models.Vet;
import guru.springframework.petclinic.services.CrudService;

import java.util.Set;

public class VetMemoryDbService extends PetClinicInMemoryDbService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet save(Vet Vet) {
        return super.save(Vet.getId(), Vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
