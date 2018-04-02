/*
La classe Banque
Application : Banque Intractive
Session 1: Hiver 2018
Groupe : APOO , Gr: 00233
*/
package version2;

import java.util.Scanner;

public class Banque {
	
	private int nbClients=0;
	private Client [] clients=new Client[100]; // tableau pour stocker les objets clients 
	
	//fonction pour ajouter un client a la banque 
	public void ajouterClient(String nom) { 
	nbClients+=1;
	clients[nbClients]=new Client(nom);
	}
	
	Scanner lectureClavier = new Scanner(System.in);
	//fonction pour afficher le bilan des comptes des clientsc
	
	public void afficherBilan() {
		System.out.println("===================================================");
		System.out.println("|                    BILAN DES COMPTES            |");
	 	System.out.println("===================================================");
		for (int i=1;i<=nbClients;i++) 
		clients[i].afficherBilan();
	System.out.println();
	}
	//la fonction qui permet d'interagir avec l'utilisatuer et affiche 
		//le menu principale de la l'application
	public void interaction() {
	boolean fini=false;
	while (!fini) {
		System.out.println("===================================================");
		System.out.println("|          BIENVENUE A LA BANQUE INTERACTIVE      |");
	 	System.out.println("===================================================");
	    System.out.println("|                 MENU PRINCIPAL                  |");
	    System.out.println("===================================================");
	    System.out.println("| Options:                                        |");
	    System.out.println("|        1. Ajouter un client                     |");
	    System.out.println("|        2. Afficher le bilan de la banque        |");
	    System.out.println("|        3. Effectuer une operation sur un client |");
	    System.out.println("|        4. Quitter le programme                  |");
	    System.out.println("===================================================");
	 
	int reponse=lectureClavier.nextInt();
	switch(reponse){ 
	case 1:
		System.out.println("Entrez le nom du client: "); 
		String nom=lectureClavier.next(); 
		ajouterClient(nom);
		System.out.println("Le client a été ajouté"); 
		System.out.println();
		break; 
	case 2:
		if (nbClients == 0) System.out.println("Il faut au moins un client");
		else afficherBilan();
		break; 
	case 3:
		if (nbClients == 0) System.out.println("Il faut au moins un client");
		else {
			System.out.println("Choisissez le client:");
		for (int i=1;i<=nbClients;i++) 
			System.out.println(" "+i+")"+clients[i].getNom());
	
		System.out.println("Votre choix:");
		int numero=lectureClavier.nextInt(); 
		
		clients[numero].menuClient();}
		
		break; 
	case 4:
	
		System.out.println("===================================================");
	    System.out.println("|              Au revoir et à bientot             |");
		System.out.println("===================================================");
		
		fini=true;
	}
	}
	}

}
