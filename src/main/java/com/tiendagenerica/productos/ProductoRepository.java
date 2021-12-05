package com.tiendagenerica.productos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ProductoRepository extends MongoRepository<Producto, String> {

//    Optional<Producto> findByNombreProducto(String nombreProducto);
//    Producto findByCodigoProducto(String codigoProducto);

//    @Query

}
