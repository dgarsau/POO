package org.example.pruebas_lombok;

import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
//@Getter @Setter
//@ToString

@AllArgsConstructor
@Data
public class InstitutoPrueba {

    @NonNull
    private String nombre;
    private final String poblacion;
    private String direccion;

//    public Instituto(String nombre){
//
//        this.nombre=Objects.requireNonNull(nombre);
////        if(nombre==null){
////            System.out.println("El nombre no puede ser nulo.");
////        } else {
////            this.nombre=nombre;
////        }
//    }

}
