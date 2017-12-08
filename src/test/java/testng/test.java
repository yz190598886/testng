package testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
        @Test
        public void setUp() {

                System.out.println("setUp");
        }

@Test()
public void aSlowTest() {
        System.out.println("slow test");
        System.out.println("-------------------------------");
        }

@Test()
public void  FastTest(){
//        int a=0;
//        Assert.assertEquals(a,1);
        System.out.println("fast test");
        System.out.println("-------------------------------");
        }
        }