package com.platzimarket.persistence.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.util.descriptor.web.InjectionTarget;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "compras")
@Getter
@Setter
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String isCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private  String estado;
}
