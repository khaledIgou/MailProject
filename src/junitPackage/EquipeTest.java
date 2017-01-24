package junitPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;
import trnPackage.*;

public class EquipeTest extends TestCase {

	@Test
	public void testAddTeam() {
		Tournoi tournoi = new Tournoi("tournoi1");
		
		Equipe equipes[] = {new Equipe("equipe1"), new Equipe("equipe2")};
		
		tournoi.addTeam(equipes[0]);
		tournoi.addTeam(equipes[1]);
		
		ArrayList<Equipe> trnEquipes=tournoi.getEquipes();
		
		assertEqualArray(equipes, trnEquipes);
	
	}

	private void assertEqualArray(Equipe[] equipes, ArrayList<Equipe> trnEquipes) {
		assertEquals(equipes[0].getNomEquipe(), trnEquipes.get(0).getNomEquipe());
		assertEquals(equipes[1].getNomEquipe(), trnEquipes.get(1).getNomEquipe());
	}

}
