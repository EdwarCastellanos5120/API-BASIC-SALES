package com.api.api_productos.Controller;

import com.api.api_productos.Models.Customer;
import com.api.api_productos.Services.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/list")
    public List<Customer> list() {
        return customerService.listcustomer();
    }

    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer) {
        return customerService.createdCustomer(customer);
    }

    @PutMapping("/update/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer customer) {
        customer.setId(id);
        return customerService.updateCustomer(customer);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        customerService.deleteCustomer(id);
    }

    @GetMapping("/search/byId/{id}")
    public Optional<Customer> searchById(@PathVariable("id") Long id) {
        return customerService.searchCustomerById(id);
    }

    @GetMapping("/search/byDpi/{dpi}")
    public Customer searchByDpi(@PathVariable("dpi") String dpi) {
        return customerService.searchCustomerfindByDPI(dpi);
    }

    @GetMapping("/search/byKeyword/{keyword}")
    public List<Customer> searchByKeyword(@PathVariable("keyword") String keyword) {
        return customerService.searchCustomerKeyword(keyword);
    }

    @GetMapping("/search/byBirthDate/{birthDate}")
    public List<Customer> searchByBirthDate(@PathVariable("birthDate") String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(birthDate);
        return customerService.findByBirthDate(date);
    }
}

