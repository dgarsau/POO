package org.example.CopaDelRey;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    private final String FORMACION = "\\d-\\d-\\d";

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo=equipo;
        setFormacionPreferida(formacionPreferida);
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if(formacionPreferida.matches(FORMACION)){
            this.formacionPreferida=formacionPreferida;
        }else {
            throw new FormacionException();
        }
    }

    public void planificarEntrenamiento(){
        System.out.println("Entrenador " + super.getNombre() + " planificando entrenamiento...");
    }

    public void hacerCambios(){
        System.out.println("Entrenador " + super.getNombre() + " haciendo cambios...");
    }

    @Override
    public void concentrarse() {
        System.out.println("Entrenador " + super.getNombre() + " concentrándose para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Entrenador " + super.getNombre() + " viajando a " + ciudad + "...");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOL");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenador " + super.getNombre() + " entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Entrandor " + super.getNombre() + " jugando un partido contra el " + rival);
    }
}
