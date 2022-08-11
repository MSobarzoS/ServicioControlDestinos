package cl.desafiolatam.servicioControlDestinos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.servicioControlDestinos.model.Destino;
import cl.desafiolatam.servicioControlDestinos.repository.DestinoRepository;
import cl.desafiolatam.servicioControlDestinos.service.DestinoService;

@Service
public class DestinoServiceImpl implements DestinoService{

	@Autowired
	DestinoRepository destinoRepository;

	@Override
	public void save(Destino destino) {
		destinoRepository.save(destino);
	}

	@Override
	public List<Destino> findAll() {
		return (List<Destino>) destinoRepository.findAll();
	}

}
