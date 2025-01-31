package org.example.casa;

public class AppCasa {

    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 40);
        casa.agregarHabitacion("Cocina", 35);
        casa.agregarHabitacion("Baño", 10);
        casa.mostrarHabitaciones();

        casa.getHabitaciones().get(0).agregarElectrodomestico("Gofrera", 101468.7);
        casa.getHabitaciones().get(0).agregarElectrodomestico("Air Fryer", 253456.2);
        casa.getHabitaciones().get(1).agregarElectrodomestico("Televisión", 323534346.2);

        casa.getHabitaciones().get(0).mostrarElectrodomésticos();
        casa.getHabitaciones().get(1).mostrarElectrodomésticos();

        double consumo = casa.getHabitaciones().get(0).calcularConsumo();
        System.out.println(consumo);

        casa.consumoMáximo();

        casa.eliminarHabitacion("Dormitorio");

        System.out.println("La habitación más grande es: " + casa.getHabitacionMasGrande());

        casa.agregarHabitacion("Baño", 10);

    }

}
