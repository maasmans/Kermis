
public class Attractie {	
	String naam;
	int oppervlakte;
	double prijs;
	boolean actief = false;
	int ritjes = 0;
	double omzetAttractie = 0;
	static double omzetAlleAttracties = 0;
	static int ticketsAlleAttracties = 0;
	String typeAtrractie = "onbekend";
	boolean risicoAttractie;
	boolean gokAttractie;
	int ritjesNaOnderhoud = 0;
	
	Attractie(String naam, int oppervlakte, boolean risicoAttractie, boolean gokAttractie){
		this.naam = naam;
		this.oppervlakte = oppervlakte;
		this.risicoAttractie = risicoAttractie;
		this.gokAttractie = gokAttractie;
		
		if(risicoAttractie) {
			System.out.println("Je hebt zojuist de attractie genaamd "+ naam +" met grootte " + oppervlakte + " gecreeërd! Deze attractie zal vanwege behorend "
					+ "tot de risicogroep getest moeten worden."  );
			opstellingsKeuring();	
		}else { 
			System.out.println("Je hebt zojuist de attractie genaamd "+ naam +" met grootte " + oppervlakte + " gecreeërd! Deze attractie zal niet getest hoeven te worden.\n"  );
			}
	}
	/**
	 * Belasting betalen en optellen bij int kansSpelBelasting voor één ritje + het geld van omzetAttractie en omzetAlleAttracties afhalen.
	 */
	public void kansSpelBelasting(){ // probleem dat je de prijs van de child class moet gebruiken dus deze methode moet in iedere child class zitten.
		//Mischien werkt het wel als ik het gewoon aanroep in de child class draaien() methode , werkt niet de prijs is dan nog steeds nul.
		double belasting = 0.3 * prijs;
		System.out.println("De belasting die betaald moet worden is " + belasting);
		omzetAttractie -= 0.3 * prijs;
		omzetAlleAttracties -= 0.3 * prijs;
	}
	
	/**
	 * Veranderd de instance field "ritjesNaOnderhoud" weer naar nul
	 */
	public void onderhoud() {
		System.out.println("Onderhoud wordt nu uitgevoerd, het aantal ritjesNaOnderhoud staat weer op 0!");
		ritjesNaOnderhoud = 0;
	}
	
	public void opstellingsKeuring() {
		System.out.println("De keuring wordt ondergaan voor de attractie " + naam + " en wordt voor nu altijd doorstaan.\n");
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
	
	public double getPrijs() {
		return prijs;
	}
	
	/**
	 * Laat de attractie een keer draaien, verhoogt de omzet met de attractie prijs en incrementeerd ritjes met 1
	 */
	public void draaien() {
		System.out.println("Je hebt de attractie met het type \"" + typeAtrractie + "\" "  +  "genaamd \"" + naam + "\" geactiveerd");
		
		ritjes++;
		ritjesNaOnderhoud++;
		ticketsAlleAttracties++;
		System.out.println("Het aantal ritjes is nu verhoogd met één naar " + ritjes);
		
		omzetAttractie += prijs;
		omzetAlleAttracties += prijs;
		
		if(gokAttractie) {
		System.out.println("Omdat dit een gokAttractie is zal er extra belasting betaald moeten worden.");
		kansSpelBelasting();
		}
		
		System.out.println("De omzet van deze attractie is nu verhoogt met " + getPrijs() + " naar " + omzetAttractie + " euro in totaal. \n");
	}
	
	
	/**
	 * Geeft het totaal aantal ritjes van de attractie (object)
	 */
	static public void zieTotaalRitjesKermis() {
		System.out.println("Het totaal aantal ritjes dat de hele kermis gedraaid heeft is " + ticketsAlleAttracties);
	}

	public void zieTotaalRitjesAttractie() {
		System.out.println("Het totaal aantal ritjes dat de attractie " + naam + " gedraaid heeft is " + ritjes);
	}
	
	static public void zieTotaalOmzetKermis() {
		System.out.println("De totale omzet van de kermis is " + omzetAlleAttracties + " euro in totaal." );
	}


}
