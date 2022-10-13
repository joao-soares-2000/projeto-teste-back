package com.example.projetoteste.Dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class UnMedidaDto {
    private static final long SerialversionUID = 1L;
    private Integer id;

    @NotEmpty
    @Length(min = 2, max = 7, message = "a unidade de medida dever ter de 2 a 7 caracteres")
    private String unmedida;

    public UnMedidaDto() {
        super();
    }

    public UnMedidaDto(Integer id, String unmedida) {
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
}
