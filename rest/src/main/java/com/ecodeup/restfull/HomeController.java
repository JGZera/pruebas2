package com.ecodeup.restfull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.modelo.Estudiante;

@RestController
public class HomeController {

	@RequestMapping("/api/estudiantes")
	public List<Estudiante> GetAll(){
		
		List<Estudiante> estudiantes = new ArrayList<>();
					
		estudiantes.add(new Estudiante(1,"A","garcia"));
		estudiantes.add(new Estudiante(2,"B","gallardo"));
		estudiantes.add(new Estudiante(3,"C","bouzas"));
		
		return estudiantes;
	}
	
}
