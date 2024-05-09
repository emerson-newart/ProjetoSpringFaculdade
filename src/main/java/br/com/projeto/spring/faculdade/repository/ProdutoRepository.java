package br.com.projeto.spring.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.spring.faculdade.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
