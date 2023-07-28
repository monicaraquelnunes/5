package br.com.artigo.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.livro.entidade.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{ // Interface LivroRepository extendendo a classe do Jpa(pom)

}
