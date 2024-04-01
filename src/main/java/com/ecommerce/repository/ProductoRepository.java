package com.ecommerce.repository;

import com.ecommerce.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query(value = "SELECT * FROM producto WHERE descripcion like ?1", nativeQuery = true)
    Optional<Producto> findProductoByDescripcionLike(String Descripcion);
}
