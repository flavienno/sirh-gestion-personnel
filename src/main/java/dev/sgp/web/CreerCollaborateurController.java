package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class CreerCollaborateurController extends HttpServlet {

	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// indique à la servelt de déléguer l'affichage à la jsp
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateurs.jsp").forward(req, resp);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		 ResourceBundle data = ResourceBundle.getBundle("application");				
//		 String suffixe = data.getString("suffixe.email");
		String dateDeNaissance = req.getParameter("dateNaiss");
		String adresse = req.getParameter("adresse");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String numSecu = req.getParameter("numSecu");

		
		boolean flag = false;

		if (dateDeNaissance == null || "".equals(dateDeNaissance.trim())) {
			req.setAttribute("erreurdateDeNaiss", true);
			flag = true;
		}

		if (adresse == null || "".equals(adresse.trim())) {
			req.setAttribute("erreurAdresse", true);
			flag = true;
		}

		if (nom == null || "".equals(nom.trim())) {
			req.setAttribute("erreurNom", true);
			flag = true;
		}

		if (prenom == null || "".equals(prenom.trim())) {
			req.setAttribute("erreurPrenom", true);
			flag = true;
		}
		if (numSecu == null || "".equals(numSecu.trim())) {
			req.setAttribute("erreurSecu", true);
			flag = true;
		}

		if (flag == false) {
			Collaborateur collaborateur = new Collaborateur();
			collaborateur.setNom(nom);
			collaborateur.setPrenom(prenom);
			collaborateur.setNumSecu(numSecu);
			collaborateur.setAdresse(adresse);
			collaborateur.setDateDeNaissance(LocalDate.parse(dateDeNaissance));

			collabService.sauvegarderCollaborateur(collaborateur);
			//req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
			resp.sendRedirect("/sgp/collaborateurs/lister");
		} else {

			req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateurs.jsp").forward(req, resp);
			resp.setStatus(400);

		}

	}

}
