package com.ecommerce.services;

import com.ecommerce.models.Producto;
import com.ecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getProductos(){
        return productoRepository.findAll();
    }

    public void guardarProducto(Producto producto){
        //productoService.guardarProducto(producto);
        System.out.println(producto);
    }
}
