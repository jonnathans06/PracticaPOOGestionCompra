package ec.edu.ups.poo;

import ec.edu.ups.poo.clases.*;
import ec.edu.ups.poo.enums.*;
import ec.edu.ups.poo.interfaces.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Espacio para instanciar todos los objetos
        Scanner sc = new Scanner(System.in);


        System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====\n");
        System.out.println("Seleccione su departamento: ");
        System.out.println("1. Departamento de Solicitudes");
        System.out.println("2. Departamento de Gerencia");
        System.out.print("Opcion: ");
        int opcionDepartamento = sc.nextInt();
        sc.nextLine();

        switch (opcionDepartamento) {
            case 1:
                System.out.println("-".repeat(37));
                System.out.println("Bienvenido al Departamento de Solicitudes");
                System.out.println("1. Crear Item de Solicitud");
                System.out.println("2. Ver Solicitud");
                System.out.print("Opcion: ");
                System.out.println("-".repeat(37));
                int opcionSolicitudes = sc.nextInt();

                //Revisar
                if (opcionSolicitudes != 1) {
                    System.out.println("Opción no valida.");
                } else {
                    System.out.println("--Sistema de Solicitud de Compras--");
                    ItemSolicitud iS = new ItemSolicitud();
                }

                break;
            case 2:
                System.out.println("-".repeat(37));
                System.out.println("Bienvenido al Departamento de Gerencia");
                System.out.println("1. Registrar Proveedor");
                System.out.println("2. Registrar Producto");
                System.out.print("Opcion: ");
                int opcionGerencia = sc.nextInt();
                sc.nextLine();

                switch (opcionGerencia) {
                    case 1:
                        System.out.println("-".repeat(37));
                        System.out.println("--Sistema de Creacion de Proveedores--");
                        System.out.println("¿Cuantos proveedores desea registrar?");
                        System.out.print("Opcion: ");
                        int nProveedores = sc.nextInt();
                        sc.nextLine();
                        System.out.println("-".repeat(37));

                        Proveedor[] proveedores = new Proveedor[nProveedores];
                        for (int i = 0; i < nProveedores; i++) {
                            proveedores[i] = new Proveedor();
                            System.out.println("REGISTRO DE PROVEEDOR " + (i + 1));
                            System.out.print("Ingrese el id del proveedor: "); proveedores[i].setIdPersona(sc.nextLine());
                            System.out.print("Nombre del proveedor: "); proveedores[i].setNombre(sc.nextLine());
                            System.out.print("Ingrese el correo del proveedor: "); proveedores[i].setCorreo(sc.nextLine());
                            System.out.print("Ingrese el ruc del proveedor: "); proveedores[i].setRuc(sc.nextLine());
                            System.out.print("Ingrese el rubro del proveedor: "); proveedores[i].setRubro(sc.nextLine());
                            System.out.println("-".repeat(37));
                        }
                        Proveedor proveedor = new Proveedor();
                        proveedor.imprimirProveedores(proveedores);
                        break;
                    case 2:
                        System.out.println("-".repeat(37));
                        System.out.println("--Sistema de Creacion de Productos--");
                        System.out.println("1. Crear Producto Alimento");
                        System.out.println("2. Crear Producto Tecnología");
                        System.out.print("Opcion: ");
                        int opcionProducto = sc.nextInt();
                        sc.nextLine();
                        switch (opcionProducto) {
                            case 1:
                                System.out.println("-".repeat(37));
                                System.out.println("--Sistema de Creacion de Productos Alimento--");
                                ProductoAlimento pA = new ProductoAlimento();
                                System.out.print("Ingrese el id del producto: "); pA.setCodigo(sc.nextLine());
                                System.out.print("Ingrese el nombre del producto: "); pA.setNombre(sc.next());
                                System.out.print("Ingrese el precio del producto: "); pA.setPrecioUnitario(sc.nextDouble());
                                System.out.print("Ingrese el peso del alimento: "); pA.setPeso(sc.nextDouble());
                                break;
                            case 2:
                                System.out.println("-".repeat(37));
                                System.out.println("--Sistema de Creacion de Productos Tecnologia--");
                                ProductoTecnologia pT = new ProductoTecnologia();
                                System.out.print("Ingrese el id del producto: "); pT.setCodigo(sc.nextLine());
                                System.out.print("Ingrese el nombre del producto: "); pT.setNombre(sc.next());
                                System.out.print("Ingrese el precio del producto: "); pT.setPrecioUnitario(sc.nextDouble());
                                System.out.print("Ingrese la marca del producto: "); pT.setMarca(sc.next());
                                break;
                        }
                }

        }

    }
}

/*

switch (opcionProducto) {
    case 1:
        System.out.println("-".repeat(37));
        System.out.println("--Sistema de Creacion de Productos Alimento--");
        ProductoAlimento pA = new ProductoAlimento();
        System.out.print("Ingrese el id del producto: "); pA.setCodigo(sc.nextLine());
        System.out.print("Ingrese el nombre del producto: "); pA.setNombre(sc.next());
        System.out.print("Ingrese el precio del producto: "); pA.setPrecioUnitario(sc.nextDouble());
        System.out.print("Ingrese el peso del alimento: "); pA.setPeso(sc.nextDouble());
        System.out.print("Ingrese el id del proveedor: ");
        String idProveedorAlimento = sc.next();
        // Aquí deberías buscar el proveedor por su id y asociarlo
        // Ejemplo: Proveedor proveedorAlimento = buscarProveedorPorId(idProveedorAlimento);
        // proveedorAlimento.agregarProducto(pA);
        break;
    case 2:
        System.out.println("-".repeat(37));
        System.out.println("--Sistema de Creacion de Productos Tecnologia--");
        ProductoTecnologia pT = new ProductoTecnologia();
        System.out.print("Ingrese el id del producto: "); pT.setCodigo(sc.nextLine());
        System.out.print("Ingrese el nombre del producto: "); pT.setNombre(sc.next());
        System.out.print("Ingrese el precio del producto: "); pT.setPrecioUnitario(sc.nextDouble());
        System.out.print("Ingrese la marca del producto: "); pT.setMarca(sc.next());
        System.out.print("Ingrese el id del proveedor: ");
        String idProveedorTecnologia = sc.next();
        // Aquí deberías buscar el proveedor por su id y asociarlo
        // Ejemplo: Proveedor proveedorTecnologia = buscarProveedorPorId(idProveedorTecnologia);
        // proveedorTecnologia.agregarProducto(pT);
        break;
 */