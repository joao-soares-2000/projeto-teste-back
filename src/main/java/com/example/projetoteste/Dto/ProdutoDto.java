package com.example.projetoteste.Dto;

import com.example.projetoteste.Domain.Produto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ProdutoDto implements Serializable {
    private static final long SerialVersionUID = 1L;

    private Serializable id;

    private String descricao;

    private String unmedida;

    private String ncm;

    public ProdutoDto() {
        super();
    }

    public ProdutoDto(Produto obj) {
        super();
        this.id = obj.getId();
        this.descricao = obj.getDescricao();
        this.unmedida = obj.getUnmedida();
        this.ncm = obj.getNcm();
    }

    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnmedida() {
        return unmedida;
    }

    public void setUnmedida(String unmedida) {
        this.unmedida = unmedida;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }
}
