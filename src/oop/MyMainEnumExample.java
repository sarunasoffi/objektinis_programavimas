package oop;

public class MyMainEnumExample {

    public static void main(String[] args) {

        System.out.println(Countries.LT.name());

        for (Countries c : Countries.values()) {
            System.out.println(c.name() + " " + c.getLocale());
        }

    }

}
