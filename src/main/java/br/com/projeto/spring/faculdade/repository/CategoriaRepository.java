package br.com.projeto.spring.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.spring.faculdade.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
