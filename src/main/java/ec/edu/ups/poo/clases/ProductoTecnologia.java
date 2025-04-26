package ec.edu.ups.poo.clases;

public class ProductoTecnologia extends Producto{
    private double garantia;
    private String marca;

    //Constructores
    public ProductoTecnologia() {
    }

    public ProductoTecnologia(String codigo, String nombre, double precioUnitario, Proveedor proveedor, double garantia, String marca) {
        super(codigo, nombre, precioUnitario, proveedor);
        this.garantia = garantia;
        this.marca = marca;
    }

    //Getters y Setters
    public double getGarantia() {
        return garantia;
    }
    public void setGarantia(double garantia) {
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
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
