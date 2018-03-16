package oop.abstraction;

public abstract class Pet {

    //abstarct yra klase kuri extendins sita klase tures overridint visus abstracius metodus arba pati turi buti paskelbta abstrakcia

    public abstract String name();

    public abstract String spalva();

    public abstract String type();

    public void eat() {

        System.out.println("Ir dar kiek");

    }

}
