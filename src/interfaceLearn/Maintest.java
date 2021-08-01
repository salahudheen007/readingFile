package interfaceLearn;

public class Maintest {
    public static void main(String[] args) {


        Device myLaptop = new Laptop("Lenovo", "5343654", 8, "windows");

        Device myphone = new Mobile("mi s2", 64, "android");

        DeviceFinder finder=new DeviceFinder();
        finder.restart(new Device() {
            @Override
            public String turnOn() {
                return "On";
            }

            @Override
            public String turnOff() {
                return "off";
            }

            @Override
            public String findMyDevice() {
                return null;
            }
        });
    }

    public String myDevice(Device device) {
        return device.findMyDevice();
    }
}
