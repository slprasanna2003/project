package project.project;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void test() throws InterruptedException
    {
        App a=new App();
        assertEquals(8, a.multiply(8));
        assertEquals(16, a.multiply(8));
        assertEquals(24, a.multiply(8));
        assertEquals(32, a.multiply(8));
        assertEquals(40, a.multiply(8));
        assertEquals(48, a.multiply(8));
        assertEquals(56, a.multiply(8));
        assertEquals(64, a.multiply(8));
        assertEquals(72, a.multiply(8));
        assertEquals(80, a.multiply(8));
    }
}
