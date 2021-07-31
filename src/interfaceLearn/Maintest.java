package interfaceLearn;

public class Maintest {
    public static void main(String[] args) {


        Device myLaptop = new Laptop("Lenovo", "5343654", 8, "windows");
        System.out.println(myLaptop.turnOn());
        System.out.println(myLaptop.turnOff());

        Device myphone = new Mobile("mi s2", 64, "android");
        System.out.println(myphone.turnOn());
        System.out.println(myphone.turnOff());

        Maintest main = new Maintest();
        System.out.println(main.myDevice(myphone));
        System.out.println(main.myDevice(myLaptop));

    }

    public String myDevice(Device device) {
        return device.findMyDevice();
    }
}
