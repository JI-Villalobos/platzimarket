package com.platzimarket.persistence.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

//This class contains the primary key from ComprasProductos we use @Embeddable annotation
@Embeddable

public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private Integer idCompra;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    @Column(name = "id_producto")
    private  Integer idProducto;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

}
