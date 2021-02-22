package com.ivanarieldmc.training.app.controllers;

import java.util.ArrayList;
import java.util.List;

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
		usuario.setEmail("ariel@sparda.com");
		model.addAttribute("usuario",usuario);
		model.addAttribute("h1","Hello from the controller - H1");
		model.addAttribute("titulo","Perfil del usuario "+usuario.getNombre()+" "+usuario.getApellido());
		return "perfil";
	}
	
	@GetMapping("/listar1")
	public String listar1(Model model) {
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario("Ivan","Lopez","ialopez@correo.com"));
		usuarios.add(new Usuario("ariel","machuca","amach@correo.com"));
		usuarios.add(new Usuario("Vlad","Tepes","vladiii@correo.com"));
		Usuario usuario = new Usuario();

		model.addAttribute("usuario",usuario);
		
		
		model.addAttribute("titulo","Lista de usuarios");
		model.addAttribute("usuarios",usuarios);
		
		return "listar1";
	}

}
