package guru.springframework.petclinic.models;

import java.io.Serializable;

/**
 *
 * @author Shubhasish
 * This is the base entity for all the entities to hold the ID attribute for the database
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
