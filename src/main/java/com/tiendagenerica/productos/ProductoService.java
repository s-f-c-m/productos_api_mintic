package com.tiendagenerica.productos;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductoService {

   private final ProductoRepository productoRepository;

    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    public void insertProducto(List<Producto> listProducto) {
        System.out.println(productoRepository.saveAll(listProducto));
    }


    public Optional<Producto> getByCodigoProducto(String codigoProducto) {
//        return productoRepository.findByCodigoProducto(codigoProducto);
        return productoRepository.findById(codigoProducto);
    }
}
