package com.ecommerce.controllers;

import com.ecommerce.models.Producto;
import com.ecommerce.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "productos")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/all")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }

    @PostMapping
    public void saveProducto(@RequestBody Producto producto){
        productoService.guardarProducto(producto);
    }

}
