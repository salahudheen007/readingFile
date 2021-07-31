package interfaceLearn;

public class Mobile implements Device {

    private String modelName;
    private int storage;
    private String os;

    public Mobile(String modelName, int storage, String os) {
        this.modelName = modelName;
        this.storage = storage;
        this.os = os;
    }

    @Override
    public String turnOn() {
        return "Turning on";
    }

    @Override
    public String turnOff() {
        return "Turning off";
    }

    @Override
    public String findMyDevice() {
        return modelName + " " + os;
    }
}
