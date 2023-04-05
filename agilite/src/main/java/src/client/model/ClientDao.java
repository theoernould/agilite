package src.client.model;

import java.util.List;

public class ClientDao {

	private Integer id;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String telephone;
	private String mail;

	// TODO : List des comptes a référencer au client
	private List<Integer> idComptes;

	public ClientDao(Integer id, String nom, String prenom, String adresse, String codePostal, String ville, String telephone, String mail, List<Integer> idComptes) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.mail = mail;
		this.idComptes = idComptes;
	}

	public ClientDao() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Integer> getIdComptes() {
		return idComptes;
	}

	public void setIdComptes(List<Integer> idComptes) {
		this.idComptes = idComptes;
	}

	@Override
	public String toString() {
		return "ClientDao [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + ", telephone=" + telephone + ", mail=" + mail + "]";
	}

}
