package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, int quantiteArgent) {
		super(nom, "shochu", quantiteArgent);

	}

	public void donner(Commercant benef) {
		int q=getQuantiteArgent() * 10/100;
		benef.gagnerArgent(q);
		parler(benef.getNom()+" prends ces "+ q + " sous "); 
		benef.parler(q+ " sous ! je te remercis genereux donneur! "); 
		
	}

}
