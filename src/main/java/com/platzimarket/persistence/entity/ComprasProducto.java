package com.platzimarket.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;
}
