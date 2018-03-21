
public class Client {
private String id;
private String nom;
private String courriel;
private int tel;
private String adresse;
private Compte sommaireCompte[]  ;
public Client(String id, String nom, String courriel, int tel, String adresse,
		Compte[] sommaireCompte) {
	
	this.id = id;
	this.nom = nom;
	this.courriel = courriel;
	this.tel = tel;
	this.adresse = adresse;
	this.sommaireCompte = sommaireCompte;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getCourriel() {
	return courriel;
}
public void setCourriel(String courriel) {
	this.courriel = courriel;
}
public int getTel() {
	return tel;
}
public void setTel(int tel) {
	this.tel = tel;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public Compte[] getSommaireCompte() {
	return sommaireCompte;
}
public void setSommaireCompte(Compte[] sommaireCompte) {
	this.sommaireCompte = sommaireCompte;
}



}
