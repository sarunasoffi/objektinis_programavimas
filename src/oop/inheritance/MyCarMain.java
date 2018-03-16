package oop.inheritance;

public class MyCarMain {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.kebuloTipas() + " " + car.maxSpeed() + " " + car.spalva());

        //referencinam extend bmw klase ir overridinam duomenis
        Car c = new Bmw();

        System.out.println(c.kebuloTipas() + " " + c.maxSpeed() + " " + c.spalva());

        Car audi = new Audi();

        System.out.println(audi.kebuloTipas() + " " + audi.maxSpeed() + " " + audi.spalva());

    }

}
