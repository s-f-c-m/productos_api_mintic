package com.tiendagenerica.productos;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data // Lombok - getter-setter-tostring
@AllArgsConstructor
@Document //mongo db mapping
public class Producto {
    @Id
    private String codigoProducto;
    private double ivaCompra;
    private int nitProveedor;
    @Indexed(unique = true)
    private String nombreProducto;
    private double precioCompra;
    private double precioVenta;

}
