/*
La classe Compte
Application : Banque Intractive
Session 1: Hiver 2018
Groupe : APOO , Gr: 00233
*/
package version2;

import java.util.Scanner;

public class Compte {
	private String typeCpte;
	protected double soldeInit;
	private String numCpte ;
	private LigneComptable [] ligne;
	private int nb;
	private static final int NBLIGNE = 100;
	
	//Constructeur
	public Compte(String type){
		Scanner clavier = new Scanner(System.in);
		
		typeCpte = type;
		System.out.println("===================================================");
		System.out.print("Entrez le numéro de compte :");
		this.numCpte = clavier.next();
    	this.soldeInit = controleSaisieValeurInit ();
    	ligne = new LigneComptable[NBLIGNE];
    	this.nb=-1;
		
		}
	//Constructeur
	public Compte(String type,String numCpte){
		typeCpte = type;
		this.numCpte = numCpte;
	}
	//getter
	public String getTypeCpte() {
		return typeCpte;
	}
	//getter
	public double getSoldeInit() {
		return soldeInit;
	}
	//getter
	public String getNumCpte() {
		return numCpte;
	}
	//fonction pour creer une ligne comptable et mis a jour le solde du compte
	public void creerLigne () {
		nb ++;
		ligne[nb] = new LigneComptable();
		soldeInit = soldeInit + ligne[nb].getValeur();	
	}
	//affiche la liste des ligne comptable d'un compte
	public void afficheLigneCompt () {
		if (nb >=0 ) {
			
			System.out.println("|        LISTE DES LIGNES COMPTABLES         ");
		 	
			for (int i = 0; i <= nb ; i++) {
				System.out.print("|Ligne comptable n°"+(i+1)+" : ");
				ligne[i].afficherLigneComptable();
			}
			
	}}
	//Affiche les informations d'un compte ainsi que la liste des lignes comptables dans ce compte
	public void afficheCpte() {

		System.out.println("___________________________________________________");
		System.out.println("Le compte n° : " + numCpte + " est un compte " +typeCpte);
				
		if (nb >= 0 ) {

			for (int i = 0; i <= nb ; i++) {
				System.out.print("Ligne comptable n°"+i+" : ");
				ligne[i].afficherLigneComptable();
			}
		}
		System.out.println("La valeur du compte est de :"+soldeInit);	
		if (soldeInit <0) System.out.println("Votre solde est débiteur.");
		System.out.println("___________________________________________________");
	}
	//fonction pour valider que la valeur entree par l'utilisateur est positive
	private double controleSaisieValeurInit () {
		Scanner clavier = new Scanner(System.in);
		double val;
		do {
		System.out.print("Entrez le premier versement :");
		val = clavier.nextDouble();
		}while (val<=0);
	return val;	
	}
	
	//pour faire un depot sur le compte
	public void depot(double valeur) {
		if (valeur>0)
			soldeInit=soldeInit + valeur;
		}
	//pour faire un retrait du compte
	public void retrait(double valeur) {
		if (valeur>0)
			soldeInit=soldeInit - valeur;
		}
	//pour virer une somme d'un compte a un autre compte
	public void virer(double value,Compte cpt) {
		if (value>0) { 
			cpt.depot(value); 
			retrait(value);
		}
		}
}
