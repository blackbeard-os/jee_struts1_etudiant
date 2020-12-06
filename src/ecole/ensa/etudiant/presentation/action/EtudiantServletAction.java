package ecole.ensa.etudiant.presentation.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ecole.ensa.etudiant.metier.EtudiantMetier;
import ecole.ensa.etudiant.metier.IEtudiantMetier;
import ecole.ensa.etudiant.model.Etudiant;

public class EtudiantServletAction extends Action {
	// 0-Création d'un objet de la couche métier
	IEtudiantMetier metier = new EtudiantMetier();
	
	public ActionForward execute (ActionMapping mapping,ActionForm form,HttpServletRequest req, HttpServletResponse resp) throws Exception{
		//1- Récupération de la cin a partir du formulaire
		String cin = req.getParameter("cinForm");
		//2- Appel de la couhce metier
		Etudiant model = new Etudiant();
		try {
			model = metier.searchEtudiantByCin(cin);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3- Mise à jour de la requete HTTP
		//req.setAttribute("MonEtudiant", model);
		//4- Redirection vers une autre vue (etudiantVue.jsp)
		//req.getRequestDispatcher("./vues/etudiantVue.jsp").forward(req,resp);
		return mapping.findForward("success");
	}
}
