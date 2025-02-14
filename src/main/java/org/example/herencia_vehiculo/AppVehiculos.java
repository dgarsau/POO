package org.example.herencia_vehiculo;

public class AppVehiculos {

    public static void main(String[] args) {
        Avion airbus = new Avion("Airbus", "1234DKF", 2);
        Tren ave = new Tren("AVE", "9876LKM", 8);

        airbus.imprimirInfo();
        airbus.ruido();

        ave.imprimirInfo();
        ave.ruido();


    }


}
