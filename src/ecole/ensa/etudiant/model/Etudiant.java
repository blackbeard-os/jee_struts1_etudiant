package ecole.ensa.etudiant.model;

public class Etudiant {
	
	private String nom;
	private String cin;
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", cin=" + cin + "]";
	}
	public Etudiant(String nom, String cin) {
		super();
		this.nom = nom;
		this.cin = cin;
	}
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	

}
