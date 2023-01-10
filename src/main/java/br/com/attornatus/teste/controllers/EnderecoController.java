package br.com.attornatus.teste.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.attornatus.teste.repositories.EnderecoRepository;
import br.com.attornatus.teste.models.Endereco;

@RestController
@RequestMapping("Endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@PostMapping
	public void cadastrar(@RequestBody Endereco endereco) {
		enderecoRepository.save(endereco);

	}
	
	@PutMapping()
	public void alterar(@RequestBody Endereco endereco) {
		enderecoRepository.save(endereco);
	}
	
	@GetMapping(path = {"/{id}"})
	public Optional<Endereco> buscarPeloId (@PathVariable long id) {
		return enderecoRepository.findById(id);
	}
	
	@GetMapping
	public List<Endereco> listarPessoas(){
		return enderecoRepository.findAll();
	}
}
	
	 
	

