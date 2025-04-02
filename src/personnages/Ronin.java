package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, int quantiteArgent) {
		super(nom, "shochu", quantiteArgent);

	}

	public void donner(Commercant benef) {
		int q = getQuantiteArgent() * 10 / 100;
		benef.gagnerArgent(q);
		parler(benef.getNom() + " prends ces " + q + " sous ");
		benef.parler(q + " sous ! je te remercis genereux donneur! ");

	}

	public void provoquer(Yakuza adversiare) {
		int force = honneur / 2;
		if (force >= adversiare.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("je t’ai eu petit yakusa!");
			int s = adversiare.perdre();
			gagnerArgent(s);
			honneur++;

		} else {
			parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversiare.gagner(getQuantiteArgent());
			perdreArgent(getQuantiteArgent());
			honneur--;
		}
	}

}
