package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain h = new Humain("Prof", "Kombucha", 54);
		h.direBonjour();
		h.acheter("Boisson", 12);
		h.boire();
		h.acheter("jeu", 2);
		h.acheter("Kimono", 50);
	}

}
