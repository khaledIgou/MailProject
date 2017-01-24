package junitPackage;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import trnPackage.*;

/**
 * The test class TournoiTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TournoiTest
{
    /**
     * Default constructor for test class TournoiTest
     */
    public TournoiTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void addTeam()
    {
        Tournoi tournoi2 = new Tournoi("foot");
        assertEquals(1, tournoi2.addTeam("foot"));
    }
}

