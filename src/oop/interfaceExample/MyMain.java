package oop.interfaceExample;

public class MyMain {

    public static void main(String[] args) {

        Machine machine = new Bike();

        System.out.println(machine.machineName() + " " + machine.machinePrice() + " " + machine.machineType());
        print(machine);
    }

    private static void print(Machine machine) {
        System.out.println(machine.machineName() + " " + machine.machinePrice() + " " + machine.machineType());
    }
}
