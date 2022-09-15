package com.example.projetoteste.Services;

import com.example.projetoteste.Domain.Produto;
import com.example.projetoteste.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll(){
        return repository.findAll();
    }


}
