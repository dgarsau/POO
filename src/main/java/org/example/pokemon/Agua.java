package org.example.pokemon;

public class Agua extends Pokemon implements AtaquesAgua, CosasAgua{

    public Agua(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    void atacar() {
        System.out.println("PISTOLA DE ÁGUA");
    }

    @Override
    public void hidroBomba() {
        System.out.println("HIDROBOMBAAAAA");
    }

    @Override
    public void surf() {
        System.out.println("SURRRRFFF");
    }

    @Override
    public void pistolaAgua() {
        System.out.println("pssssssssssss");
    }

    @Override
    public void salpicadura() {
        System.out.println("chof chof");
    }

    @Override
    public void aquagym() {

    }
}
