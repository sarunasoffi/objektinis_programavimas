package oop.abstraction;

public class MyMain {

    public static void main(String[] args) {

        Pet cat = new Cat();

        System.out.println(cat.spalva() + " " + cat.name() + " " + cat.type());
        cat.eat();

    }

}
