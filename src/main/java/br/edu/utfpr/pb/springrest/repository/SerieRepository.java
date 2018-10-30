package br.edu.utfpr.pb.springrest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.springrest.model.Serie;

public interface SerieRepository 
				extends JpaRepository<Serie, Long>{

	Page<Serie> findByNomeLikeOrResumoLike(String nome, String resumo, Pageable pageable);
	
}



