package com.tiendagenerica.productos;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("api/v1/productos")
@AllArgsConstructor
public class ProductoController {

    private final ProductoService productoService;


    @PostMapping
    public void insertProducto(@RequestBody List<Producto> listProducto) {
        productoService.insertProducto(listProducto);

    }

    @GetMapping()
    public List<Producto> getAllProductos() {
        return productoService.getAll();
    }
    @GetMapping("/{codigoProducto}")
    public Optional<Producto> getByCodigoProducto(@PathVariable String codigoProducto){
       return productoService.getByCodigoProducto(codigoProducto);
//        System.out.println(temp);
//        return temp;
    }
}