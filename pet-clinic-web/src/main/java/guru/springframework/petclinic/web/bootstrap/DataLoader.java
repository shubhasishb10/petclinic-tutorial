package guru.springframework.petclinic.web.bootstrap;

import guru.springframework.petclinic.models.Owner;
import guru.springframework.petclinic.models.Vet;
import guru.springframework.petclinic.services.OwnerService;
import guru.springframework.petclinic.services.VetService;
import guru.springframework.petclinic.services.db.inmemory.OwnerMemoryDbService;
import guru.springframework.petclinic.services.db.inmemory.VetMemoryDbService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Shubhasish
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Owner1 FirstName");
        owner1.setLastName("Owner1 LastName");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Owner2 FirstName");
        owner1.setLastName("Owner2 LastName");

        ownerService.save(owner2);

        System.out.println("Owners loaded...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Vet1 FirstName");
        vet1.setLastName("Vet1 LastName");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Vet2 FirstName");
        vet1.setLastName("Vet2 LastName");

        vetService.save(vet2);

        System.out.println("Vets Loaded...");
    }
}
