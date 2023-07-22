package com.api.api_productos.Services;

import com.api.api_productos.Models.Sales;
import com.api.api_productos.Repository.ISalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class SalesServiceImpl implements ISalesService {

    @Autowired
    private ISalesRepository salesRepository;

    @Override
    public List<Sales> listSales() {
        return salesRepository.findAll();
    }

    @Override
    public Sales createSales(Sales sales) {
        sales.setReference(generarStringAleatorio());
        return salesRepository.save(sales);
    }

    public  String generarStringAleatorio() {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int longitud = 10;

        StringBuilder sb = new StringBuilder(longitud);
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(indice));
        }

        return sb.toString();
    }

    @Override
    public void deleteSales(Long id) {
        salesRepository.deleteById(id);
    }

    @Override
    public void deleteByReference(String reference) {
        salesRepository.deleteByReference(reference);
    }
}
