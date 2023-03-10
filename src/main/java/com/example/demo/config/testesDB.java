package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entities.Produto;
import com.example.demo.repository.ProdutoRepository;

@Configuration
public class testesDB  implements CommandLineRunner{

		@Autowired
		private ProdutoRepository ProdutoRepository;
		
		@Override
		public void run(String... args) throws Exception {
			Produto p1 = new Produto(null,"tv","televisor philips",999.99);
			Produto p2 = new Produto(null,"smartphone","smartphone lenovo",952.99);
			Produto p3 = new Produto(null,"geladeira","geladeira brastemp",2099.99);
			ProdutoRepository.saveAll(Arrays.asList(p1,p2,p3));
			
		}

	}
