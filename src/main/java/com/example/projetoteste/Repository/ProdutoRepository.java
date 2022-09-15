package com.example.projetoteste.Repository;

import com.example.projetoteste.Domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
