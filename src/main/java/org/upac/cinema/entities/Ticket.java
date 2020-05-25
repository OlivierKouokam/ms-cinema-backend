package org.upac.cinema.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Ticket implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomClient;
	private double prix;
	@Column(unique = false, nullable = true)
	private Integer codePayement;
	private boolean reserve;
	@ManyToOne
	private Place place;
	@ManyToOne
//	@JsonProperty(access = Access.WRITE_ONLY)
	private ProjectionFilm projection;
}
