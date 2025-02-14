package org.example.redes_sociales;

public class Streamer extends Usuario{

    private int numero_retransmisiones;
    private double horas_directo;

    public Streamer(String nombre, int edad, String username, int seguidores, int numero_retransmisiones, double horas_directo) {
        super(nombre, edad, username, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;
    }

    public void mostrarInfo(){
        System.out.println("Información del Streamer:");
        super.mostrarInfoBase();
        System.out.println("Retransmisiones realizadas: " + numero_retransmisiones);
        System.out.println("Horas de directo: " + horas_directo);

        AppRedSocial.separador();
    }

}
