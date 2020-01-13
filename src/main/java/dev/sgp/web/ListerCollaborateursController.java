package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {

	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	private DepartementService depservice=Constantes.DEPART_SERVICE;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		
	// utilisation des services
	List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
	req.setAttribute("listeCollaborateurs", collaborateurs);
	
	List<Departement> departements= depservice.listerDepartement();
	req.setAttribute("listeDepartements", departements);
	
	req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
	
	}

}
