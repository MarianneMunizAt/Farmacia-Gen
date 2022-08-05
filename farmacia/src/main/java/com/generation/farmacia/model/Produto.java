package com.generation.farmacia.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos") // QUE VAI CRIAR UMA TABELA NO BANCO DE DADOS CHAMADA PRODUTOS

public class Produto {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank
	@Size (min = 5 , max = 100)
	private String nome;
	
	
	@NotBlank
	@Size (min = 10 , max = 500)
	private String descricao;
	
// QUANTIDADE DE PRODUTOS
	
	 private int quantidade;
	
	 
 // PREÇO DE PRODUTOS
	 
	//@Positive(message = "Digite um valor positivo maior do que zero")
	//private BigDecimal preco;
	
//DATA DE CADATRO OU PODE SER DE PESQUISA
	
	@UpdateTimestamp					//FORMA CERTA DE COLOCAR TEMPO - VAI AUTOMATICO, A PESSOA NÃO PRECISA ESCREVER
	private LocalDateTime data;


//RELACIONAMENTO COM CATEGORIA
//MUITOS PARA UM
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	
	
//GETTERS AND SETTERS
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//public BigDecimal getPreco() {
	//	return preco;
	//}


	//public void setPreco(BigDecimal preco) {
	//	this.preco = preco;
	//}


	public LocalDateTime getData() {
		return data;
	}


	public void setData(LocalDateTime data) {
		this.data = data;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
