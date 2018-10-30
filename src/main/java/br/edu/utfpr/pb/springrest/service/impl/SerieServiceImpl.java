package br.edu.utfpr.pb.springrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.springrest.model.Serie;
import br.edu.utfpr.pb.springrest.repository.SerieRepository;
import br.edu.utfpr.pb.springrest.service.SerieService;

@Service
public class SerieServiceImpl 
			extends CrudServiceImpl<Serie, Long>
			implements SerieService{

	@Autowired
	private SerieRepository serieRepository;
	
	@Override
	protected JpaRepository<Serie, Long> getRepository() {
		return serieRepository;
	}
}
