package ec.edu.ups.poo;

import ec.edu.ups.poo.clases.*;
import java.util.Scanner;

public class App {
    static Proveedor proveedor;
    static Proveedor[] proveedores;

    public static void main(String[] args) {
        // Espacio para instanciar todos los objetos
        Departamento solicitudes = new Departamento("Dep001", "Solicitudes");
        Departamento gerencia = new Departamento("Dep002", "Gerencia");

        Empleado empleado = new Empleado("Emp001", "Juan Perez", "juanperez@gmail.com", "010101010",
                "Analista de Compras", solicitudes);
        Empleado empleado2 = new Empleado("Emp002", "Maria Sanchez", "mariasanchez@gmail.com",
                "020202020", "Gerente Compras", gerencia);

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====\n");
            System.out.println("Seleccione un usuario:");
            System.out.println("1. Juan Perez - Analista de Compras");
            System.out.println("2. Maria Sanchez - Gerente de Compras");
            System.out.print("Opción: ");
            int opcionUsuario = sc.nextInt();
            sc.nextLine();

            switch (opcionUsuario) {
                case 1:
                    System.out.println("-".repeat(37));
                    System.out.println("--Departamento de Solicitudes--");
                    System.out.println("1. Crear Item de Solicitud");
                    System.out.println("Est: En desarrollo");
                    break;

                case 2:
                    System.out.println("-".repeat(37));
                    System.out.println("--Departamento de Gerencia--");
                    System.out.println("1. Registrar Proveedor");
                    System.out.println("2. Registrar Producto");
                    System.out.println("3. Ver lista de proveedores");
                    System.out.print("Opción: ");
                    int opcionGerencia = sc.nextInt();
                    sc.nextLine();

                    switch (opcionGerencia) {
                        case 1:
                            System.out.println("-".repeat(37));
                            System.out.println("--Sistema de Creación de Proveedores--");
                            System.out.println("¿Cuántos proveedores desea registrar?");
                            System.out.print("Opción: ");
                            int nProveedores = sc.nextInt();
                            sc.nextLine(); // Consumir el salto de línea restante
                            System.out.println("-".repeat(37));

                            proveedores = new Proveedor[nProveedores];
                            for (int i = 0; i < nProveedores; i++) {
                                proveedores[i] = new Proveedor();
                                System.out.println("REGISTRO DE PROVEEDOR " + (i + 1));
                                System.out.print("Ingrese el ID del proveedor: "); proveedores[i].setIdPersona(sc.nextLine());
                                System.out.print("Nombre del proveedor: "); proveedores[i].setNombre(sc.nextLine());
                                System.out.print("Ingrese el correo del proveedor: "); proveedores[i].setCorreo(sc.nextLine());
                                System.out.print("Ingrese el RUC del proveedor: "); proveedores[i].setRuc(sc.nextLine());
                                System.out.print("Ingrese el rubro del proveedor: "); proveedores[i].setRubro(sc.nextLine());
                                System.out.println("-".repeat(37));
                            }
                            proveedor = new Proveedor();
                            break;

                        case 2:
                            System.out.println("-".repeat(37));
                            System.out.println("--Sistema de Creación de Productos--");
                            System.out.println("1. Crear Producto Alimento");
                            System.out.println("2. Crear Producto Tecnología");
                            System.out.print("Opción: ");
                            int opcionProducto = sc.nextInt();
                            sc.nextLine();

                            switch (opcionProducto) {
                                case 1:
                                    System.out.println("-".repeat(37));
                                    System.out.println("--Sistema de Creación de Productos Alimento--");
                                    ProductoAlimento pA = new ProductoAlimento();
                                    System.out.print("Ingrese el ID del producto: "); pA.setCodigo(sc.nextLine());
                                    System.out.print("Ingrese el nombre del producto: "); pA.setNombre(sc.nextLine());
                                    System.out.print("Ingrese el precio del producto: "); pA.setPrecioUnitario(sc.nextDouble());
                                    System.out.print("Ingrese el peso del alimento: "); pA.setPeso(sc.nextDouble());
                                    sc.nextLine();
                                    System.out.println("-".repeat(37));
                                    System.out.println("--Lista de Proveedores--");
                                    if (proveedor == null) {
                                        System.out.println("No hay proveedores registrados, porfavor registre uno primero.");
                                    } else {
                                        proveedor.imprimirProveedores(proveedores);
                                        System.out.println("--Lista de Proveedores--");
                                        System.out.print("Ingrese el ID del proveedor: ");
                                        String idProveedorAlimento = sc.nextLine();

                                        Proveedor proveedorSeleccionado = null;
                                        for (Proveedor p : proveedores) {
                                            if (p.getIdPersona().equals(idProveedorAlimento)) {
                                                proveedorSeleccionado = p;
                                                break;
                                            }
                                        }
                                        if (proveedorSeleccionado != null) {
                                            proveedorSeleccionado.agregarProducto(pA);
                                            System.out.println("Producto agregado al proveedor: " + proveedorSeleccionado.getNombre());
                                        } else {
                                            System.out.println("Proveedor no encontrado.");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("-".repeat(37));
                                    System.out.println("--Sistema de Creación de Productos Tecnología--");
                                    ProductoTecnologia pT = new ProductoTecnologia();
                                    System.out.print("Ingrese el ID del producto: "); pT.setCodigo(sc.nextLine());
                                    System.out.print("Ingrese el nombre del producto: "); pT.setNombre(sc.nextLine());
                                    System.out.print("Ingrese el precio del producto: "); pT.setPrecioUnitario(sc.nextDouble());
                                    System.out.print("Ingrese la gama del producto: "); pT.setGama(sc.nextLine());
                                    sc.nextLine();
                                    System.out.println("--Lista de Proveedores--");
                                    if (proveedor == null) {
                                        System.out.println("No hay proveedores registrados, porfavor registre uno primero.");
                                    } else {
                                        proveedor.imprimirProveedores(proveedores);
                                        System.out.println("--Lista de Proveedores--");
                                        System.out.print("Ingrese el ID del proveedor: ");
                                        String idProveedorAlimento = sc.nextLine();

                                        Proveedor proveedorSeleccionado = null;
                                        for (Proveedor p : proveedores) {
                                            if (p.getIdPersona().equals(idProveedorAlimento)) {
                                                proveedorSeleccionado = p;
                                                break;
                                            }
                                        }
                                        if (proveedorSeleccionado != null) {
                                            proveedorSeleccionado.agregarProducto(pA);
                                            System.out.println("Producto agregado al proveedor: " + proveedorSeleccionado.getNombre());
                                        } else {
                                            System.out.println("Proveedor no encontrado.");
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("-".repeat(37));
                            System.out.println("--Lista de Proveedores--");
                            if (proveedores == null || proveedores.length == 0) {
                                System.out.println("No hay proveedores registrados.");
                            } else {
                                proveedor.imprimirProveedores(proveedores);
                            }
                            break;
                    }
                    break;
            }
            String respuesta;
            do {
                System.out.println("¿Desea continuar? (S/N)");
                respuesta = sc.nextLine().trim();
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));

            if (respuesta.equalsIgnoreCase("N")) {
                System.out.println("Gracias por usar el sistema.");
                continuar = false;
            }
        }
    }
}