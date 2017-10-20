package test.java.com.escale.dojo;

import main.java.com.escale.dojo.FalconApplication;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class FalconApplicationTest {
    @Test
    public void sayHello() {
        assertEquals("Hello friends!", FalconApplication.sayHelloToEveryOne());
    }

    @Test
    public void sumTwoNumbers() {
        assertEquals(5, FalconApplication.sumTwoNumbers(2, 3));
    }
}