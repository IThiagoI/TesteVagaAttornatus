package br.com.attornatus.teste.models;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private LocalDate dataNascimento;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
	private List<Endereco> endereco;

	public Pessoa () {}
	
	public Pessoa(String nome, LocalDate dataNascimento, List<Endereco> endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}
	
	
	
	
	
	
	
	
	

}
