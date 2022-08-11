package cl.desafiolatam.servicioControlDestinos.service;

import java.util.List;

import cl.desafiolatam.servicioControlDestinos.model.Destino;

public interface DestinoService {

	public void save(Destino destino);
	public List<Destino> findAll();
	
}

