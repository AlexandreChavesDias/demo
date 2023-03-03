package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService prdService;
	
	@GetMapping("/{id}")
	public String produto(@PathVariable Long id) {
		
		return prdService.teste();
	}
	

}
