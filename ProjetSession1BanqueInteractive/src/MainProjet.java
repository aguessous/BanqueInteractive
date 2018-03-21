import java.util.*;
	
public class MainProjet {
	
	public static void main (String [] argument) {
	byte choix;
	byte typeCpte = 0;
	double val_courante = 0.0, taux = 0.0;
	long numéroCpte = 0, numéroLu = 0 ;
	Scanner lectureClavier = new Scanner(System.in);
	
	do{
		MenuBanqueInterractive menu = new MenuBanqueInterractive();
	choix = menu.menuPrincipal();
	switch (choix){
	case 1 :
		typeCpte = menu.menuTypeCompte();
		System.out.print("Numero du compte : ");
		numéroCpte = lectureClavier.nextLong();
		System.out.print("Premiere valeur creditee : ");
		val_courante = lectureClavier.nextDouble();
		if ( typeCpte == 4) {
			System.out.println("Taux de placement : ");
			taux = lectureClavier.nextDouble();
		}
	break;
	case 2 :
		System.out.print ( " Quel compte souhaitez vous afficher ? : ");
		numéroLu = lectureClavier.nextLong();
		if ( numéroLu == numéroCpte) {
			System.out.print("Le compte n° : " + numéroCpte + " est un compte ");
			if (typeCpte == 1) System.out.println(" Chèque");
			else if (typeCpte == 2) System.out.println(" Joint");
			else if (typeCpte == 3)
				System.out.println(" Epargne dont le taux est" + taux);
			System.out.println(" Valeur initiale : " + val_courante);
		}
		else
			System.out.println("Le systeme ne connait pas le compte " + numéroLu);
		break;
	case 3 :
		System.out.print ( " Sur quel compte souhaitez vous effectuer la transaction ? : ");
		numéroLu = lectureClavier.nextLong();
		if ( numéroLu == numéroCpte) {
			System.out.print(" merci de saisir la somme à créditer (valeur positive) ou à débiter (valeur négative) :");
			double valeurLigneComptable = lectureClavier.nextLong();
			if (valeurLigneComptable >= 0) {val_courante+=valeurLigneComptable;}
			else {val_courante-=valeurLigneComptable;}
			}
			System.out.println("Date de l'opération : ");
			String dateOperation = lectureClavier.nextLine();
			System.out.println ( "Le motif de l’achat ou de la vente : ");
			byte motifAchat = menu.menuMotifAchat();
			System.out.println ( "Le mode de paiement : ");
			byte modePaiement = menu.menuModePaiement();
			
		break;
	case 4 :
		menu.menuOperation ();
		break;
	case 5 :
		menu.menuAide();
		break;
	case 6 :
		menu.exit();
		break;
	default :
		System.out.println("Cette option n'existe pas ");
		}
	} while (choix != 6);
	
	lectureClavier.close();
	}

}
	
	

