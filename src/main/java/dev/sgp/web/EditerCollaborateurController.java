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

		// reponse si le matricule est nul ou si presente des espaces au début
		// ou à la fin
		if (matriculeParam == null || "".equals(matriculeParam.trim())) {

			// optionnel indique au client le format attendu
			resp.setContentType("text/html");

			// la réponse envoi un code erreur 400 et un message
			resp.setStatus(400);
			resp.getWriter().write("Un matricule est attendu");

			// ou elle envoie la liste des collaborateurs
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

		// si l'un d'entre eux est nul ou presente des espaces au début ou à la
		// fin
		if (matriculeParam == null || "".equals(matriculeParam.trim()) || titreParam == null
				|| "".equals(titreParam.trim()) || nomParam == null || "".equals(nomParam.trim()) || prenomParam == null
				|| "".equals(prenomParam.trim())) {
			// optionnel indique au client le format attendu
			resp.setContentType("text/html");
			resp.setStatus(400);
			resp.getWriter()
					.write("<h1>Liste des collaborateurs</h1> </br> <h2>Erreur Les paramètres suivants sont incorrects :</h2>"
							+ "<ul>");
			resp.getWriter().write("<li>matricule  " + matriculeParam + "</li>");
			resp.getWriter().write("<li>titre  " + titreParam + "</li>");
			resp.getWriter().write("<li>nom  " + nomParam + "</li>");
			resp.getWriter().write("<li>prenom  " + prenomParam + "</li>");

		} else {
			resp.setStatus(200);
			resp.getWriter()
					.write("<h1>Edition de collaborateur</h1>" + "<ul>" + "<li>Matricule=" + matriculeParam + "</li>"
							+ "<li>Matricule = " + matriculeParam + "</li>" + "<li>titre = " + titreParam + "</li>"
							+ "<li>nom = " + nomParam + "</li>" + "<li>prenom = " + prenomParam + "</li>" + "</ul>");
		}

	}

}
