
public class Attractie {	
	String naam;
	int oppervlakte;
	double prijs = 0;
	boolean actief = false;
	int ritjes = 0;
	double omzet = 0;
	String typeAtrractie = "onbekend";
	
	Attractie(String naam, int oppervlakte){
		this.naam = naam;
		this.oppervlakte = oppervlakte;

	}
	
	/**
	 * Deze methode laat zien of de attractie momenteel draait of niet. Dit is afhankelijk van de boolean instance variabele actief
		Zie het nut hier nog niet van in actief zou pas iets kunnen beteken als je een timer zou gebruiken of iets dergelijk
		mogelijk verwijderen in toekomst
	 */
	public void checkOfActief() {
		if(actief) {
			System.out.println("Momenteel is deze attractie actief");
		}
		else if(!actief) {
			System.out.println("Momenteel is deze attractie NIET actief");
		}

	}

	/**
	 * Laat de attractie een keer draaien, verhoogt de omzet met de attractie prijs en incrementeerd ritjes met 1
	 */
	public void draaien() {
		System.out.println("Je hebt de attractie met het type \"" + typeAtrractie + "\" "  +  "genaamd \"" + naam + "\" geactiveerd");
		
		ritjes++;
		System.out.println("Het aantal ritjes is nu verhoogd met één naar " + ritjes);
		
		omzet += prijs;
		System.out.println("De omzet is nu verhoogt met " + prijs + " naar " + omzet + " euro in totaal.");
	}
	/**
	 * Geeft het totaal aantal ritjes van de attractie (object)
	 */
	public void zieTotaalRitjes() {
		System.out.println("Het totaal aantal ritjes dat " + naam + " gedraaid heeft is " + ritjes);
	}





}
