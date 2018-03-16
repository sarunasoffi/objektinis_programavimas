package oop.interfaceExample;

public class MyConstrucorMain {

    public static void main(String[] args) {

        Student st = new Student(24, "Sarunas", "Sliogeris");

        System.out.println(st.getName() + " " + st.getSurname() + " " + st.getAge() + " metai");

    }

}
