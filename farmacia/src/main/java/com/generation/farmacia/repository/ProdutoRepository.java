package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.generation.farmacia.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	
	//ACHAR POR NOME
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param ("nome") String nome);
	
	//POR PREÇO
	//public List <Produto> findByPrecoBetween(@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);
}

