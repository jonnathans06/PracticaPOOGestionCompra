package ec.edu.ups.poo.clases;

import java.util.List;
import java.util.ArrayList;

public class Proveedor extends Persona {
    private String ruc;
    private String rubro;
    private List<Producto> listaProductos;

    //Constructores
    public Proveedor() {
        this.listaProductos = new ArrayList<>();
    }

    public Proveedor(String idPersona, String nombre, String correo, String ruc, String rubro) {
        super(idPersona, nombre, correo);
        this.ruc = ruc;
        this.rubro = rubro;
        this.listaProductos = new ArrayList<>(listaProductos);
    }

    //Getters y Setters
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRubro() {
        return rubro;
    }
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    //Método para agregar productos
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    //Método para imprimir los proveedores
    public void imprimirProveedores(Proveedor[] proveedores) {
        for (int i = 0; i < proveedores.length; i++) {
            if (proveedores[i] != null) {
                System.out.println(proveedores[i].toString());
            }
        }
    }

    //toString
    @Override
    public String toString() {
        return "Proveedor {" +
                "idPersona='" + getIdPersona() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", ruc='" + ruc + '\'' +
                ", rubro='" + rubro + '\'' +
                ", listaProductos=" + listaProductos +
                '}';
    }
}