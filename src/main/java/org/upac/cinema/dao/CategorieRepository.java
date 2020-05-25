package org.upac.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.upac.cinema.entities.Categorie;
@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
