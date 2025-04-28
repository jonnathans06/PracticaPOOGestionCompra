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
        System.out.println("-".repeat(37));
        System.out.println("--Departamento de Gerencia--");
        System.out.println("1. Registrar Proveedor");
        System.out.println("2. Registrar Producto");
        System.out.println("3. Ver lista de proveedores");
        System.out.println("4. Ver lista de productos");
        System.out.println("5. Buscar Proveedor por ID");
        System.out.println("6. Buscar Producto Alimento por Nombre");
        System.out.println("7. Buscar Producto Tecnología por Nombre");
        System.out.println("8. Buscar Solicitud por Número");
        System.out.println("9. Aprobar/Rechazar Solicitud");
        System.out.print("Opción: ");
        int opcionGerencia = sc.nextInt();
        sc.nextLine();

        switch (opcionGerencia) {
            case 1:
                //Método 1
                break;
            case 2:
                //Método 2
                break;
            case 3:
                //Método 3
                break;
            case 4:
                //Método 4
                break;
            case 5:
                //Método 5
                break;
            case 6:
                //Método 6
                break;
            case 7:
                //Método 7
                break;
            case 8:
                //Método 8
                break;
            case 9:
                //Método 9
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
        }
    }

    public void menuAnalistaSolicitud(Empleado empleadoSolicitudes) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n-- Departamento de Solicitudes --");
            System.out.println("1. Crear solicitud de compra");
            System.out.println("2. Listar solicitudes de compra");
            System.out.println("3. Buscar solicitud por número");
            System.out.println("4. Volver al menú principal");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    //primer método
                    break;
                case 2:
                    //segundo método
                    break;
                case 3:
                    //tercer método
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida!");
            }
        }
    }
}
