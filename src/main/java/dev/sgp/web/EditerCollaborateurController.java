package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// recherche du matricule
		String matriculeParam = req.getParameter("matricule");

		// reponse
		if (matriculeParam == null || "".equals(matriculeParam.trim())) {
			// optionnel indique au client le format attendu
			resp.setContentType("text/html");
			resp.setStatus(400);
			resp.getWriter().write("Un matricule est attendu");
		} else {
			resp.setStatus(200);
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" + "<ul>" + "<li>Matricule=" + matriculeParam
					+ "</li>" + "</ul>");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// recherche du matricule, du titre, du nom, du prénom
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		
		if (matriculeParam == null || "".equals(matriculeParam.trim())
				||titreParam == null || "".equals(titreParam.trim())
				||nomParam == null || "".equals(nomParam.trim())
				||prenomParam == null || "".equals(prenomParam.trim())) 
		{
			// optionnel indique au client le format attendu
			resp.setContentType("text/html");
			resp.setStatus(400);
			resp.getWriter().write("Les paramètres suivants sont incorrects :"+matriculeParam+titreParam+nomParam+prenomParam );
		} else {
			resp.setStatus(200);
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" + "<ul>" + "<li>Matricule=" + matriculeParam
					+ "</li>" +"<li>Matricule = " + matriculeParam
					+ "</li>" +"<li>titre = " + titreParam
					+ "</li>" +"<li>nom = " + nomParam
					+ "</li>" +"<li>prenom = " + prenomParam
					+ "</li>" + "</ul>");
		}
		
	}

}
