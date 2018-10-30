package br.edu.utfpr.pb.springrest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.springrest.model.Genero;
import br.edu.utfpr.pb.springrest.service.CrudService;
import br.edu.utfpr.pb.springrest.service.GeneroService;

@RestController
@RequestMapping("genero")
public class GeneroController 
			extends CrudController<Genero, Long>{

	@Autowired
	private GeneroService generoService;
	
	@Valid
	@Override
	protected CrudService<Genero, Long> getService() {
		return generoService;
	}
}






