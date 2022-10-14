package com.example.projetoteste.Services;

import com.example.projetoteste.Domain.Produto;
import com.example.projetoteste.Dto.ProdutoDto;
import com.example.projetoteste.Repository.ProdutoRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import static sun.misc.Version.print;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll(){
        return repository.findAll();
    }

    public Produto findById(Integer id) {
        Optional<Produto> produto = repository.findById(id);
        return produto.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado", Produto.class.getName()));
    }

    public Produto create(Produto produto) {
        produto.setId(null);
        return repository.save(produto);
    }

    public Produto update(Integer id, ProdutoDto objDto) {
        Produto produto = findById(id);

        produto.setDescricao(objDto.getDescricao());
        produto.setUnmedida(objDto.getUnmedida());
        produto.setNcm(objDto.getNcm());

        return repository.save(produto);
    }

    public Produto delete(Integer id) {
        findById(id);
        repository.deleteById(id);
        return null;
    }
}
