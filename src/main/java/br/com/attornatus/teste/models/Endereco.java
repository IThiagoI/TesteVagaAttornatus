package br.com.attornatus.teste.models;



import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;	
	private String logradouro;	
	private int cep;
	private int numero;
	private String cidade;
	private boolean enderecoPrincipal;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
		
	public Endereco(){}
	
	public Endereco(String logradouro, int cep, int numero, String cidade, boolean enderecoPrincipal, Pessoa pessoa) {
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
		this.cidade = cidade;
		this.enderecoPrincipal = enderecoPrincipal;
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public boolean isEnderecoPrincipal() {
		return enderecoPrincipal;
	}

	public long getId() {
		return id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getCep() {
		return cep;
	}

	public int getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}
	
	
	
	
	
	
	
}
