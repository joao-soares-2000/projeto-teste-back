package com.example.projetoteste.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "produtos")
public class Produto implements Serializable {
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    private String unmedida;

    private String ncm;

    public Produto() {
        super();
    }

    public Produto(Integer id, String descricao, String unmedida, String ncm) {
        super();
        this.id = id;
        this.descricao = descricao;
        this.unmedida = unmedida;
        this.ncm = ncm;
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

    public String getUnmedida() {
        return unmedida;
    }

    public void setUnMedida(String unmedida) {
        this.unmedida = unmedida;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(getId(), produto.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
