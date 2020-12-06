package ecole.ensa.etudiant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ecole.ensa.etudiant.dao.ConnectionBd;
import ecole.ensa.etudiant.model.Etudiant;

public class EtudiantDao implements IEtudiantDao {
	public Etudiant selectEtudiantByCin(String cin) throws ClassNotFoundException, SQLException{
		//Simulation de la récupération des données
		//à partir d'un support de données
		//LDAP, DB, File
		String cne =new String();
		String nom=new String();
		ConnectionBd connectionBd=new ConnectionBd();
		Connection connection=connectionBd.getConnection();
		PreparedStatement ps=connection.prepareStatement("SELECT cne, nom FROM etudiant Where cne=?");
		ps.setString(1, cin);;
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			cne = rs.getString("cne");
			nom = rs.getString("nom");				
			System.out.println(nom+cne);
		}
		ps.close();
		connection.close();
		Etudiant e = new Etudiant(nom,cne);
		return e;
	}
	
	public void ajouterEtudiant(String cin,String nom) throws ClassNotFoundException, SQLException {
		ConnectionBd connectionBd=new ConnectionBd();
		Connection connection=connectionBd.getConnection();
		PreparedStatement ps = connection.prepareStatement("INSERT INTO etudiant(cne, nom)VALUES (?,?)");
		ps.setString(1,cin);
		ps.setString(2,nom);
		int i = ps.executeUpdate();
		if(i==1) {
			System.out.println("Insertion réussité");
		}
		else {
			System.out.println("Insertion impossible");
		}
		connection.close();
	}
	
	public void supprimerEtudiant(String cin) throws ClassNotFoundException, SQLException{
		ConnectionBd connectionBd=new ConnectionBd();
		Connection connection=connectionBd.getConnection();
		PreparedStatement ps = connection.prepareStatement("Delete From etudiant where cne=?");
		ps.setString(1,cin);
		int i = ps.executeUpdate();
		if(i==1) {
			System.out.println("Suppression réussité");
		}
		else {
			System.out.println("Suppression impossible");
		}
	}
	
}
