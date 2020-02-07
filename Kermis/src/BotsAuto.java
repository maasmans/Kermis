/**
 * 
 * Idee is dat de prijs een default value heeft die bij instantiering geinitialiseerd wordt.
 * IDEE om setPrijs method te maken
 */
public class BotsAuto extends Attractie {
		double prijs = 2.50;
		String typeAtrractie = "BotsAuto";
		
		
		BotsAuto(String naam, int oppervlakte){
		super(naam, oppervlakte);
	}
		
	public void draaien() {
		System.out.println("Je hebt de attractie met het type \"" + typeAtrractie + "\" "  +  "genaamd \"" + naam + "\" geactiveerd");
		
		ritjes++;
		System.out.println("Het aantal ritjes is nu verhoogd met één naar " + ritjes);
		
		omzet += prijs;
		System.out.println("De omzet is nu verhoogt met " + prijs + " naar " + omzet + " euro in totaal.");
	}
		
	public void SetPrijs(double prijs){
		this.prijs = prijs;
	}
	
}
