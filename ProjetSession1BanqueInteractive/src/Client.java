/*
La classe Client :
Application : Banque Intractive
Session 1: Hiver 2018
Groupe : APOO , Gr: 00233
*/


import java.util.Scanner;
public class Client {

	private String nom;
	private String prenom;
	private String courriel;
	private String numTel;
	private String adresse;
	
	private static final int NBCOMPTES = 100;
	private int nbComptes=0;
	
	private Compte [] comptes = new Compte[NBCOMPTES];
	
	//constructeur
	public Client(String nom, String prenom, String courriel, String numTel, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.courriel = courriel;
		this.numTel = numTel;
		this.adresse = adresse;
	}
	//constructeur2
	public Client(String s) {
		nom=s;
	}
	//getter
	public int getNbcomptes() {
		return nbComptes;
	}
	
	Scanner clavier = new Scanner(System.in);
	//fonction qui affiche le menu client pour gerer les comptes d'un client
	public void menuClient () {
		Scanner clavier = new Scanner(System.in);
		byte choix;
		  do {
		
		System.out.println("===================================================");
	    System.out.println("|                   MENU CLIENT                   |");
		System.out.println("===================================================");
	    System.out.println("| Options:                                        |");
	    System.out.println("|        1. Créer un compte                       |");
	    System.out.println("|        2. Afficher un compte                    |");
	    System.out.println("|        3. Créer une ligne comptable             |");
	    System.out.println("|        4. Faire des opérations comptable        |");
	    System.out.println("|        5. Demande d'information                 |");
	    System.out.println("|        6. Sortir                                |");
		System.out.println("===================================================");
		
	    System.out.println("Entrez votre choix svp");
	    choix = clavier.nextByte();		
		
	  	    switch (choix)
		    {
		    case 1: 
		    	ajouterCompte();
		    	break;
		    	
		    case 2:
		    	if (getNbcomptes()==0) System.out.println("Aucun compte existant");
		    	else {
		    	afficherLesComptes();
		    	byte c2;
		    	do {
		    	System.out.print ("|Quel compte souhaitez vous afficher ? : ");
				c2 = clavier.nextByte();
		    	}while(c2>getNbcomptes() || c2<1);
				afficherCompte(c2);
		    	}
				break;
		    	
		    case 3:
		    	if (getNbcomptes()==0) System.out.println("Merci de créer avant tout un compte");
		    	else {
		    	
		    	afficherLesComptes();
		    	byte c3;
		    	do {
		    	System.out.print("|Entrez le numéro de compte  à créditer ou débiter : ");
		    	c3 = clavier.nextByte();
		    	}while(c3>getNbcomptes() || c3 < 1);
		    	lancerLigneComptable(c3);
		    	}
		    	break;
		    	
		    case 4:
		    	menuOperation();
		    	break;
		   
		    case 5:
		    	menuAide();
		    	break;
		    case 6:
		    	break;
		    }
			
		}while(choix!=6);
	}
	
	
	
