package ec.edu.ups.poo.clases;

public class ProductoTecnologia extends Producto{
    private double garantia;
    public ProductoTecnologia(String codigo, String nombre, double precioUnitario, Proveedor proveedor, double garantia) {
        super(codigo, nombre, precioUnitario, proveedor);
        this.garantia = garantia;
    }
    public double getGarantia() {
        return garantia;
    }
    public void setGarantia(double garantia) {
        this.garantia = garantia;
    }
    @Override
    public double calcularCostoEspecial() {
        if (garantia > 12) {
            return getPrecioUnitario() * 1.10; // 10% más si tiene garantía extendida
        } else {
            return getPrecioUnitario();
        }
    }
}