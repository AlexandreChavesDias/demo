package com.example.demo.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Produto;
import com.example.demo.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository ProdutoRepository;
	
	public String teste(String id) {
		return "teste2"+id;
	}

	public Produto Busca(Long id) {
		Produto produto = ProdutoRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));
		return produto;
	}

	public ResponseEntity<Produto> atualiza(Long id, Produto prdForm) {
		return  ProdutoRepository.findById(id)
				.map(prd -> {
			prd.setId(prdForm.getId());
			prd.setNome(prdForm.getNome());
			prd.setDescricao(prdForm.getDescricao());
			prd.setPreco(prdForm.getPreco());
			ProdutoRepository.save(prd);
			return ResponseEntity.ok().body(prd);
		}).orElse(ResponseEntity.notFound().build());
		
		
	}

}
