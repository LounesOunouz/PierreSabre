package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
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
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n");
		Ronin r =new Ronin("Roco", 60); 
		r.direBonjour();
		r.donner(marco);
		Ronin r2=new Ronin("Roco", 54);
		Yakuza y2 = new Yakuza("Yaku Le Noir ", 45, "Warsong"); 
		System.out.println("~~~~~~~~Bataille ronin yakuza~~~~~~~~~\n");
		r2.provoquer(y2);
		
	}

}
