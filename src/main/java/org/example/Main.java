package org.example;

import org.example.pruebas_lombok.InstitutoPrueba;

public class Main {
    public static void main(String[] args) {

        InstitutoPrueba ies_alluser = new InstitutoPrueba("IES ALLUSER", "Mutxamel", "Calle Tal");
        System.out.println(ies_alluser);

        InstitutoPrueba iesmutxamel = null;
        try{
            iesmutxamel = new InstitutoPrueba(null, "Mutxamel", "Calle Tal");
        } catch (NullPointerException e){
            System.out.println("El nombre no puede ser nulo");
        }

        System.out.println(iesmutxamel);


    }
}