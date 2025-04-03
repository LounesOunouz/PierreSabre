package personnages;

public class Traitre extends Samourai {
	private int niveauTraitre = 0;

	public Traitre(String nom, String nomSeigneur, int quantiteArgent) {
		super(nom, nomSeigneur, quantiteArgent);
	}

	public int getNiveauTraitre() {
		return niveauTraitre;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler(" Mais je suis un traître et mon niveau de traîtrise est " + getNiveauTraitre() + " Chut ");
	}

	public void raconner(Commercant c) {
		if (getNiveauTraitre() < 3) {
			int a = c.getQuantiteArgent();
			int argentRaconner = a * 2 / 10;
			c.perdreArgent(argentRaconner);
			gagnerArgent(argentRaconner);
			niveauTraitre++;
			parler("Si tu veux ma protection cpntre les Yakuzas, il va falloir payez ! Donne-moi " + argentRaconner
					+ " sous ou gare toi ! ");
			c.parler("Tout de suite" + getNom());
		} else {
			parler("Mince je ne peux plus raçonnez personne sinon un samourai risque de me demasquer");
		}
	}

}
