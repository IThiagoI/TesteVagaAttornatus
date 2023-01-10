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
import br.com.attornatus.teste.repositories.PessoaRepository;
import br.com.attornatus.teste.models.Pessoa;

@RestController
@RequestMapping("Pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@PostMapping
	public void cadastrar(@RequestBody Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	@PutMapping()
	public void alterar(@RequestBody Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	@GetMapping(path = {"/{id}"})
	public Optional<Pessoa> buscarPeloId (@PathVariable long id) {
		return pessoaRepository.findById(id);
	}
	
	@GetMapping
	public List<Pessoa> listarPessoas(){
		return pessoaRepository.findAll();
	}
}
	
	 
	

