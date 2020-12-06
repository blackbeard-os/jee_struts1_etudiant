package ecole.ensa.etudiant.dao;

import java.sql.SQLException;

import ecole.ensa.etudiant.model.Etudiant;

public interface IEtudiantDao {
	
	Etudiant selectEtudiantByCin(String cin) throws ClassNotFoundException, SQLException;
	void ajouterEtudiant(String cin,String nom) throws ClassNotFoundException, SQLException;
	void supprimerEtudiant(String cin) throws ClassNotFoundException, SQLException;
	
}
