package com.p1;

import static org.junit.Assert.*;

import org.junit.Test;
// import com.p1.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //assertTrue( true );
        assertEquals(12,App.checkMonth());
    }
}
