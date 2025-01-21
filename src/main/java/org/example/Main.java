package org.example;

public class Main {
    public static void main(String[] args) {

        //mainPersona();
        //aplicacionTelevisor();
        mainPaciente();
    }

    public static void mainPersona(){

        Persona persona1 = new Persona("Pepe", "Sánchez", "12345678A", 80, 30, "Mutxamel", "Butanero");
        Persona persona2 = new Persona();

        //System.out.println(persona1.nombre + " " + persona1.apellido + " " + persona1.dni + " " + persona1.peso + " " + persona1.edad);
        //System.out.println(persona2.nombre + " " + persona2.apellido + " " + persona2.dni + " " + persona2.peso + " " + persona2.edad);

        persona1.imprimirInfoPersona();
        persona2.imprimirInfoPersona();
        System.out.println(persona1.concatenar());

        System.out.println("Antes: " + persona1.getNombre());
        persona1.setNombre("Pepa");
        System.out.println("Después: " + persona1.getNombre());

    }

    public static void aplicacionTelevisor(){

        System.out.println("Televisor encendido.");
        Televisor televisor1 = new Televisor();
        System.out.println("-------------------");
        televisor1.setVolumen(25);

    }

    public static void mainPaciente(){

        Paciente paciente_manuel = new Paciente("Manuel", 21, 'H', 65, 1.79F);
        paciente_manuel.mostrarInfoPaciente();
        Paciente paciente1 = new Paciente();
        paciente1.mostrarInfoPaciente();
        Paciente paciente2 = new Paciente("Manuel 2", 21, 'H');
        paciente2.mostrarInfoPaciente();

    }

}