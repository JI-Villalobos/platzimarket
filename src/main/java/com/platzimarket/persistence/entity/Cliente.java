package com.platzimarket.persistence.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {

    @Id
    private Integer id;

    private String nombre;

    private String apellidos;

    private String celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}
