package com.platzimarket.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

//This class contains the primary key from ComprasProductos we use @Embeddable annotation
@Embeddable
@Getter
@Setter
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private  Integer idProducto;
}
