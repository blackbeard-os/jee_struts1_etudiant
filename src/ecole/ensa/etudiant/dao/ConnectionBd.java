package ecole.ensa.etudiant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBd {
	private Connection connection;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jee-mvc2","root","");
		System.out.println("Connexion etablie");
		return connection;
	}

}
