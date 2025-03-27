package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, int quantiteArgent, String cl) {
		super(nom, "Whisky", quantiteArgent);
		this.clan = cl;
	}

	public void extorquer(Commercant victime) {
		parler("Tient, tiens, ne serait-ce pas un faible marchand qui passe par là ? ");
		parler(victime.getNom() + "si tu tiens ta vie donne moi ta bourse ! ");
		int s = victime.seFaireExtorquer();
		gagnerArgent(s);
		reputation++;
		parler("J’ai piqué le s" + s + " sous de Marco, ce qui me fait " + getQuantiteArgent() + " sous dans ma\r\n"
				+ "poche. Hi ! Hi !");

	}

}
