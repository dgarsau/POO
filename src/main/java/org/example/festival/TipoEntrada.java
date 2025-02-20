package org.example.festival;

public enum TipoEntrada {

    GENERAL(50),
    PISTA(30),
    VIP(500);

    private double precio;

    TipoEntrada(double precio){
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }

}
