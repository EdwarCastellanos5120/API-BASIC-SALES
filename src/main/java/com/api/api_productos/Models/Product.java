package com.api.api_productos.Models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "tb_productos")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Producto_Codigo")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Proveedor_Codigo", referencedColumnName = "Proveedor_Codigo")
    private  Provider provider;

    @Column(name = "Producto_Nombre")
    private String name;

    @Column(name = "Producto_Precio")
    private float price;

    @Column(name = "Producto_Cantidad")
    private int quantity;

    public Product() {
    }

    public Product(Long id, Provider provider, String name, float price,int quantity ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
