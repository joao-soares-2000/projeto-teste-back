package com.example.projetoteste.Domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ncm")
public class Ncm implements Serializable {
    private static final long SerialVersionUID;

    static {
        SerialVersionUID = 1L;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Length(min = 8, max = 8, message = "O ncm deve ter 8 digitos")
    private String ncm;

    public Ncm() {
        super();
    }

    public Ncm(Integer id, String ncm) {
        this.id = id;
        this.ncm = ncm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(o instanceof Ncm)) return false;
        Ncm ncm1 = (Ncm) o;
        return Objects.equals(getId(), ncm1.getId()) && Objects.equals(getNcm(), ncm1.getNcm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNcm());
    }
}
