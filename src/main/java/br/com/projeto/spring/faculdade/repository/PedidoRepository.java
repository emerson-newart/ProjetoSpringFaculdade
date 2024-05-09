package br.com.projeto.spring.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.spring.faculdade.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
