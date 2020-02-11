
public class LadderKlimmen extends Attractie {
		double prijs = 5.00;
		String typeAtrractie = "LadderKlimmen";
		
		
		LadderKlimmen(String naam, int oppervlakte, boolean risicoAttractie, boolean gokAttractie){
		super(naam, oppervlakte, risicoAttractie, gokAttractie);
	}

	public double getPrijs() {
		return prijs;
	}
	
}
