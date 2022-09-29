package com.example.projetoteste.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "produtos")
@SequenceGenerator(name = "seqProdutos",sequenceName = "SEQ_PRODUTOS",allocationSize = 1)
public class Produto implements Serializable {
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProdutos")
    @Column(nullable = false)
    private Integer id;

    @Column
    @NotEmpty(message = "campo descrição vazio")
    private String descricao;

    @Column
    @NotEmpty(message = "campo unidade de medida vazio")
    private String unmedida;

    @Column
    @NotEmpty(message = "campo ncm vazio")
    private String ncm;

    public Produto() {
        super();
    }

    public Produto(Integer id, String descricao, String unmedida, String ncm) {
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

    public void setUnmedida(String unmedida) {
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
