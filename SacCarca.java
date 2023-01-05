
public class SacCarca {
	
	private int restantCarca;
	
	public SacCarca(int r) {
		this.restantCarca = r;
	}
	
	public int getRestant() {
		return this.restantCarca;
	}
	
	public boolean pairImpair() { //Permet d'économiser des lignes dans CreaTuileCarca
		
		int test = (int)(Math.random() * 10);
		boolean ret = false;
		
		if(test%2 == 0) {
			ret = true;
		}
		
		return ret;
	}
	
	public TuileCarca CreaTuileCarca() {
		
		int max = 5; //Car 5 Tuiles différents;
		int min = 1;
		int randomTuile = (int)(Math.random()*(max-min+1)+min);   //Nombre entre 5
		TuileCarca ret = new TuileVille(); //C'est pour initialisé mais il sera modifié si besoin après
		
		//On va assigné 1 = ville, elle est par ailleurs déjà assigné donc on ne fera pas de "if" pour...
		// 2 = Abbaye
		// 3 = Route;
		// 4 = Rempart;
		// 5 = Pré
		
		if(randomTuile == 2) {
			
			TuileCarca abb = new TuileAbbaye();
			ret = abb;
			
		}
		
		if(randomTuile == 3) {
			
			//pairImpair renvoie juste un true ou un false, permet de générer des tuiles diverses et variées
			TuileCarca rou = new Route(pairImpair(), pairImpair(), pairImpair(), pairImpair());
			ret = rou;
			
		}
		
		if(randomTuile == 4) {
			
			TuileCarca remp = new Rempart(pairImpair(), pairImpair(), pairImpair(), pairImpair());
			ret = remp;
			
		}
		
		if(randomTuile == 5) {
			
			TuileCarca pre = new Pre();
			ret = pre;
			
		}
		
		return ret;
	}
	
}
