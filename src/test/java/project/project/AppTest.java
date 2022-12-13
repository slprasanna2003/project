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
    @Test
    public void test1() throws InterruptedException
    {
        App a=new App();
        assertEquals(6, a.multiply(6));
        assertEquals(12, a.multiply(6));
        assertEquals(18, a.multiply(6));
        assertEquals(24, a.multiply(6));
        assertEquals(30, a.multiply(6));
        assertEquals(36, a.multiply(6));
        assertEquals(42, a.multiply(6));
        assertEquals(48, a.multiply(6));
        assertEquals(54, a.multiply(6));
        assertEquals(60, a.multiply(6));
    }
}
