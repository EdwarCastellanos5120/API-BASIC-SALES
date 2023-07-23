package com.api.api_productos.Repository;

import com.api.api_productos.Models.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISalesRepository  extends JpaRepository<Sales, Long> {

    void deleteByReference(@Param("reference") String reference);

    //Metodo para buscar por referencia
    Sales findByReference(@Param("reference") String reference);
}
