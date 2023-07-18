package com.api.api_productos.Repository;

import com.api.api_productos.Models.Proved;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IProvedRepository extends JpaRepository<Proved, Long> {
    Proved findByNit(@Param("nit") String nit);

    Proved findByName(@Param("name") String name);

    Proved findByAddress(@Param("address") String address);
}
