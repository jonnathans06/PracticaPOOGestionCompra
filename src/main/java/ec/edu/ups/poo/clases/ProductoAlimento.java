package ec.edu.ups.poo.clases;

public class ProductoAlimento extends Producto {
    private double peso;

    //Constructores
    public ProductoAlimento() {
    }

    public ProductoAlimento(String codigo, String nombre, double precioUnitario, Proveedor proveedor, double peso) {
        super(codigo, nombre, precioUnitario, proveedor);
        this.peso = peso;
    }

    //Getters y Setters
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public double calcularCostoEspecial() {
        return getPrecioUnitario() * peso;
    }
}
