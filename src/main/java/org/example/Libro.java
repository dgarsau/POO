package org.example;

public class Libro {

    public static int cantidadLibros = 0;
    public static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        cantidadLibros++;
        librosDisponibles++;
        this.id=calcularId(cantidadLibros);
        this.disponible=true;
    }

    private String calcularId(int cantidadLibros){

        return String.format("LIB%03d", cantidadLibros);

//        String idcalculada = "LIB";
//        String idcalculada2 = Integer.toString(cantidadLibros);
//
//        while (idcalculada.length() + idcalculada2.length()!=6){
//            idcalculada+=0;
//        }
//        id = idcalculada + idcalculada2;

//        if (cantidadLibros<10){
//            id = "LIB"+"00"+cantidadLibros;
//        } else if (cantidadLibros<100){
//            id = "LIB"+"0"+cantidadLibros;
//        } else {
//            id = "LIB"+cantidadLibros;
//        }
    }

    public void prestar(){
        if(disponible) {
            disponible = false;
            System.out.println("El libro " + titulo + " ha sido prestado.");
            librosDisponibles--;
            System.out.println("Libros disponibles después del prestamo: " + librosDisponibles);
        } else {
            System.out.println("ERROR. El libro no está disponible.");
        }
    }

    public void devolver(){
        if(!disponible){
            disponible = true;
            System.out.println("El libro " + titulo + " ha sido devuelto.");
            librosDisponibles++;
            System.out.println("Libros disponibles después de la devolución: " + librosDisponibles);
        } else {
            System.out.println("ERROR. El libro ya está devuelto.");
        }
    }

    public void estaDisponible(){
        if(!disponible){
            disponible = true;
            librosDisponibles++;
        }
    }

    public static void getTotalLibros(){
        System.out.println("Total de libros creados: " + cantidadLibros);
    }

    public static void getLibrosDisponibles(){
        System.out.println("Libros disponibles: " + librosDisponibles);;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString(){
        return this.titulo + ", " + this.autor + ", " + this.id + ", Disponible:" + this.disponible;
    }
}
