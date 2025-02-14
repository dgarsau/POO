package org.example.herencia_persona;

class Asistente extends Persona {
    protected String entrada;

    public Asistente(String nombre, int edad, String entrada) {
        super(nombre, edad);
        this.entrada = entrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }

    public void prueba(){

    }

    public void accederEvento(){
        System.out.println("Accediendo como Asistente: Buscando asiento.");
    }

}
