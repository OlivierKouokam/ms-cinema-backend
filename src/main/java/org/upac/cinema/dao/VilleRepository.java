package org.upac.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.upac.cinema.entities.Ville;
@RepositoryRestResource
//@CrossOrigin("*")
public interface VilleRepository extends JpaRepository<Ville, Long> {

}
