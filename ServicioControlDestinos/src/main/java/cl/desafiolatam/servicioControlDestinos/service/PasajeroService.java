package cl.desafiolatam.servicioControlDestinos.service;

import java.util.List;

import cl.desafiolatam.servicioControlDestinos.model.Pasajero;


public interface PasajeroService {

	public void save(Pasajero pasajero);
	public List<Pasajero> findAll();
}
