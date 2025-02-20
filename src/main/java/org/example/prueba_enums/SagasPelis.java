package org.example.prueba_enums;

public enum SagasPelis {

    HARRYPOTTER(8),
    CREPUSCULO(4),
    SPIDERMAN(14),
    A_TODO_GAS(11),
    SHREK(6);

    private int num_pelis;

    SagasPelis(int num_pelis){
        this.num_pelis=num_pelis;
    }

    public int getNum_pelis() {
        return num_pelis;
    }

}
