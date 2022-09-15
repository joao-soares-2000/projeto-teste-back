package com.example.projetoteste.Resource;

import com.example.projetoteste.Domain.Produto;
import com.example.projetoteste.Dto.ProdutoDto;
import com.example.projetoteste.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
