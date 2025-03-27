package personnages;

public class Humain {
	private String nom;
	private String boissonPrefere;
	private int quantiteArgent;

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

	private void parler(String s) {
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

}
