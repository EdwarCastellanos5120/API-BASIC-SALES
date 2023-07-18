package com.api.api_productos.Models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "tb_proveedores")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Proved {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Proveedor_Codigo")
    private Long id;

    @Column(name = "Proveedor_NIT")
    private String nit;

    @Column(name = "Proveedor_Nombre")
    private String name;

    @Column(name = "Proveedor_Direccion")
    private String address;

    public Proved() {
    }

    public Proved(Long id, String nit, String name, String address) {
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.address = address;
    }




}
