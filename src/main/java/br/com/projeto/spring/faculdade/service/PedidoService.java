package br.com.projeto.spring.faculdade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.spring.faculdade.entity.Pedido;
import br.com.projeto.spring.faculdade.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository PedidoRepository;

	public List<Pedido> getAll() {
		return PedidoRepository.findAll();
	}

	public Pedido getById(Integer id) {
		return PedidoRepository.findById(id).orElse(null);
	}

	public Pedido savePedido(Pedido Pedido) {
		return PedidoRepository.save(Pedido);
	}

	public Pedido updatePedido(Integer id, Pedido pedido) {
		Pedido PedidoAtualizada = PedidoRepository.findById(id).orElse(null);
		if (PedidoAtualizada != null) {
			PedidoAtualizada.setPedidoData(pedido.getPedidoData());
			return PedidoRepository.save(PedidoAtualizada);
		} else {
			return null;
		}
	}

	public Boolean deletePedido(Integer id) {
		Pedido pedido = PedidoRepository.findById(id).orElse(null);
		if (pedido != null) {
			PedidoRepository.delete(pedido);
			return true;
		} else {
			return false;
		}
	}
}
