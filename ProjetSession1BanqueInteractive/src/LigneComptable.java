/*
La classe LigneComptable  : 
Application : Banque Intractive
Session 1: Hiver 2018
Groupe : APOO , Gr: 00233
*/



import java.util.Scanner;

public class LigneComptable {

	private double valeur;
	private String date;
	private String motif;
	private String modePaiement;
	//Constructeur
	public LigneComptable () {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("|merci de saisir le montant à créditer (valeur positive)");
		System.out.print("|ou à débiter (valeur négative) : ");
		this.valeur = clavier.nextDouble();
		

		this.date = dateChecker();
		this.motif = menuMotifDePaiement();
		this.modePaiement=menuModePaiement();  
	}
	//getters
	public double getValeur() {
		return valeur;
	}
	//getters
	public String getDate() {
		return date;
	}
	//getters
	public String getMotif() {
		return motif;
	}
	//getters
	public String getModePaiement() {
		return modePaiement;
	}
	//Affiche les informations d'une ligne comptable 
	public void afficherLigneComptable() {
		
		System.out.print("Date de l'opération :"+date+" | Motif :"+motif+" | mode de paiment :"+modePaiement);
		if (valeur >=0) System.out.println(" | Crédit :"+valeur);
		else System.out.println(" | Débit :"+valeur);
		
	}
	//Fonction qui affiche un menu pour choisir le mode de paiement
	private String  menuModePaiement () {
		Scanner clavier = new Scanner(System.in);
		System.out.println ( "|Le mode de paiement : ");
		byte tmp2;
		do{
		System.out.println("===================================================");
	    System.out.println("|                MENU MODE PAIEMENT               |");
	    System.out.println("===================================================");
	    System.out.println("| Options:                                        |");
	    System.out.println("|        1. Carte Bancaire                        |");
	    System.out.println("|        2. Chèque                                |");
	    System.out.println("|        3. Virement                              |");
	    System.out.println("===================================================");
	    tmp2 = clavier.nextByte();
		}while (tmp2<1 || tmp2>3);
	    if (tmp2==1) {modePaiement="Carte Bancaire";} else if (tmp2==2) {modePaiement="Chèque";} else if (tmp2==3) {modePaiement="Virement";} 
		
		return modePaiement;
	}
	//Fonction qui affiche un menu pour choisir le motif de l'achat
	private String menuMotifDePaiement () {
		Scanner clavier = new Scanner(System.in);
		System.out.println ( "|Entrez le motif de l’achat ou de la vente : ");
		byte tmp;
		do{
		System.out.println("===================================================");
	    System.out.println("|             MENU MOTIF ACHAT                    |");
	    System.out.println("===================================================");
	    System.out.println("| Options:                                        |");
	    System.out.println("|        1. Salaire                               |");
	    System.out.println("|        2. Loyer                                 |");
	    System.out.println("|        3. Alimentation                          |");
	    System.out.println("|        4. Divers                                |");
	    System.out.println("===================================================");
		tmp = clavier.nextByte();
		}while (tmp<1 || tmp>4);
		if (tmp==1) {motif="Salaire";} else if (tmp==2) {motif="Loyer";} else if (tmp==3) {motif="Alimentation";} else if (tmp==4) {motif="Divers";} 
		
		return motif;
	}
	//Fonction pour valider les jours , les mois et l'annee
	public String dateChecker () {
		Scanner clavier = new Scanner(System.in);
		String dateOk = null;
		boolean dateInvalide=true;
		int jour,mois,annee;
		System.out.println("|Entrez une date JJ-MM-AAAA ");
		while(dateInvalide) {
		
		do {
		System.out.print("|Entrez le jour (JJ) : ");
		jour = clavier.nextInt();
		}while(jour <1 || jour>31);
		do {
		System.out.print("|Entrez le mois (MM) : ");
		mois =clavier.nextInt();
		}while(mois <1 || mois >12);
		do{
		System.out.print("|Entrez l'année (AAAA) : ");
		annee = clavier.nextInt();
		}while (annee<1);
		
		dateInvalide = mois < 1 || mois > 12 || jour < 0 
				|| jour > 31 || jour == 31 && (mois == 4 || mois == 6 ||
				mois == 9 || mois == 11) || jour >= 30 && mois == 2
				|| jour == 29 && mois == 2 && annee % 4 != 0;
		
		if (dateInvalide) System.out.println("|Merci de saisir une date valide !");
		dateOk=jour+"/"+mois+"/"+annee;
		}
		return dateOk;
	}
}
