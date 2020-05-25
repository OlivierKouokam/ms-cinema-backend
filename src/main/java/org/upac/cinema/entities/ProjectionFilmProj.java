package org.upac.cinema.entities;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="p1", types = org.upac.cinema.entities.ProjectionFilm.class)
public interface ProjectionFilmProj {
	public Long getId();
	public double getPrix();
	public Date getDateProjection();
	public Salle getSalle();
	public Film getFilm();
	public Seance getSeance();
	public Collection<Ticket> getTickets();
}
