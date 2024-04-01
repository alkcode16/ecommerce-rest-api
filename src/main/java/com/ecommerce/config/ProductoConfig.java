package com.ecommerce.config;

import com.ecommerce.models.Producto;
import com.ecommerce.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductoConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProductoRepository productoRepository){
        return args -> {
            Producto leche = new Producto(
                    null,
                    "leche",

                    35.50,
                    10
            );

            Producto galletas = new Producto(
                    null,
                    "galletas",
                    29.50,
                    15
            );

            productoRepository.saveAll(
                    List.of(leche, galletas)
            );
        };
    }

}
