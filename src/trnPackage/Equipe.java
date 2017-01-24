package trnPackage;

public class Equipe {
	private String nomEquipe;
	private String status;

	public String getNomEquipe() {
		return nomEquipe;
	}

	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}

	public Equipe(String nomEquipe) {
		super();
		this.nomEquipe = nomEquipe;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
