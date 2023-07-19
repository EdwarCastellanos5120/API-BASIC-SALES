package com.api.api_productos.Services;

import com.api.api_productos.Models.Provider;
import com.api.api_productos.Repository.IProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderServiceImpl implements IProviderService {

    @Autowired
    private IProviderRepository provedRepository;

    @Override
    public List<Provider> listProvendered() {
        return provedRepository.findAll();
    }

    @Override
    public Provider createdProvider(Provider provider) {
        return provedRepository.save(provider);
    }

    @Override
    public Provider updateProvider(Provider provider) {
        return provedRepository.save(provider);
    }

    @Override
    public void deleteProvider(Long id) {
        provedRepository.deleteById(id);
    }

    @Override
    public Optional<Provider> searchProviderById(Long id) {
        return provedRepository.findById(id);
    }

    @Override
    public Provider searchProviderByNit(String nit) {
        return provedRepository.findByNit(nit);
    }

    @Override
    public Provider searchProviderByName(String name) {
        return provedRepository.findByName(name);
    }

    @Override
    public Provider searchProviderByAddress(String address) {
        return provedRepository.findByAddress(address);
    }
}
