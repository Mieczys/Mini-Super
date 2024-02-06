package com.minisuper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Minisuper {
    //public static final String FRUTILLAS = "Frutillas";

    public static void main(String[] args) {
        List<Producto> productos = cargarProductos();

        imprimirListaProductos(productos);

        System.out.println("=============================");
        System.out.println("Producto más caro: " + obtenerProductoMasCaro(productos).getNombre());
        System.out.println("Producto más barato: " + obtenerProductoMasBarato(productos).getNombre());
    }

    private static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Coca-Cola Zero", "Litros: 1.5", 20));
        productos.add(new Producto("Coca-Cola", "Litros: 1.5", 18));
        productos.add(new Producto("Shampoo Sedal", "Contenido: 500ml", 19));
        productos.add(new Producto("Frutillas", "Precio: $64 /// Unidad de venta: kilo", 64));

        return productos;
    }

    private static void imprimirListaProductos(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    private static Producto obtenerProductoMasCaro(List<Producto> productos) {
        return Collections.max(productos);
    }

    private static Producto obtenerProductoMasBarato(List<Producto> productos) {
        return Collections.min(productos);
    }
}