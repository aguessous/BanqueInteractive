/*
La classe BanqueInterractiveDriver: 
Application : Banque Intractive
Session 1: Hiver 2018
Groupe : APOO , Gr: 00233
*/



import java.io.IOException;
import java.util.Scanner;

public class BanqueInterractiveDriver {

	public static void main(String[] args) {
		
		intro();
		
		String vide="";
		
		Compte cpte = new Compte (vide,vide);
		
		Banque bank = new Banque();
		bank.interaction();
		
			}
	//fonction pour afficher un menu de bienvenue 
	public static void intro (){
		
		System.out.println("          ____________________________________________________");
		System.out.println("         /                                                    \\    ");
		System.out.println("        |    _____________________________________________     | ");
		System.out.println("        |   |                                             |    | ");
		System.out.println("        |   |  C:\\>_        AMINE GUESSOUS                |    | ");
		System.out.println("        |   |               ABDELLAH  SSAFINI             |    | ");
		System.out.println("        |   |               SALIM BOULBAR                 |    | ");
		System.out.println("        |   |                                             |    | ");
		System.out.println("        |   |                                             |    | ");													
		System.out.println("        |   |                                             |    | ");
		System.out.println("        |   |             PROJET DE SESSION 1             |    | ");
		System.out.println("        |   |                                             |    | ");
		System.out.println("        |   |             BANQUE INTERACTIVE              |    | ");
		System.out.println("        |   |                                             |    | ");
		System.out.println("        |   |                                             |    | ");
		System.out.println("        |   |                                             |    | ");
		System.out.println("        |   |_____________________________________________|    | ");
		System.out.println("        |                                                      | ");
		System.out.println("        \\_____________________________________________________/    ");
		System.out.println("               \\_______________________________________/");
		System.out.println("          __________________________________________________");
		System.out.println("        _-'    .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.    -_");
		System.out.println("      _-'.-.-. .---.-.-.-.-.-.-.-.-.-.----.-.-.-.-.-.-..-.-.-.'-_");
		System.out.println("    _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-,-.-.-.----_");
		System.out.println("   _-'_-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-``.-,-.-.-.-.-_");
		System.out.println(" _-'_-'.-.-.-. .---.----------------------------------.-.-.-`__`..-.-.-_");
		System.out.println(" ------------------------------------------------------------------------");
		System.out.println(" ------------------------------------------------------------------------");		
		System.out.println("Appuyez sur la touche entrer pour continuer");
        char c;
        try
        {
           c = (char)System.in.read();
        }
            catch(IOException ioe)
           {
              System.out.println("Erreur");
              return;
           }
		
		
	}
	

	}
	

