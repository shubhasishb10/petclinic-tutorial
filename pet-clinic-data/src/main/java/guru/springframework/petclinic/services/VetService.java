package guru.springframework.petclinic.services;


import guru.springframework.petclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
