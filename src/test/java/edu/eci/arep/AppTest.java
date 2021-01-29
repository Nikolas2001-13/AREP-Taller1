package edu.eci.arep;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{
    @Test
    public void testMediaCorrecta() {
        LinkedList list = new LinkedList();
        list.addNode(5.0);
        list.addNode(1.0);
        list.addNode(10.0);
        list.addNode(2.0);
        list.addNode(7.0);
        assertEquals(5.0, Operations.mean(list));
    }

}
/*

    @Test
    public void testMediaIncorrecta()
    {
        LinkedList list = new LinkedList();
        list.addNode(5.0);
        list.addNode(1.0);
        list.addNode(10.0);
        list.addNode(2.0);
        list.addNode(7.0);
        assertNotEquals(7.0, Operations.mean(list));
    }

    @Test
    public void testStdDevCorrecta()
    {
        LinkedList list = new LinkedList();
        list.addNode(5.0);
        list.addNode(1.0);
        list.addNode(10.0);
        list.addNode(2.0);
        list.addNode(7.0);
        assertEquals(3.67, Operations.stdDev(list));
    }

    @Test
    public void testStdDevIncorrecta()
    {
        LinkedList list = new LinkedList();
        list.addNode(5.0);
        list.addNode(1.0);
        list.addNode(10.0);
        list.addNode(2.0);
        list.addNode(7.0);
        assertNotEquals(5.67, Operations.stdDev(list));
    }

    @org.junit.Test
    public void testMediaColumnaUno(){
        LinkedList list = new LinkedList();
        list.addNode(160.0);
        list.addNode(591.0);
        list.addNode(114.0);
        list.addNode(229.0);
        list.addNode(230.0);
        list.addNode(270.0);
        list.addNode(128.0);
        list.addNode(1657.0);
        list.addNode(624.0);
        list.addNode(1503.0);
        assertEquals(550.60,Operations.mean(list));
    }

    @org.junit.Test
    public void testStdDevColumnaUno(){
        LinkedList list = new LinkedList();
        list.addNode(160.0);
        list.addNode(591.0);
        list.addNode(114.0);
        list.addNode(229.0);
        list.addNode(230.0);
        list.addNode(270.0);
        list.addNode(128.0);
        list.addNode(1657.0);
        list.addNode(624.0);
        list.addNode(1503.0);
        assertEquals(572.03,Operations.stdDev(list));
    }
}*/
