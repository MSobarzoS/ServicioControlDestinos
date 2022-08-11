package cl.desafiolatam.servicioControlDestinos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.desafiolatam.servicioControlDestinos.model.Pasajero;
import cl.desafiolatam.servicioControlDestinos.service.PasajeroService;

@Controller
public class PasajeroController {

	@Autowired
	PasajeroService pasajeroService;
	
	@RequestMapping("/pasajeros")
	public String pasajeros(Model model){
		model.addAttribute("pasajeros", pasajeroService.findAll());
		
		return "pasajeros";
	}
	
	@GetMapping("/formularioPasajero")
	public String crearPasajero(Model model) {
		return"crear-pasajero";
	}
	
	@PostMapping("/agregarPasajero")
	public String crearPasajero(@ModelAttribute Pasajero pasajero, Model model) {
		pasajeroService.save(pasajero);
		
		return "pasajeros";
	}
	
}
