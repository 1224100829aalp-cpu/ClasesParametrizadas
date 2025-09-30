package poo;

import java.util.ArrayList;

public class MainProducto {
    public static void main(String[] args) {
              ArrayList<Producto<?>> inventario = new ArrayList<>();

        inventario.add (new Libro("Java Básico", 299.99, 350));
        inventario.add(new Electronico("Laptop ASUS", 15999.99, "2 años"));
        inventario.add (new Libro("Patrones de Diseño", 499.50, 420));
        inventario.add (new Electronico("Smartphone Samsung", 10999.00, "1año"));

        System.out.println("Inventario Completo");
        for (Producto<?> p : inventario) {
            p.mostrarDetalles();
        }
    }
}