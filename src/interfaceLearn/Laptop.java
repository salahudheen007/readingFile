package interfaceLearn;

import java.io.StringReader;

public class Laptop implements Device {

    private String brand;
    private String modelname;
    private int ram;
    private String os;

    public Laptop(String brand, String modelname, int ram, String os) {
        this.brand = brand;
        this.modelname = modelname;
        this.ram = ram;
        this.os = os;
    }

    @Override
    public String turnOn() {
        return brand + "\n welcome";
    }

    @Override
    public String turnOff() {
        return "shutting down";
    }

    @Override
    public String findMyDevice() {
        return brand + " " + modelname;
    }
}
