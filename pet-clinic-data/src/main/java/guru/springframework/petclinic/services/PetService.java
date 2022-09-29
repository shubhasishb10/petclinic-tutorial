package guru.springframework.petclinic.services;

import guru.springframework.petclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
