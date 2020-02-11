
public class BotsAuto extends Attractie {
	double prijs = 2.50;
	String typeAtrractie = "BotsAuto";
		
	BotsAuto(String naam, int oppervlakte, boolean risicoAttractie, boolean gokAttractie){
	super(naam, oppervlakte, risicoAttractie, gokAttractie);
	}
		
	public double getPrijs() {
		return prijs;
	}
	
}
