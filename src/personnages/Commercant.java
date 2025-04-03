package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int quantiteArgent) {
		super(nom, " thé", quantiteArgent);
	}

	public int seFaireExtorquer() {
		int somme = getQuantiteArgent();
		perdreArgent(somme);
		parler("J'ai tout perdu, le monde est vraiment trop injuste.");
		return somme;

	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! je te remercie généreux donateurs! ");
	}
}
