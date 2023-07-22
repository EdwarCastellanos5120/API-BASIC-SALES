package com.api.api_productos.Models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "tb_ventas")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Venta_Codigo")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Cliente_Codigo", referencedColumnName = "Cliente_Codigo")
    private  Customer client;

    @ManyToOne
    @JoinColumn(name = "Producto_Codigo", referencedColumnName = "Producto_Codigo")
    private  Product product;

    @Column(name = "Venta_Cantidad")
    private float quantity;

    @Column(name = "Venta_Referencia")
    private String reference;

    public Sales() {
    }

    public Sales(Long id, float quantity, String reference) {
        this.id = id;
        this.quantity = quantity;
        this.reference = reference;
    }
}
