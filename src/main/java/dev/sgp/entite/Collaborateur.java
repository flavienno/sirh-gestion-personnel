package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;

public class Collaborateur {

	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String adresse;
	private String numSecu;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Boolean actif=true;
	private String intitulePoste;
	private Departement departement;
	/**
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param adresse
	 * @param numSecu
	 * @param emailPro
	 * @param photo
	 * @param dateHeureCreation
	 * @param actif
	 */
	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateDeNaissance, String adresse,
			String numSecu, String emailPro, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {
		 
		this.matricule =UUID.randomUUID().toString();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numSecu = numSecu;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}
	public Collaborateur() {
		// TODO Auto-generated constructor stub
	}
	/** Getter
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/** Setter
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/** Getter
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	/** Setter
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	/** Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/** Getter
	 * @return the numSecu
	 */
	public String getNumSecu() {
		return numSecu;
	}
	/** Setter
	 * @param numSecu the numSecu to set
	 */
	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}
	/** Getter
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}
	/** Setter
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	/** Getter
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/** Setter
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/** Getter
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	/** Setter
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	/** Getter
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}
	/** Setter
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	/** Getter
	 * @return the intitulePoste
	 */
	public String getIntitulePoste() {
		return intitulePoste;
	}
	/** Setter
	 * @param intitulePoste the intitulePoste to set
	 */
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}
	/** Getter
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}
	/** Setter
	 * @param departement the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
	
}
