package cl.desafiolatam.servicioControlDestinos.repository;

import org.springframework.data.repository.CrudRepository;

import cl.desafiolatam.servicioControlDestinos.model.Pasajero;

public interface PasajeroRepository extends CrudRepository<Pasajero,
Integer>  {

}