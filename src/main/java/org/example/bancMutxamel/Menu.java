package org.example.bancMutxamel;

public class Menu {

    public static void menuPrincipal(){

        System.out.println("MENÚ PRINCIPAL:");
        System.out.println("    [1] Mantenimiento de Clientes");
        System.out.println("    [2] Mantenimiento de Cuentas");
        System.out.println("    [X] Salir");
        char eleccion=Entrada.eleccionMenu();
        menuPrincipalSwitch(eleccion);

    }

    public static void menuClientes(){

        System.out.println("CLIENTES:");
        System.out.println("    [1] Altas");
        System.out.println("    [2] Bajas");
        System.out.println("    [3] Modificaciones");
        System.out.println("    [4] Listado de clientes");
        System.out.println("    [x] Volver al menú principal");
        char eleccion=Entrada.eleccionMenu();
        menuPrincipalSwitch(eleccion);


    }

    public static void menuCuentas(){

        System.out.println("CUENTAS:");
        System.out.println("    [1] Consultar cuentas cliente");
        System.out.println("    [2] Ver todas las cuentas");
        System.out.println("    [X] Volver al menú principal");
        char eleccion=Entrada.eleccionMenu();
        menuPrincipalSwitch(eleccion);

    }

    public static void menuPrincipalSwitch(char eleccion){

        switch (eleccion){
            case '1':
                menuClientes();
                break;
            case '2':
                break;
            default:
                menuPrincipal();
        }

    }


    public static void menuClientesSwitch(char eleccion){

        switch (eleccion){
            case '1':

                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            default:
                menuPrincipal();
        }

    }


}
