package personnages;

public class Humain {
	private String nom;
	private String boissonPrefere;
	private int quantiteArgent;
	protected int nbConnaissance = 0;
	private final int nbmh = 3;
	protected Humain[] memoire = new Humain[nbmh];

	public Humain(String nom, String boissonPrefere, int quantiteArgent) {
		this.nom = nom;
		this.boissonPrefere = boissonPrefere;
		this.quantiteArgent = quantiteArgent;
	}

	public String getNom() {
		return nom;
	}

	public int getQuantiteArgent() {
		return quantiteArgent;
	}

	public String getBoissonPrefere() {
		return boissonPrefere;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + getBoissonPrefere());
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + getBoissonPrefere() + "! GLOUPS ! ");
	}

	protected void parler(String s) {
		System.out.println("(" + getNom() + ")-" + " " + s);
	}

	public void gagnerArgent(int prix) {
		quantiteArgent = quantiteArgent + prix;

	}

	public void perdreArgent(int prix) {
		quantiteArgent = quantiteArgent - prix;

	}

	public void acheter(String bien, int prix) {
		if (prix <= getQuantiteArgent()) {

			parler("J'ai " + getQuantiteArgent() + "sous en poche. Je vais pouvoir m'offrir une " + bien + " à " + prix
					+ " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai " + getQuantiteArgent() + "sous en poche. Je ne peux même pas m'ofrir un " + bien + " à "
					+ prix + " sous");
		}

	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	public void repondre(Humain autrehumain) {
		direBonjour();
		memoriser(autrehumain);
	}

	public void memoriser(Humain autrehumain2) {
		if (nbConnaissance < nbmh) {
			memoire[nbConnaissance] = autrehumain2;
			nbConnaissance++;
		} else {
			for (int i = 1; i < nbmh; i++) {
				memoire[i - 1] = memoire[i];
			}
			memoire[nbmh - 1] = autrehumain2;
		}
	}

	public void listerConnaissance() {
		System.out.print("(" + getNom() + ")-Je connais beaucoup de monde dont:");
		for (int i = 0; i < nbConnaissance; i++) {
			System.out.print(memoire[i].getNom() + " ");
		}
		System.out.println(" ");
	}

}
