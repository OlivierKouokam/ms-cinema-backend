package org.upac.cinema;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.upac.cinema.entities.Film;
import org.upac.cinema.entities.Salle;
import org.upac.cinema.entities.Ticket;

@SuppressWarnings("deprecation")
@Configuration
public class GlobalRepositoryRestConfigurer extends RepositoryRestConfigurerAdapter{
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration){
		repositoryRestConfiguration.setReturnBodyOnCreate(true);
		repositoryRestConfiguration.setReturnBodyOnUpdate(true);
		repositoryRestConfiguration.exposeIdsFor(Film.class,Salle.class,Ticket.class);
		repositoryRestConfiguration.getCorsRegistry()
			.addMapping("/**")
			.allowedOrigins("*")
			.allowedHeaders("*")
			.allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "PATCH", "POST", "DELETE");
	}
}
