package trnPackage;


/**
 * Write a description of class Organisateur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Organisateur
{
    private String nom;
    private Tournoi tournoi;
    
    

    public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Tournoi getTournoi() {
		return tournoi;
	}


	public void setTournoi(Tournoi tournoi) {
		this.tournoi = tournoi;
	}


	/**
     * Constructor for objects of class Organisateur
     */
    public Organisateur(String nom, Tournoi tr)
    {
        // initialise instance variables
        this.tournoi =tr;
        this.nom=nom;
        
    }

    
    public int demarrerTournoi(int nbEquipes)
    {   
        
        for (int i=0;i<nbEquipes;i++){
        this.tournoi.addTeam(this.tournoi.getNom());
        }
        return this.tournoi.getNombreEquipes();
    }
}
