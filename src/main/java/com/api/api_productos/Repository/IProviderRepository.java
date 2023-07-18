package com.api.api_productos.Repository;

import com.api.api_productos.Models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface IProviderRepository extends JpaRepository<Provider, Long> {
    Provider findByNit(@Param("nit") String nit);

    Provider findByName(@Param("name") String name);

    Provider findByAddress(@Param("address") String address);
}
