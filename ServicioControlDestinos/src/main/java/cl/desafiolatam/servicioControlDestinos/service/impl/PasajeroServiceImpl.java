package cl.desafiolatam.servicioControlDestinos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.servicioControlDestinos.model.Pasajero;
import cl.desafiolatam.servicioControlDestinos.repository.PasajeroRepository;
import cl.desafiolatam.servicioControlDestinos.service.PasajeroService;

@Service
public class PasajeroServiceImpl implements PasajeroService{

	@Autowired
	PasajeroRepository pasajeroRepository;
	
	@Override
	public void save(Pasajero pasajero) {
		pasajeroRepository.save(pasajero);
	}

	@Override
	public List<Pasajero> findAll() {
		return (List<Pasajero>) pasajeroRepository.findAll();
	}

}

