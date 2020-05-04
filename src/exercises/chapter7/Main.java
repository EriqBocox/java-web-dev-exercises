package exercises.chapter7;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("iMac", 2, 12345678, "AMD", "Apple");
        Laptop laptop = new Laptop("Macbook Air", 2, 87654321, "intel", "IBM", "built-in", "bluetooth");
        Smartphone smartphone = new Smartphone("iPhone", 10, 246810, "iOS10", "Abby", 12.45);

//        computer.checkEmail();
//        computer.saveDocument();
//        laptop.checkEmail();
//        laptop.saveDocument();
//        smartphone.checkEmail();
//        smartphone.saveDocument();
//        System.out.println(laptop.getName());
//        System.out.println(smartphone.getName());
//        System.out.println(laptop.getProcessor());
//        System.out.println(smartphone.getProcessor());
//        System.out.println(computer.getOwner());

        System.out.println(computer.toString());
        System.out.println(laptop.toString());
        System.out.println(smartphone.toString());
    }
}
