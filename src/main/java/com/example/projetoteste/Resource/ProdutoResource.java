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

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById (@PathVariable Integer id) {
        Produto obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

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

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProdutoDto> update(@Valid @PathVariable Integer id, @RequestBody ProdutoDto objDto) {
        Produto newObj = service.update(id,objDto);
        return ResponseEntity.ok().body(new ProdutoDto(newObj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
