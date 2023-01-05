
//Pour faciliter la modélisation des tuiles, une tuile ne peut pas avoir le chemin, la ville et le pré en même temps...
//Tous à une tuile propre à lui
public abstract class TuileCarca {
	
	String type;
	String nombreSortie; //Pour les routes si nombreSortie = 2 alors c'est une route avec une chaussée de part et d'autre un rond point...
	int tuileAdja; //Pour l'abbaye, si = 8 alors Abbaye complet;
	
	boolean haut; // Ca permettra d'orienter les routes / rempart des villes. Les Abbayes etc ont juste rien des 4 côtés. Contrairement aux Dominos son a pas besoin de tableau...
	boolean bas;
	boolean gauche;
	boolean droite;
	Partisans poser; //Normalement 1 maxi par tuile mais dans les règles partielles on ignore cela...

	protected TuileCarca VGauche ;
	protected TuileCarca VDroit ;
	protected TuileCarca VBas ; 
	protected TuileCarca VHaut ;
	
	public void setConnexHaut(boolean h) {
		this.haut = h;
	}
	
	public void setConnexBas(boolean b) {
		this.haut = b;
	}
	
	public void setConnexDroite(boolean d) {
		this.haut = d;
	}
	
	public void setConnexGauche(boolean g) {
		this.haut = g;
	}
	
	public void tournerGauche() {
		boolean mem = this.haut;
		this.haut = this.droite;
		this.droite = this.bas;
		this.bas = this.gauche;
		this.gauche = mem;
	}
	
	public void tournerDroite() {
		boolean mem = this.haut;
		this.haut = this.gauche;
		this.gauche = this.bas;
		this.bas = this.droite;
		this.droite = mem;
	}
	
	public void setVGauche(TuileCarca vGauche) {
		VGauche = vGauche;
	}

	public void setVDroit(TuileCarca vDroit) {
		VDroit = vDroit;
	}

	public void setVBas(TuileCarca vBas) {
		VBas = vBas;
	}

	public void setVHaut(TuileCarca vHaut) {
		VHaut = vHaut;
	}
	
}
