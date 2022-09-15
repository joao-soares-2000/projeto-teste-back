package com.example.projetoteste.Dto;

import com.example.projetoteste.Domain.Produto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ProdutoDto implements Serializable {
    private static final long SerialVersionUID = 1L;

    private Integer id;

    private String descricao;

    private String unMedida;

    private String ncm;

    public ProdutoDto() {
        super();
    }

    public ProdutoDto(Produto obj) {
        super();
        this.id = obj.getId();
        this.descricao = obj.getDescricao();
        this.unMedida = obj.getUnMedida();
        this.ncm = obj.getNcm();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnMedida() {
        return unMedida;
    }

    public void setUnMedida(String unMedida) {
        this.unMedida = unMedida;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }
}