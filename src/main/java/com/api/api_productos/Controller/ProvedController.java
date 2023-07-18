package com.api.api_productos.Controller;


import com.api.api_productos.Models.Proved;
import com.api.api_productos.Services.IProvedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proved")
public class ProvedController {

    @Autowired
    private IProvedService provedService;

    @GetMapping("/list")
    public List<Proved> list() {
        return provedService.listProvendered();
    }

    @PostMapping("/create")
    public Proved create(@RequestBody Proved proved) {
        return provedService.createdProved(proved);
    }

    @PutMapping("/update/{id}")
    public Proved create(@PathVariable Long id, @RequestBody Proved proved) {
        proved.setId(id);
        return provedService.updateProved(proved);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        provedService.deleteProved(id);
    }

    @GetMapping("/search/byId/{id}")
    public Optional<Proved> searchById(@PathVariable("id") Long id) {
        return provedService.searchProvedById(id);
    }

    @GetMapping("/search/byNit/{nit}")
    public Proved searchByNit(@PathVariable("nit") String nit) {
        return provedService.searchProvedByNit(nit);
    }

    @GetMapping("/search/byName/{name}")
    public Proved searchByName(@PathVariable("name") String name) {
        return provedService.searchProvedByName(name);
    }

    @GetMapping("/search/byAddress/{address}")
    public Proved searchByAddress(@PathVariable("address") String address) {
        return provedService.searchProvedByAddress(address);
    }
}
