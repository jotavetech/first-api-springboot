package com.example.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.UUID;

// spring boot usa anotações para mapear as classes
// @Entity > mapeia a classe para uma tabela no banco de dados
// @Table > mapeia a tabela no banco de dados

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    // @Id > mapeia a chave primária da tabela
    // @GeneratedValue > mapeia a geração automática do valor da chave primária
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private BigDecimal price;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
