package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "Warsong");
		Ronin roro = new Ronin("Roro", 60);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		System.out.println("~~~~~~~~~~~~test des samouerai~~~~~~~~~~~~");
		Samourai akimoto = new Samourai("Akimoto", "Miyamoto", 80);
		// akimoto.direBonjour();
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");
		// ((Ronin) akimoto).boire("thé"); // ne compile pas, la surcharge est résolue à
		// la compilation

		akimoto.boire();
		Traitre masako = new Traitre("Miyamoto", "Masako", 100);
		masako.raconner(kumi);
	}

}
