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

    public Proveedor(String idPersona, String nombre, String correo, String ruc, String rubro, List<Producto> listaProductos) {
        super(idPersona, nombre, correo);
        this.ruc = ruc;
        this.rubro = rubro;
        this.listaProductos = new ArrayList<>(listaProductos); // Copia defensiva
    }

    // Método para agregar productos
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        producto.setProveedor(this);  // Relación bidireccional
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

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}