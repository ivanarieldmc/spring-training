package com.ivanarieldmc.training.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ivanarieldmc.training.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		model.addAttribute("titulo","Hello from the controller - Title");
		model.addAttribute("h1","Hello from the controller - H1");
		return "index";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Ariel");
		usuario.setApellido("Sparda");
		model.addAttribute("usuario",usuario);
		model.addAttribute("h1","Hello from the controller - H1");
		model.addAttribute("titulo","Perfil del usuario "+usuario.getNombre()+" "+usuario.getApellido());
		return "perfil";
	}

}
