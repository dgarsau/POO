package org.example.redes_sociales;

public class AppRedSocial {

    public static void main(String[] args) {
        Usuario ana = new Usuario("Ana", 30, "@ana", 231);
        Influencer luis = new Influencer("Luis", 25, "@luis_influencer", 50000);
        luis.insertarColaboracion("MediaMarkt", "Yoigo", "Temu");
        Streamer carlos = new Streamer("Carlos", 27, "@carlos_stream", 10000, 150, 2000);
        Basico persona = new Basico("Persona Normal", 22, "@pedro123", 455);

        ana.mostrarInfo();
        luis.mostrarInfo();
        carlos.mostrarInfo();
        persona.mostrarInfo();

    }

    public static void separador(){
        System.out.println("----------------------------------");
    }

}
