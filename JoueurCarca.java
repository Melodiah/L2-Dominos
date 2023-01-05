
public class JoueurCarca implements interJoueur{
	
	static int nbreJoueur = 0; //8 joueurs max
	static String [] couleurPossi = {"Bleu", " Rouge", "Vert", 
								" Noir ", " Jaune ", " Rose ", 
								" Orange ", " Blanc"};
	
	private int stock = 8; //Décrémente quand on pose un partisan
	protected String nom;
	protected int age; //Le plus jeune commence selon les r�gles du Carcasonne
	protected boolean abandon = false;
	protected String couleurJoueur;
	
	public JoueurCarca(String n) {
		
		if(nbreJoueur != 8) {
			this.couleurJoueur = couleurPossi[nbreJoueur];
		}
		this.nom = n;
		nbreJoueur ++;
		
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void abandonner() {
		this.abandon = true;
	}
	
	public String afficherScore() {
		return "";
	}
	
	public boolean posableParti() {
		
		boolean rep = false;
		if(this.stock.getPartisansRestant() != 0)rep = true;
		return rep;
		
	}
	
}
