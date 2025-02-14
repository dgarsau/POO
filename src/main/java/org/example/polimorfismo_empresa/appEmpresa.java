package org.example.polimorfismo_empresa;

public class appEmpresa {

    public static void main(String[] args) {

        Empleado[] empleados = {
                new Desarrollador(),
                new Disenyador(),
                new Gerente()
        };

        recorrerArray(empleados);

        Empleado gerente = new Gerente();
        Empleado desarrollador = new Desarrollador();

        System.out.println("\n=== Usando el método asignarTarea() ===");
        asignarTarea(gerente);
        asignarTarea(desarrollador);

    }

    public static void recorrerArray(Empleado[] empleados){
        System.out.println("\n=== Usando el array polimórfico ===");
        for (Empleado empleado: empleados){
            empleado.realizarTarea();
        }
    }

    public static void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }

}
