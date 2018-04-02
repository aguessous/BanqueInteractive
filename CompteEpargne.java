/*
La classe CompteEpargne  : classe fille de la classe Compte
Application : Banque Intractive
Session 1: Hiver 2018
Groupe : APOO , Gr: 00233
*/
package version2;

import java.util.Scanner;

public class CompteEpargne extends Compte{

	
	private double taux;
	//Constructeur
	public CompteEpargne() {
		super("Epargne");
		this.taux = controleSaisieTaux ();	
	}
	//getter
	public double getTaux() {
		return taux;
	}
	//Fonction qui ettends la fonction afficheCpte de la classe mere Compte
	public void afficheCpte () {
		super.afficheCpte();
		System.out.println("Le taux de placement est de :"+taux);
	}
	//Fonction pour valider la valeur du taux qui doit etre positive
	public double controleSaisieTaux () {
		Scanner clavier = new Scanner(System.in);
		do {
		System.out.print("Entrez le taux de placement en % :");
		taux = clavier.nextDouble();
		}while (taux<0);
		return taux;
	}
	//Fonction toString
	public String toString() {
		String str = "" ;
		str += taux;
		return str;
	} 
}
