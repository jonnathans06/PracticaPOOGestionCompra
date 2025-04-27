package ec.edu.ups.poo.clases;

public class ProductoTecnologia extends Producto{
    private String gama;

    //Constructores
    public ProductoTecnologia() {
    }

    public ProductoTecnologia(String codigo, String nombre, double precioUnitario, Proveedor proveedor, String gama) {
        super(codigo, nombre, precioUnitario, proveedor);
        this.gama = gama;
    }

    //Getters y Setters
    public String getGama() {
        return gama;
    }
    public void setGama(String gama) {
        this.gama = gama;
    }


    @Override
    public double calcularCostoEspecial() {
        switch (gama) {
            case "Baja":
                return getPrecioUnitario() * 1.05;
            case "Media":
                return getPrecioUnitario() * 1.10;
            case "Alta":
                return getPrecioUnitario() * 1.15;
            default:
                return getPrecioUnitario();
        }
    }

    @Override
    public String toString() {
        return "ProductoTecnologia {codigo='" + getCodigo() + "', nombre='" + getNombre() +
                "', precioUnitario=" + getPrecioUnitario() + ", gama='" + gama + "'}";
    }
}
