package org.example.bancMutxamel;

public class MetodosAux {

    public static void menuPrincipal(){

        System.out.println("MENÚ PRINCIPAL:");
        System.out.println("    [1] Mantenimiento de Clientes");
        System.out.println("    [2] Mantenimiento de Cuentas");
        System.out.println("    [X] Salir");

    }

    public static void menuClientes(){

        System.out.println("CLIENTES:");
        System.out.println("    [1] Altas");
        System.out.println("    [2] Bajas");
        System.out.println("    [3] Modificaciones");
        System.out.println("    [4] Listado de clientes");
        System.out.println("    [x] Volver al menú principal");

    }

    public static void menuCuentas(){

        System.out.println("CUENTAS:");
        System.out.println("    [1] Consultar cuentas cliente");
        System.out.println("    [2] Ver todas las cuentas");
        System.out.println("    [X] Volver al menú principal");

    }

}
