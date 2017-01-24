package junitPackage;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import trnPackage.*;

/**
 * The test class OrganisateurTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OrganisateurTest
{
    /**
     * Default constructor for test class OrganisateurTest
     */
    public OrganisateurTest()
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
    public void demarrerTournoi()
    {
        Tournoi tournoi1 = new Tournoi("cup");
        Organisateur organisa2 = new Organisateur("cup", tournoi1);
        assertEquals(5, organisa2.demarrerTournoi(5));
        assertEquals(5, tournoi1.getNombreEquipes());
       
    }
    @Test
    public void testAddTeam()
    {
        Tournoi tournoi1 = new Tournoi("foot");
        Organisateur organisa2 = new Organisateur("cup", tournoi1);
        organisa2.demarrerTournoi(5);
        organisa2.getTournoi().addTeam("foot");
        assertEquals(organisa2.getTournoi().getNombreEquipes(), 6);
    }
    
    @Test
    public void testDequialifierTeam()
    {
        Tournoi tournoi1 = new Tournoi("foot");
        
        Equipe equipes[] = {new Equipe("equipe1"), new Equipe("equipe2")};
        tournoi1.addTeam(equipes[0]);
        tournoi1.addTeam(equipes[1]);
        
        tournoi1.disqualifyTeam(equipes[0]);
        
        assertEquals(tournoi1.getNombreEquipes(),1);
        assertEquals(tournoi1.getEquipes().get(0).getStatus(),"disqualifié");
    }
}

