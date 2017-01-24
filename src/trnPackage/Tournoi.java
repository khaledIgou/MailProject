package trnPackage;

import java.util.ArrayList;

/**
 * Write a description of class Tournoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tournoi
{
    private String nom;
    private int nombreEquipes;
    private ArrayList<Equipe> equipes;
    
    public String getNom()  {  
        return nom;
    }
    public int getNombreEquipes()  {  
        return nombreEquipes;
    }

    public ArrayList<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}
	public Tournoi(String name)
    {
        this.nom=name;
        this.nombreEquipes = 0;
        this.equipes=new ArrayList<Equipe>();
    }
    
    
    /**
     * ajouter une équipe à un tournoi
     * 
     * @param  nomTournois   le nom du tournoi
     */
    public int addTeam(String nomTournoi)
    {
        // put your code here
        if(nomTournoi.equals(this.nom)){
        	nombreEquipes=nombreEquipes+1;
        }
        return nombreEquipes;
    }
    
    public int addTeam(Equipe equipe)
    {
        this.equipes.add(equipe); 
        this.nombreEquipes++;
        return nombreEquipes;
    }
    
    public void disqualifyTeam(Equipe equipe) 
    {
    	for (Equipe eq: this.equipes) {
    		if (eq.getNomEquipe()==equipe.getNomEquipe()) {
    			eq.setStatus("disqualifi�");
    		}
    	}
    	this.nombreEquipes--;
    }
}
