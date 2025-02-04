package org.example.biblioteca;

public class AppBiblio {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Manuel", "2ASIR", "manuel@manuel.manuel");
        Editorial editorial = new Editorial("Freelance", "España");

        Libro Libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", editorial);
        Libro Libro2 = new Libro("Crítica de la razón pura", "Immanuel Kant", editorial);
        Libro Libro3 = new Libro("Gerónimo Stilton", "La rata", editorial);

        System.out.println("-----------------------------------------");

        System.out.println(Libro1);
        System.out.println(Libro2);
        System.out.println(Libro3);

        System.out.println("-----------------------------------------");

        Libro.getTotalLibros();
        Libro.getLibrosDisponibles();

        System.out.println("-----------------------------------------");

        Prestamo prestamo = Libro1.prestar(estudiante1);
        Prestamo prestamo2 = Libro2.prestar(estudiante1);

        System.out.println("-----------------------------------------");

        System.out.println(estudiante1);
        System.out.println(Libro1);
        System.out.println(prestamo);

        System.out.println("-----------------------------------------");

        Libro1.devolver(estudiante1);
        System.out.println(Libro1);

    }
}
