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
        
     }
}
