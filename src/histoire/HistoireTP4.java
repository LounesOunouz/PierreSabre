package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain h = new Humain("Prof", "Kombucha", 54);
		h.direBonjour();
		h.acheter("Boisson", 12);
		h.boire();
		h.acheter("jeu", 2);
		h.acheter("Kimono", 50);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n");
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n");
		Yakuza y = new Yakuza("Yaku Le Noir ", 30, "Warsong"); 
		y.direBonjour();
		y.extorquer(marco);

	}

}
