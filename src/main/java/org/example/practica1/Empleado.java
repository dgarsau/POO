package org.example.practica1;

public class Empleado {

    private int cantidadEmpleados=0;
    private String[] cargos = {""};

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;


    public Empleado(String nombre, String cargo, Empleado director) {
        this.nombre = nombre;
        setCargo(cargo);
        setDirector(cargo, director);
        cantidadEmpleados++;
        id=calcularId(cantidadEmpleados);
    }

    private String calcularId(int cantidadEmpleados) {
        return String.format("EP%03d", cantidadEmpleados);
    }

    public void setDirector(String cargo, Empleado director) {
        if(cargo.equals("director")){
            this.director=null;
        } else {
            this.director = director;
        }
    }

    public void setCargo(String cargo) {
        cargo=cargo.toLowerCase();
        if(cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador")){
            this.cargo = cargo;
        } else {
            this.cargo = "pte";
        }

    }

    //GETTERS SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    @Override
    public String toString(){
        return "(Nombre: " + nombre + ", ID:" + id + ", Cargo: " + cargo + ")";
    }

}
