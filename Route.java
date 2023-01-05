
public class Route extends TuileCarca {

	Route(boolean h, boolean b, boolean g, boolean d){
		this.type = "Route";
		this.tuileAdja = 0;
		this.haut = h;
		this.bas = b;
		this.gauche = g;
		this.droite = d;
	}
	
	public boolean verifConnex(Route r) { //Utile après pour vérifier si la ville est bien encercl�e de rempart pour qu'il soit complet
		
		if(this.haut != false && r.bas != false) return true;
		if(this.bas != false && r.haut != false) return true;
		if(this.gauche != false && r.droite != false) return true;
		if(this.droite != false && r.gauche != false) return true;
		
		if(this.droite != false && r.haut != false) return true;
		if(this.gauche != false && r.haut != false) return true;
		if(this.droite != false && r.bas != false) return true;
		if(this.gauche != false && r.bas != false) return true;
		
		return false;
		
	}
	
}
