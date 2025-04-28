package ec.edu.ups.poo.main;

import ec.edu.ups.poo.clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSeleccionar {
    private List<Proveedor> proveedores;
    private List<ProductoAlimento> productosAlimento;
    private List<ProductoTecnologia> productosTecnologia;
    private List<SolicitudCompra> solicitudes = new ArrayList<>();
    private Scanner sc;

    public MenuSeleccionar(List<Proveedor> proveedores, List<ProductoAlimento> productosAlimento,
                           List<ProductoTecnologia> productosTecnologia) {
        this.proveedores = proveedores;
        this.productosAlimento = productosAlimento;
        this.productosTecnologia = productosTecnologia;
        this.sc = new Scanner(System.in);
    }

    public void menuGerenteCompras(Empleado empleadoGerencia) {
        //Espacio para logica
    }

    public void menuAnalistaSolicitud(Empleado empleadoSolicitudes) {
        //Espacio para logica
    }
}
