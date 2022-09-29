package com.example.projetoteste.Resource;

import com.example.projetoteste.Domain.Produto;
import com.example.projetoteste.Dto.ProdutoDto;
import com.example.projetoteste.Services.ProdutoService;
import com.sun.jndi.toolkit.url.Uri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoDto>> findAll(){
        List<Produto> list = service.findAll();
        List<ProdutoDto> listDto = list.stream().map(ProdutoDto ::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        produto = service.create(produto);
        //URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(produto.getId()).toUri();
        return ResponseEntity.ok().body(produto);
    }
}
