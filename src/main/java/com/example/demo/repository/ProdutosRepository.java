package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

}
