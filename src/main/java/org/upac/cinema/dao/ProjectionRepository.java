package org.upac.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.upac.cinema.entities.ProjectionFilm;
@RepositoryRestResource
public interface ProjectionRepository extends JpaRepository<ProjectionFilm, Long> {
	
}
