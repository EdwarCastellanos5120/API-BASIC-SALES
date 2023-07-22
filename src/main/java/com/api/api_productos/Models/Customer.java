package com.api.api_productos.Models;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tb_clientes")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Cliente_Codigo")
    private Long id;

    @Column(name = "Cliente_Nombre1")
    private String name1;

    @Column(name = "Cliente_Nombre")
    private String name2;

    @Column(name = "Cliente_Apellido1")
    private String lastName1;

    @Column(name = "Cliente_Apellido2")
    private String lastName2;

    @Column(name = "Cliente_Apellido3")
    private String lastName3;

    @Column(name = "Cliente_DPI")
    private String dpi;

    @Column(name = "Cliente_Direccion")
    private String address;

    @Column(name = "Cliente_Fecha")
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    public Customer() {
    }

    public Customer(Long id, String name1, String name2, String lastName1, String lastName2, String lastName3, String dpi, String address, Date birthDate) {
        this.id = id;
        this.name1 = name1;
        this.name2 = name2;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.lastName3 = lastName3;
        this.dpi = dpi;
        this.address = address;
        this.birthDate = birthDate;
    }
}
