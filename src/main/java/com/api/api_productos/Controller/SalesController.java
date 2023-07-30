package com.api.api_productos.Controller;

import com.api.api_productos.Models.Sales;
import com.api.api_productos.Services.ISalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
@RequiredArgsConstructor
public class SalesController {

    @Autowired
    private ISalesService salesService;

    @GetMapping("/list")
    public List<Sales> list() {
        return salesService.listSales();
    }

    @PostMapping("/create")
    public Sales create(@RequestBody Sales sales) {
        return salesService.createSales(sales);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        salesService.deleteSales(id);
    }

    @DeleteMapping("/deleteByReference/{reference}")
    public void deleteByReference(@PathVariable("reference") String reference) {
        salesService.deleteByReference(reference);
    }

    @GetMapping("/findByReference/{reference}")
    public Sales findByReference(@PathVariable("reference") String reference) {
        return salesService.findByReference(reference);
    }
}
