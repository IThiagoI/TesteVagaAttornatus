package br.com.attornatus.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.attornatus.teste.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
