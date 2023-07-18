package com.api.api_productos.Services;

import com.api.api_productos.Models.Proved;

import java.util.List;
import java.util.Optional;

public interface IProvedService {
    List<Proved> listProvendered();

    Proved createdProved(Proved proved);

    Proved updateProved(Proved proved);

    void deleteProved(Long id);

    Optional<Proved> searchProvedById(Long id);

    Proved searchProvedByNit(String nit);

    Proved searchProvedByName(String name);

    Proved searchProvedByAddress(String address);

}
