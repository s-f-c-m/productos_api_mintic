package com.tiendagenerica.productos;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.HttpStatus.resolve;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/v1/productos")
@AllArgsConstructor
public class ProductoController {

    private final ProductoService productoService;
    private final JWTChecker jwtchecker;



    @PostMapping
    public void insertProducto(@RequestHeader Map<String, String> headers, @RequestBody List<Producto> listProducto) {
        if(jwtchecker.doFilter(headers)){
            productoService.insertProducto(listProducto);
        }
    }

    @GetMapping()
    public List<Producto> getAllProductos(@RequestHeader Map<String, String> headers) {
        if(jwtchecker.doFilter(headers)){
            return productoService.getAll();
        }
        return null ;
    }
    @GetMapping("/{codigoProducto}")
    public Optional<Producto> getByCodigoProducto(@RequestHeader Map<String, String> headers, @PathVariable String codigoProducto){
        if(jwtchecker.doFilter(headers)){
            return productoService.getByCodigoProducto(codigoProducto);
        }
        return null ;
//        System.out.println(temp);
//        return temp;
    }
}
