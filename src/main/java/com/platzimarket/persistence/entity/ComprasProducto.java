package com.platzimarket.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//this entity has two primary keys (compound key) we create another class to contain the keys
@Entity
@Table(name = "compras_productos")
@Getter
@Setter
public class ComprasProducto {
    //we use @EmbeddedId when the primary key is compound
    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;

    private Double total;

    private Boolean estado;
}
