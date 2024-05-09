package br.com.projeto.spring.faculdade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.spring.faculdade.entity.Produto;
import br.com.projeto.spring.faculdade.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository ProdutoRepository;

	public List<Produto> getAll() {
		return ProdutoRepository.findAll();
	}

	public Produto getById(Integer id) {
		return ProdutoRepository.findById(id).orElse(null);
	}

	public Produto saveProduto(Produto produto) {
		return ProdutoRepository.save(produto);
	}

	public Produto updateProduto(Integer id, Produto produto) {
		Produto ProdutoAtualizado = ProdutoRepository.findById(id).orElse(null);
		if (ProdutoAtualizado != null) {
			ProdutoAtualizado.setProdutoNome(produto.getProdutoNome());
			return ProdutoRepository.save(ProdutoAtualizado);
		} else {
			return null;
		}
	}

	public Boolean deleteProduto(Integer id) {
		Produto produto = ProdutoRepository.findById(id).orElse(null);
		if (produto != null) {
			ProdutoRepository.delete(produto);
			return true;
		} else {
			return false;
		}
	}
}
