package exercises.chapter7;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {

    @BeforeClass
    public static void setup(){
        System.out.println("Starting unit tests ComputerProgramTests");
    }

    @Test
    public void laptopInheritsSuperInFirstConstructor() {
        Laptop laptop = new Laptop("Macbook Air", 2, 87654321, "intel", "Apple", "bluetooth", "Bluetooth enabled");
        assertEquals("Macbook Air", laptop.getName());
    }

    @Test
    public void smartphoneInheritsSuperInFirstConstructor() {
        Smartphone smartphone = new Smartphone("iPhone 11 Plus", 10, 246810, "iOS13", "Apple", 12.45);
        assertEquals(10, smartphone.getMemory());
    }

    @Test
    public void laptopMethodPrintReturnsTrue() {
        Laptop laptop = new Laptop("Macbook Air", 2, 87654321, "intel", "Apple", "bluetooth", "Bluetooth enabled");
        assertEquals(true, laptop.printDocument());
    }

    @Test
    public void includesLaptopMonitor() {
        Laptop laptop = new Laptop("Macbook Air", 2, 87654321, "intel", "Apple", "bluetooth", "Bluetooth enabled");
        assertEquals("bluetooth", laptop.getMonitor());
    }

    @Test
    public void computerNeedsUpdateReturnsTrue() {
        Computer computer = new Computer("Desktop", 1, 13579, "AMD", "Eriq");
        assertEquals(true, computer.needsUpdate());
    }

    @Test
    public void superSaveDocumentReturnsTrue() {
        Computer computer = new Computer("Desktop", 1, 13579, "AMD", "Eriq");
        assertEquals(true, computer.saveDocument());
    }

    @Test
    public void superCheckEmailReturnsTrue() {
        Computer computer = new Computer("Desktop", 1, 13579, "AMD", "Eriq");
        assertEquals(true, computer.checkEmail());
    }

    @Test
    public void inheritedCheckEmailReturnsTrue() {
        Smartphone smartphone = new Smartphone("iPhone 11 Plus", 10, 246810, "iOS13", "Apple", 12.45);
        assertEquals(true, smartphone.checkEmail());
    }

    @Test
    public void inheritedSaveDocumentReturnsTrue() {
        Laptop laptop = new Laptop("Macbook Air", 2, 87654321, "intel", "Apple", "bluetooth", "Bluetooth enabled");
        assertEquals(true, laptop.saveDocument());
    }

    @Test
    public void smartphoneMakeCallMethodReturnsTrue() {
        Smartphone smartphone = new Smartphone("iPhone 11 Plus", 10, 246810, "iOS13", "Apple", 12.45);
        assertEquals(true, smartphone.makeCall());
    }
}
