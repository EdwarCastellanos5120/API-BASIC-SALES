package com.api.api_productos.Controller;


import com.api.api_productos.Models.Provider;
import com.api.api_productos.Services.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proved")
public class ProviderController {

    @Autowired
    private IProviderService provedService;

    @GetMapping("/list")
    public List<Provider> list() {
        return provedService.listProvendered();
    }

    @PostMapping("/create")
    public Provider create(@RequestBody Provider provider) {
        return provedService.createdProvider(provider);
    }

    @PutMapping("/update/{id}")
    public Provider create(@PathVariable Long id, @RequestBody Provider provider) {
        provider.setId(id);
        return provedService.updateProvider(provider);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        provedService.deleteProvider(id);
    }

    @GetMapping("/search/byId/{id}")
    public Optional<Provider> searchById(@PathVariable("id") Long id) {
        return provedService.searchProviderById(id);
    }

    @GetMapping("/search/byNit/{nit}")
    public Provider searchByNit(@PathVariable("nit") String nit) {
        return provedService.searchProviderByNit(nit);
    }

    @GetMapping("/search/byName/{name}")
    public Provider searchByName(@PathVariable("name") String name) {
        return provedService.searchProviderByName(name);
    }

    @GetMapping("/search/byAddress/{address}")
    public Provider searchByAddress(@PathVariable("address") String address) {
        return provedService.searchProviderByAddress(address);
    }
}
