package test.java.com.escale.dojo;

import main.java.com.escale.dojo.Drone;
import main.java.com.escale.dojo.FalconApplication;
import org.junit.Test;

import static org.junit.Assert.*;

public class FalconApplicationTest {

    /*
     * Some tests examples
     */
    @Test
    public void sayHello() {
        assertEquals("Hello friends!", FalconApplication.sayHelloToEveryOne());
    }

    @Test
    public void sumTwoNumbers() {
        assertEquals(5, FalconApplication.sumTwoNumbers(2, 3));
    }
}