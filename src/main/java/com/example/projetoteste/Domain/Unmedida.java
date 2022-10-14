package com.example.projetoteste.Domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "unmedida")
public class Unmedida implements Serializable {
    private static final long SerialVersionUID;

    static {
        SerialVersionUID = 1L;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Length(min = 2, max = 7, message = "a unidade de medida deve ter entre 2 e 7 caracteres")
    private String unmedida;

    public Unmedida() {
        super();
    }

    public Unmedida(Integer id, String unmedida) {
        this.id = id;
        this.unmedida = unmedida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnmedida() {
        return unmedida;
    }

    public void setUnmedida(String unmedida) {
        this.unmedida = unmedida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unmedida)) return false;
        Unmedida unmedida1 = (Unmedida) o;
        return Objects.equals(getId(), unmedida1.getId()) && Objects.equals(getUnmedida(), unmedida1.getUnmedida());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUnmedida());
    }
}
