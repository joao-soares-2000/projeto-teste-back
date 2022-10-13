package com.example.projetoteste.Dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class NcmDto {
    private static final long SerialVersionUID = 1L;
    private Integer id;

    @NotEmpty
    @Length(min = 8,max = 8, message = "o ncm deve ter 8 digitos")
    private String ncm;

    public NcmDto() {
        super();
    }

    public NcmDto(Integer id, String ncm) {
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
}
