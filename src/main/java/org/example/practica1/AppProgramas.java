package org.example.practica1;

public class AppProgramas {

    public static void main(String[] args) {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        Entrada.separador();

        Programa el_hormiguero = new Programa("El Hormiguero", antena3, "Director 1");
        System.out.println(el_hormiguero);
        Programa la_revuelta = new Programa("La revuelta", antena3, "Director 2");
        System.out.println(el_hormiguero);

        Entrada.separador();

        System.out.println(antena3);

        Entrada.separador();

        el_hormiguero.insertarEmpleado("Pablo Motos", "Presentador");
        la_revuelta.insertarEmpleado("David Broncano", "Presentador");
        System.out.println(el_hormiguero);

        Entrada.separador();

        el_hormiguero.insertarInvitado("Aitana", "Cantante", 1);
        Entrada.separador();

        la_revuelta.insertarInvitado("Aitana", "Cantante", 1);
        Entrada.separador();
        System.out.println(el_hormiguero.getListaInvitados());

        Entrada.separador();
        el_hormiguero.invitadosTemporada(1);
        Entrada.separador();
        el_hormiguero.vecesInvitado("Aitana");
        Entrada.separador();
        el_hormiguero.rastrearVeces("Aitana");


        Entrada.separador();
        boolean vinoAitana = el_hormiguero.buscarInvitado("Aitana");
        if(vinoAitana){
            System.out.println("Sí que vino");
        }else{
            System.out.println("No vino, no");
        }

        Entrada.separador();
        antena3.invitadoAntes("Aitana");

    }

}
