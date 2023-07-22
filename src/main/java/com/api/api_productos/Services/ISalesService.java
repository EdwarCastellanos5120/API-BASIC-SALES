package com.api.api_productos.Services;

import com.api.api_productos.Models.Sales;

import java.util.List;

public interface ISalesService {

    List<Sales> listSales();

    Sales createSales(Sales sales);

    void deleteSales(Long id);

    void deleteByReference(String reference);
}