	//fonction qui ajoute un compte a un client existant
	public void ajouterCompte() { 
		nbComptes+=1;
		byte choice;
		do{
		System.out.println("===================================================");
	    System.out.println("|                MENU TYPE DE COMPTE              |");
	    System.out.println("===================================================");
	    System.out.println("| Options:                                        |");
	    System.out.println("|        1. Compte chèque                         |");
	    System.out.println("|        2. Compte joint                          |");
	    System.out.println("|        3. Compte epargne                        |");
		System.out.println("===================================================");
	    choice = clavier.nextByte();
	   switch(choice)
	   {
	   case 1 : comptes[nbComptes] = new CompteCheque(); 
	   break;
	   case 2: comptes[nbComptes] = new CompteJoint(); 
	   break;
	   case 3:	comptes[nbComptes] = new CompteEpargne(); 
	   break;
	   }
		}while (choice<1 || choice >3);
	   System.out.println("Le compte n°: "+nbComptes+" a ete créé");
		System.out.println("===================================================");
	   System.out.println();
	}
	//fonction qui calcule le solde total d'un client
	public double soldeTotal(){
	double x=0;
	for (int i=1;i<=nbComptes;i++) 
		x=x+comptes[i].getSoldeInit();
	return x;
	}
	//affiche le solde totale d'un client
	public void afficherSolde() {
	System.out.println("Le solde de l'utilisateur est de "+soldeTotal()+"e");
	}
	//affiche le bilan des comptes d'un client
	public void afficherBilan(){
		
		System.out.println("                de M. ou Mme "+nom);
	for (int i=1;i<=nbComptes;i++)
		System.out.println("| Le solde du compte n: "+i+" est de "+comptes[i].getSoldeInit());
		System.out.println("| Le solde du total des comptes est de: "+ soldeTotal());
		System.out.println("===================================================");
		System.out.println();
	}
	//getter
	public String getNom() {
	return nom;
	}
	//fonction qui affiche la des differents comptes d'un client
	public void afficherLesComptes () {
		System.out.println("===================================================");
		System.out.println("|                  LISTE DES COMPTES              |");
		System.out.println("===================================================");
		for (int i=1;i<=nbComptes;i++) 
			System.out.println("Compte n° "+i+") numéro :"+comptes[i].getNumCpte());
		System.out.println("___________________________________________________");
		System.out.println();
	}
	//fonction qui affiche les informations d'un compte du client ainsi que les lignes comptables dans ce compte
	public void afficherCompte (byte choix) {
		
		System.out.println("|Le compte n° : " + comptes[choix].getNumCpte() + " est un compte " +comptes[choix].getTypeCpte());
		
		if (comptes[choix].getTypeCpte()== "Epargne") 
			System.out.println("|Le taux de placement est de : "+comptes[choix].toString());
		
		comptes[choix].afficheLigneCompt();
		System.out.println("|La valeur du compte est de : "+comptes[choix].getSoldeInit());	
		if (comptes[choix].getSoldeInit() <0) System.out.println("Votre solde est débiteur.");
		System.out.println("===================================================");
		System.out.println();
	}
	
	
	//fonction qui appelle la fonction de creation d'une ligne comptable de la classe Compte
		//pour ajouter la ligne comptable au compte du client
	public void lancerLigneComptable (byte c) {
		
		comptes[c].creerLigne();
	}
	//Affiche les soldes de tout les comptes du client
	public void afficherSoldeDesComptes (){
		for (int i=1;i<=nbComptes;i++) 
			System.out.println("|Compte n° "+i+") "+"solde : "+comptes[i].getSoldeInit());
			System.out.println();
		}
	//getter
	public Compte getCompte(int numero) {
	return comptes[numero];
	}
	//la fonction de menu operations qui permet de realiser les operations sur un compte du client
		//en demandant a l'utilsateur les infromations necessaires
	public void menuOperation() {
	
		boolean fini=false;

	while(!fini) {

		System.out.println("===================================================");
	    System.out.println("|                 MENU OPERATIONS                 |");
		System.out.println("===================================================");
	    System.out.println("| Options:                                        |");
	    System.out.println("|        1. Faire un depot                        |");
	    System.out.println("|        2. Faire un retrait                      |");
	    System.out.println("|        3. Faire un virement                     |");
	    System.out.println("|        4. Afficher le bilan des comptes         |");
	    System.out.println("|        5. Revenir au menu princial              |");
		System.out.println("===================================================");
		System.out.println("Votre choix:");
		byte reponse=clavier.nextByte();

	switch (reponse) {
		case 1:
			if (getNbcomptes()==0) System.out.println("Merci de créer avant tout un compte");
	    	else {
			System.out.print("|De quel montant? "); 
			double depot =clavier.nextDouble();
			
			
			System.out.println("|Choisissez le compte:");
			afficherSoldeDesComptes ();
			System.out.print("|Votre choix:");
		
			
			comptes[clavier.nextByte()].depot(depot); 
			System.out.println("|Le depot a été effectué"); 
			System.out.println("___________________________________________________");
			System.out.println();
	    	}
			break; 
		case 2:
			if (getNbcomptes()==0) System.out.println("Merci de créer avant tout un compte");
	    	else {
			System.out.print("|De quel montant?  "); 
			double retrait =clavier.nextDouble(); 
			
			System.out.println("|Choisissez le compte:");
			afficherSoldeDesComptes ();
			System.out.print("|Votre choix:");
		
			
			comptes[clavier.nextByte()].retrait(retrait); 
			System.out.println("|Le retrait a été effectué"); 
			System.out.println("___________________________________________________");
			System.out.println();
	    	}
			break; 
		case 3:
			if (getNbcomptes()<2) System.out.println("Il faut au moins 2 comptes pour utiliser cette fonctionnalité");
	    	else {
			
			System.out.print("|De quel montant? "); 
			double montant = clavier.nextDouble(); 
			
			System.out.println("|Choisissez le compte:");
			afficherSoldeDesComptes ();
			System.out.println("|Votre choix:");
			
			System.out.print("|Compte emetteur? ");
			int emetteur = clavier.nextInt(); 
			System.out.print("|Compte destinataire? "); 
			int destinataire = clavier.nextInt();
			 
			if ((emetteur<=nbComptes) && (destinataire<=nbComptes) || (emetteur == destinataire) ){
				comptes[emetteur].virer(montant,comptes[destinataire]); 
				System.out.println("|Le virement a ette effectue"); 
				System.out.println("___________________________________________________");
				System.out.println();
				}
			else {
				System.out.println("|Un des comptes n'existe pas"); 
				System.out.println("___________________________________________________");
				System.out.println();
				}
	    	}
			break; 
		case 4:
			if (getNbcomptes()==0) System.out.println("Aucun compte de créer");
	    	else {
	    		System.out.println("===================================================");
	    		System.out.println("|                   BILAN DES COMPTES             |");
	    		System.out.println("===================================================");
	    		afficherBilan();
	    	}
			break; 
		case 5:
			fini=true; 
		
			
	}
	}
	}
	//la fonction qui affiche le medu d'aide
	public void menuAide () {
		System.out.println("===================================================");
	    System.out.println("|                     MENU AIDE                   |");
		System.out.println("===================================================");
	    System.out.println("| Option 1: Créer un compte                       |");
	    System.out.println("|   1. Pour creer un compte Chèque                |");
	    System.out.println("|   2. Pour creer un compte Joint                 |");
	    System.out.println("|   3. Pour creer un compte Epargne               |");
	    System.out.println("|                                                 |");
	    System.out.println("| Saisir le numero du compte et la première       |");
	    System.out.println("|  valeur creditée. Pour un compte Epargne        |");
	    System.out.println("|  entrer le taux                                 |");
	    System.out.println("|-------------------------------------------------|");
	    System.out.println("| Option 2: Le système affiche les donnees        |");
	    System.out.println("|           d'un compte saisie                    |");
	    System.out.println("|-------------------------------------------------|");
	    System.out.println("| Option 3: Ecrire une ligne comptable            |");
	    System.out.println("|-------------------------------------------------|");
	    System.out.println("|-------------------------------------------------|");
	    System.out.println("| Option 4: Effectuer des opérations              |");
	    System.out.println("|           comptables                            |");
	    System.out.println("|-------------------------------------------------|");
	    System.out.println("| Option 5: Pour afficher l'aide                  |");
	    System.out.println("|-------------------------------------------------|");
	    System.out.println("| Option 6: Quitter le programme                  |");
		System.out.println("===================================================");
	}
	
}
