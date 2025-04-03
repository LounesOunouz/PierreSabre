package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, int quantiteArgent, String cl) {
		super(nom, "Whisky", quantiteArgent);
		this.clan = cl;
	}

	public int getReputation() {
		return reputation;
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

	public int perdre() {
		int s = getQuantiteArgent();
		perdreArgent(s);
		reputation--;
		parler(" J’ai perdu mon duel et mes" + s + "sous, snif... J'ai déshonoré le clan de" + clan);
		return s;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de Warsong ? Je l'ai dépouillé de ses " + gain
				+ " sous.");
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui du " + getClan());
	}

	public String getClan() {
		return clan;
	}

}
