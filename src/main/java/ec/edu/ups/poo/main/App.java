package ec.edu.ups.poo.main;

import ec.edu.ups.poo.clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Proveedor> proveedores = new ArrayList<>();
    static List<ProductoAlimento> productosAlimento = new ArrayList<>();
    static List<ProductoTecnologia> productosTecnologia = new ArrayList<>();
    public static void main(String[] args) {
        Departamento departamentoSolicitudes = new Departamento("Dep001", "Solicitudes");
        Departamento departamentoGerencia = new Departamento("Dep002", "Gerencia");

        Empleado empleadoSolicitudes = new Empleado("Emp001", "Juan Perez", "juanperez@gmail.com",
                "010101010", "Analista de Compras", departamentoSolicitudes);
        Empleado empleadoGerencia = new Empleado("Emp002", "Maria Sanchez", "mariasanchez@gmail.com",
                "020202020", "Gerente Compras", departamentoGerencia);

        //Productos y Proveedores por defecto

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====\n");
            System.out.println("Seleccione un empleado:");
            System.out.println("1. Juan Perez - Analista de Compras");
            System.out.println("2. Maria Sanchez - Gerente de Compras");
            System.out.print("Opción: ");
            int opcionUsuario = sc.nextInt();
            sc.nextLine();

            switch (opcionUsuario) {
                case 1:
                    //Metodo empleado 1
                    break;
                case 2:
                    //Metodo empleado 2
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