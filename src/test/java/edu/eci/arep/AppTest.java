package edu.eci.arep;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testMediaCorrecta() {
        LinkedList list = new LinkedList();
        Double x = 5.0;
        list.addNode(5.0);
        list.addNode(1.0);
        list.addNode(10.0);
        list.addNode(2.0);
        list.addNode(7.0);
        assertEquals(x, Operations.mean(list));
    }

/*

    @Test
    public void testMediaIncorrecta()
    {
        LinkedList list = new LinkedList();
        Double x = 7.0;
        list.addNode(5.0);
        list.addNode(1.0);
        list.addNode(10.0);
        list.addNode(2.0);
        list.addNode(7.0);
        assertNotEquals(x, Operations.mean(list));
    }

    @Test
    public void testStdDevCorrecta()
    {
        LinkedList list = new LinkedList();
        Double x = 3.67;
        list.addNode(5.0);
        list.addNode(1.0);
        list.addNode(10.0);
        list.addNode(2.0);
        list.addNode(7.0);
        assertEquals(x, Operations.stdDev(list));
    }

    @Test
    public void testStdDevIncorrecta()
    {
        LinkedList list = new LinkedList();
        Double x = 5.67;
        list.addNode(5.0);
        list.addNode(1.0);
        list.addNode(10.0);
        list.addNode(2.0);
        list.addNode(7.0);
        assertNotEquals(x, Operations.stdDev(list));
    }

    @org.junit.Test
    public void testMediaColumnaUno(){
        LinkedList list = new LinkedList();
        Double x = 550.60;
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
        assertEquals(x,Operations.mean(list));
    }

    @org.junit.Test
    public void testStdDevColumnaUno(){
        LinkedList list = new LinkedList();
        Double x = 572.03;
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
        assertEquals(x,Operations.stdDev(list));
    }*/
}