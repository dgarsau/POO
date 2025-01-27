package org.example;

public class Libro {

    public static int cantidadLibros = 0;
    public static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial){
        this.titulo=titulo;
        this.autor=autor;
        cantidadLibros++;
        librosDisponibles++;
        id=calcularId(cantidadLibros);
        this.editorial=editorial;
        disponible=true;
        estudiantePrestado=null;
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

    public void prestar(Estudiante estudiante){
        if(disponible && estudiante.getLibroPrestado() == null) {
            disponible = false;
            librosDisponibles--;
            estudiantePrestado = estudiante;
            System.out.println("El libro " + titulo + " ha sido prestado con éxito a "+ estudiante.getNombre() + ".");
            System.out.println("Libros disponibles después del prestamo: " + librosDisponibles);
            estudiante.setLibroPrestado(this);

        } else if (estudiante.getLibroPrestado() != null) {
            System.out.println("ERROR. El estudiante "+ estudiante.getNombre() + " ya tiene un libro prestado");

        } else {
            System.out.println("ERROR. El libro "+ getTitulo() + " no está disponible.");
        }
    }

    public void devolver(Estudiante estudiante){
        if(!disponible){
            disponible = true;
            estudiantePrestado=null;
            librosDisponibles++;
            estudiante.setLibroPrestado(null);
            System.out.println("El libro " + titulo + " ha sido devuelto con éxito por " + estudiante.getNombre() + ".");
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

    public void setEstudiantePrestado(){
        this.estudiantePrestado = estudiantePrestado;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
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

    public Editorial getEditorial() {
        return editorial;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }


    @Override
    public String toString() {
        if (estudiantePrestado != null) {
            return this.titulo + ", " + this.autor + ", " + this.id + " " + this.editorial + ", Disponible:" + this.disponible + ". " + estudiantePrestado.getNombre();
        }
        return this.titulo + ", " + this.autor + ", " + this.id + " " + this.editorial + ", Disponible:" + this.disponible;
    }
}
