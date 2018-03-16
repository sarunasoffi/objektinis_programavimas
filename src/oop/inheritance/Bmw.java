package oop.inheritance;

public class Bmw extends Car {

    @Override
    public int maxSpeed() {
        return 120;
    }

    @Override
    public String spalva() {
        return "raudonas";
    }

    @Override
    public String kebuloTipas() {
        return "universalas";
    }

    public void kaina() {
        System.out.println("Baise daug 2k");
    }
}
