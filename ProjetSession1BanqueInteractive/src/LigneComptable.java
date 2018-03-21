import java.util.Date;


public class LigneComptable {
	private double valeur;
	private Date date;
	private String theme;
	private String moyenPaimenet;
	
	
	public LigneComptable(double valeur, Date date, String theme,
			String moyenPaimenet) {
	
		this.valeur = valeur;
		this.date = date;
		this.theme = theme;
		this.moyenPaimenet = moyenPaimenet;
	}


	public double getValeur() {
		return valeur;
	}


	public void setValeur(double valeur) {
		this.valeur = valeur;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	public String getMoyenPaimenet() {
		return moyenPaimenet;
	}


	public void setMoyenPaimenet(String moyenPaimenet) {
		this.moyenPaimenet = moyenPaimenet;
	}
	
	

}
