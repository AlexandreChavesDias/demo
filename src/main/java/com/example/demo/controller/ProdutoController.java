package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Produto;
import com.example.demo.service.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService prdService;
	
	@GetMapping("/{id}")
	public Produto produto(@PathVariable Long id) {
		return prdService.Busca(id);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto prd) {
    	 return prdService.atualiza(id, prd);
    }
	
	@PostMapping("/{id}")
    public ResponseEntity<Produto> criando(@PathVariable Long id, @RequestBody Produto prd) {
    	 return prdService.atualiza(id, prd);
    }
	

}
