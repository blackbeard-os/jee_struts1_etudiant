package ecole.ensa.etudiant.metier;
import java.sql.SQLException;

import ecole.ensa.etudiant.dao.EtudiantDao;
import ecole.ensa.etudiant.dao.IEtudiantDao;
import ecole.ensa.etudiant.metier.IEtudiantMetier;
import ecole.ensa.etudiant.model.Etudiant;

public class EtudiantMetier implements IEtudiantMetier {
	IEtudiantDao dao = new EtudiantDao();

	@Override
	public Etudiant searchEtudiantByCin(String cin) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.selectEtudiantByCin(cin);
	}
	
	@Override
	public void ajouterEtudiant(String cin,String nom) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		dao.ajouterEtudiant(cin, nom);
	}
	
	@Override
	public void supprimerEtudiant(String cin) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		dao.supprimerEtudiant(cin);
	}
	
	
}
