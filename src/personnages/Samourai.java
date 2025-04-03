package personnages;

public class Samourai extends Ronin {
	private String nomSeigneur;

	public Samourai(String nom, String nomSeigneur, int quantiteArgent) {
		super(nom, quantiteArgent);
		this.nomSeigneur = nomSeigneur;
	}

	public String getnomSeigneur() {
		return this.nomSeigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + getnomSeigneur());
	}

	// surcharge
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
	}

}
