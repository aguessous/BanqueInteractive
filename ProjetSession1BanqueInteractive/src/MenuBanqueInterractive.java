import java.util.Scanner;

public class MenuBanqueInterractive {
private Scanner clavier = new Scanner(System.in);	
private byte choix=0;		

		public byte menuPrincipal () {
		System.out.println("=============================================");
		System.out.println("|     BIENVENUE A LA BANQUE INTERACTIVE     |");
	 	System.out.println("=============================================");
	    System.out.println("|              MENU PRINCIPAL               |");
	    System.out.println("=============================================");
	    System.out.println("| Options:                                  |");
	    System.out.println("|        1. Créer un compte                 |");
	    System.out.println("|        2. Afficher un compte              |");
	    System.out.println("|        3. Créer une ligne comptable       |");
	    System.out.println("|        4. Faire des opérations comptable  |");
	    System.out.println("|        5. Demande d'information           |");
	    System.out.println("|        6. Sortir                          |");
	    System.out.println("=============================================");
		choix = clavier.nextByte();
	    return choix;
	}
		public byte menuTypeCompte () {
		
	 	System.out.println("=============================================");
	    System.out.println("|            MENU TYPE DE COMPTE            |");
	    System.out.println("=============================================");
	    System.out.println("| Options:                                  |");
	    System.out.println("|        1. Compte chèque                   |");
	    System.out.println("|        2. Compte joint                    |");
	    System.out.println("|        3. Compte epargne                  |");
	    System.out.println("|        4. Sortir                          |");
	    System.out.println("=============================================");
		choix = clavier.nextByte();
	    return choix;
		}
		public void menuAide () {
			System.out.println("=============================================");
		    System.out.println("|                 MENU AIDE                 |");
		    System.out.println("=============================================");
		    System.out.println("| Option 1: Créer un compte                 |");
		    System.out.println("|   1. Pour creer un compte Chèque          |");
		    System.out.println("|   2. Pour creer un compte Joint           |");
		    System.out.println("|   3. Pour creer un compte Epargne         |");
		    System.out.println("|                                           |");
		    System.out.println("| Saisir le numero du compte et la première |");
		    System.out.println("|  valeur creditée. Pour un compte Epargne  |");
		    System.out.println("|  entrer le taux                           |");
		    System.out.println("|-------------------------------------------|");
		    System.out.println("| Option 2: Le système affiche les donnees  |");
		    System.out.println("|           d'un compte saisie              |");
		    System.out.println("|-------------------------------------------|");
		    System.out.println("| Option 3: Ecrire une ligne comptable      |");
		    System.out.println("|-------------------------------------------|");
		    System.out.println("|-------------------------------------------|");
		    System.out.println("| Option 4: Effectuer des opérations        |");
		    System.out.println("|           comptables                      |");
		    System.out.println("|-------------------------------------------|");
		    System.out.println("| Option 5: Pour afficher l'aide            |");
		    System.out.println("|-------------------------------------------|");
		    System.out.println("| Option 6: Quitter le programme            |");
			System.out.println("=============================================");
		}
		public void exit () {
			System.out.println("=============================================");
		    System.out.println("|                 MENU SORTIR                |");
			System.out.println("=============================================");
		    System.out.println("|           Au revoir et à bientot           |");
		    System.out.println("=============================================");
		    System.exit(0);
}
}