package ecole.ensa.etudiant.metier;
import java.sql.SQLException;

import ecole.ensa.etudiant.model.Etudiant;

public interface IEtudiantMetier {
	Etudiant searchEtudiantByCin(String cin) throws ClassNotFoundException, SQLException;
	void ajouterEtudiant(String cin,String nom) throws ClassNotFoundException, SQLException;
	void supprimerEtudiant(String cin) throws ClassNotFoundException, SQLException;
}
