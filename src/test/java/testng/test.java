package testng;
import org.testng.annotations.Test;

public class test {
public void setUp() {
        System.out.println("setUp");
        }

@Test()
public void aSlowTest() {
        System.out.println("slow test");
        System.out.println("-------------------------------");
        }

@Test()
public void aFastTest() {
        System.out.println("fast test");
        System.out.println("-------------------------------");
        }
        }