
public class Compte {
	private String numero;
	private String type;
	private LigneComptable ligneComptable[];
	private double solde;
	private double soldeInitial;
	public Compte(/*String numero, String type, LigneComptable[] ligneComptable,
			double solde, double soldeInitial*/) {
	
		/*this.numero = numero;
		this.type = type;
		this.ligneComptable = ligneComptable;
		this.solde = solde;
		this.soldeInitial = soldeInitial;*/
		solde=0.0;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LigneComptable[] getLigneComptable() {
		return ligneComptable;
	}
	public void setLigneComptable(LigneComptable[] ligneComptable) {
		this.ligneComptable = ligneComptable;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getSoldeInitial() {
		return soldeInitial;
	}
	public void setSoldeInitial(double soldeInitial) {
		this.soldeInitial = soldeInitial;
	}
	//creation depot
	public void deposer(double montant){
		solde=solde+montant;
	}
	public void retirer(double montant){
		
		solde=solde-montant;
	}
	
	
	

}
