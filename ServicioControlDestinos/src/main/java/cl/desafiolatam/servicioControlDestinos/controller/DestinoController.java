package cl.desafiolatam.servicioControlDestinos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.desafiolatam.servicioControlDestinos.model.Destino;
import cl.desafiolatam.servicioControlDestinos.service.DestinoService;
import cl.desafiolatam.servicioControlDestinos.service.PasajeroService;

@Controller
public class DestinoController {
	
	@Autowired
	DestinoService destinoService;
	
	@Autowired
	PasajeroService pasajeroService;
	
	@RequestMapping("/destinos")
	public String destinos(Model model) {
		model.addAttribute("destinos", destinoService.findAll());
		
		return "destinos";
	}
	
	@GetMapping("/formularioDestino")
	public String crearDestino(Model model) {
		model.addAttribute("pasajeros", pasajeroService.findAll());
		
		return "crear-destino";
	}
	
	@PostMapping("/agregarDestino")
	public String crearDestino (@ModelAttribute Destino destino, Model model) {
		destinoService.save(destino);
		
		return "destinos";
		
	}
}
