package com.api.api_productos.Services;

import com.api.api_productos.Models.Proved;
import com.api.api_productos.Repository.IProvedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvedServiceImpl implements IProvedService {

    @Autowired
    private IProvedRepository provedRepository;

    @Override
    public List<Proved> listProvendered() {
        return provedRepository.findAll();
    }

    @Override
    public Proved createdProved(Proved proved) {
        return provedRepository.save(proved);
    }

    @Override
    public Proved updateProved(Proved proved) {
        return provedRepository.save(proved);
    }

    @Override
    public void deleteProved(Long id) {
        provedRepository.deleteById(id);
    }

    @Override
    public Optional<Proved> searchProvedById(Long id) {
        return provedRepository.findById(id);
    }

    @Override
    public  Proved searchProvedByNit(String nit) {
        return provedRepository.findByNit(nit);
    }

    @Override
    public Proved searchProvedByName(String name) {
        return  provedRepository.findByName(name);
    }

    @Override
    public Proved searchProvedByAddress(String address) {
        return  provedRepository.findByAddress(address);
    }
}
