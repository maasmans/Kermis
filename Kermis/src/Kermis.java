import java.util.Scanner;

public class Kermis {

	public static void main(String[] args) {
	
		BotsAuto botsAuto = new BotsAuto("Botsers", 20, false, true);
		Spin spin = new Spin("Dn spinnerd", 40, true, false);

		botsAuto.draaien();

	}

	
	
	
	
	static public char startScherm() {
		System.out.println("Hallo welkom op de kermis!");
		System.out.println("Hier kan je een attractie laten draaien doormiddel van een specifieke invoer.");
		System.out.println("Hieronder staan de mogelijkheden:");
		System.out.println(
				"1 voor botsauto's, \r\n" + 
				"2 voor spin, \r\n" + 
				"3 voor spiegelpaleis, \r\n" + 
				"4 voor spookhuis, \r\n" + 
				"5 voor hawaii, \r\n" + 
				"6 voor ladderklimmen,\r\n" + 
				"letter o voor het weergeven van de totale kermis omzet,\r\n" + 
				"letter k voor het weergeven van het totaal aantal verkochte kaartjes.\r\n");
		
		Scanner input = new Scanner(System.in);
		char invoer = input.next().charAt(0);
		return invoer;
	}
	
	static public void VerwerkInvoer(BotsAuto botsAuto, Spin spin) {
		switch(startScherm()) {
		case '1':
			//System.out.println("Botsauto's!");
			botsAuto.draaien();
			break;
		case '2':
			//System.out.println("spin!");
			spin.draaien();
			break;
		case '3':
			System.out.println("spiegelpaleis!");
			break;
		case '4':
			System.out.println("spookhuis!");
			break;
		case '5':
			System.out.println("hawaii!");
			break;
		case '6':
			System.out.println("ladderklimmen!");
			break;
		case 'o':
			//System.out.println("totale kermis omzet!");
			Attractie.zieTotaalOmzetKermis();
			break;
		case 'k':
			//System.out.println("totaal aantal verkochte kaartjes!");
			Attractie.zieTotaalRitjesKermis();
			break;
		default:
			System.out.println("Je invoer is niet herkent sorry!");
		}
		
	}
}
