package br.edu.utfpr.pb.springrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.springrest.model.Genero;
import br.edu.utfpr.pb.springrest.repository.GeneroRepository;
import br.edu.utfpr.pb.springrest.service.GeneroService;

@Service
public class GeneroServiceImpl 
					extends CrudServiceImpl<Genero, Long>
					implements GeneroService{

	@Autowired
	private GeneroRepository generoRepository;
	
	@Override
	protected JpaRepository<Genero, Long> getRepository() {
		return generoRepository;
	}
}
