package guru.springframework.petclinic.services.db.inmemory;

import guru.springframework.petclinic.models.Pet;
import guru.springframework.petclinic.services.CrudService;
import guru.springframework.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMemoryDbService extends PetClinicInMemoryDbService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet Pet) {
        return super.save(Pet.getId(), Pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
