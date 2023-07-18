package com.api.api_productos.Services;

import com.api.api_productos.Models.Provider;

import java.util.List;
import java.util.Optional;

public interface IProviderService {
    List<Provider> listProvendered();

    Provider createdProvider(Provider provider);

    Provider updateProvider(Provider provider);

    void deleteProvider(Long id);

    Optional<Provider> searchProviderById(Long id);

    Provider searchProviderByNit(String nit);

    Provider searchProviderByName(String name);

    Provider searchProviderByAddress(String address);

}
