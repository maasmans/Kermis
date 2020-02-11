public class Spin extends Attractie {
		double prijs = 2.25;
		String typeAtrractie = "BotsAuto";
		
		
		Spin(String naam, int oppervlakte, boolean risicoAttractie, boolean gokAttractie){
		super(naam, oppervlakte, risicoAttractie, gokAttractie);
	}
			
	public double getPrijs() {
		return prijs;
	}
}
