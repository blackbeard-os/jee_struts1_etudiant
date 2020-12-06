package ecole.ensa.etudiant.presentation.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class EtudiantForm extends ActionForm{
	private String nom;
	private String prenom;
	private String cin;
	private String tel;
	private String mail;
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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
	
	@Override
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) {
		ActionErrors erreursValidation = new ActionErrors();
		if("".equals(nom)) {
			ActionMessage m = new ActionMessage("nom.obligatoire");
			erreursValidation.add("nom.obligatoire",m);
		}
		if("".equals(prenom)) {
			ActionMessage m = new ActionMessage("prenom.obligatoire");
			erreursValidation.add("prenom.obligatoire",m);
		}
		
		if(cin == null || cin.length()>8 || cin.length()<4) {
			ActionMessage m = new ActionMessage("cin.taille");
			erreursValidation.add("cin.taille",m);
		}
		if(cin == null || !cin.matches("[a-zA-Z][a-z1-9]*$")) {
			ActionMessage m = new ActionMessage("cin.lettre");
			erreursValidation.add("cin.lettre",m);
		}
		
		if(tel == null || tel.length() != 10) {
			ActionMessage m = new ActionMessage("tel.taille");
			erreursValidation.add("tel.taille",m);
		}
		if(tel == null || !tel.matches("^[0-9]*$")) {
			ActionMessage m = new ActionMessage("tel.chiffres");
			erreursValidation.add("tel.chiffres",m);
		}
		
		if(mail == null || !mail.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
			ActionMessage m = new ActionMessage("mail.forme");
			erreursValidation.add("mail.forme",m);
		}
		
		return erreursValidation;
	}
	
}
