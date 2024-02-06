package com.minisuper;

class Producto implements Comparable<Producto> {
    public static final String FRUTILLAS = "Frutillas";
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " + descripcion + (esFrutillas() ? "" : " /// Precio: $" + precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean esFrutillas() {
        return nombre.equals(FRUTILLAS);
    }
}