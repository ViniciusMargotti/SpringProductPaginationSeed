package br.com.mercado.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Table(name="PRODUTOS")
@Entity
@Getter
@Setter
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	Integer id;
	
	@Column(name="NOME")
	String nome;

	@Column(name="DESCRICAO")
	String descricao;

	@Column(name="VALOR_COMPRA")
	Double valorCompra;

	@Column(name="VALOR_VENDA")
	Double valorVenda;
	
	public Produto() {
		super();
	}
	
	public Produto(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
}
