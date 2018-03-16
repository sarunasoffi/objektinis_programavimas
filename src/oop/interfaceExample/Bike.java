package oop.interfaceExample;

public class Bike implements Machine {


    @Override
    public String machineName() {
        return "Desniukas";
    }

    @Override
    public String machinePrice() {
        return "150";
    }

    @Override
    public String machineType() {
        return "Sulenkiamas";
    }
}
