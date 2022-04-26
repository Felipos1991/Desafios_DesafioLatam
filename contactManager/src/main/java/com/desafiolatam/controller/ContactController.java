package com.desafiolatam.controller;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contactManager")
	public String showContactManager() {
		return "contactManager.jsp";
	}
	
	ArrayList<String[]> listado=new ArrayList<String[]>();
	@PostMapping("/agregaCliente")
	public String addClient(
			@RequestParam("nombre") String nombre,
			@RequestParam("apellidoP") String apellidoP,
			@RequestParam("apellidoM") String apellidoM,
			@RequestParam("direccion") String direccion,
			@RequestParam("telefono") String telefono, Model model) {
	
			String[] datosContacto =new String[5];
			datosContacto[0]=nombre;
			datosContacto[1]=apellidoP;
			datosContacto[2]=apellidoM;
			datosContacto[3]=direccion;
			datosContacto[4]=telefono;
			int i=datosContacto.length;
			
			listado.add(datosContacto);
			System.out.println(listado.indexOf(datosContacto));
			
			
			model.addAttribute("listado",listado);
			
				
			
		return "contactManager.jsp";
	}
	
}
