package projekt1;

public class PracaSamodzielna1 {

	public static void main(String[] args) {

				int myd�o = 50;		//sztuki
				int szampon = 100;  //litry
				int proszek = 35;   //gramy
				
				int myd�oExpected = 150;	//sztuki
				int szamponExpected = 80;	//litry
				int proszekExpected = 220;	//gramy
						
				boolean holiday = false;
				
				System.out.println("Masz " + myd�o + " sztuk myd�a");
				System.out.println("Masz " + szampon + " litr�w szamponu");
				System.out.println("Masz " + proszek + " gram�w proszku");
				
				
				
				if (holiday && myd�o < myd�oExpected / 2) {
					int shortage = (myd�oExpected/2) - myd�o;
					System.out.println("Musisz kupi� " + shortage + " sztuk myd�a" );
				}
				else if (myd�o < myd�oExpected) {
					int shortage = myd�oExpected - myd�o;
					System.out.println("Musisz kupi� " + shortage + " sztuk myd�a" );
				}
				else {
				System.out.println("Nie musisz kupowa� myd�a");
				}
				
				
				
				if (holiday && szampon < szamponExpected / 2) {
					int shortage = (szamponExpected/2) - szampon;
					System.out.println("Musisz kupi� " + shortage + " litr�w szamponu" );
				}
				else if (szampon < szamponExpected) {
					int shortage = szamponExpected - szampon;
					System.out.println("Musisz kupi� " + shortage + " litr�w szamponu" );
				}
				else {
				System.out.println("Nie musisz kupowa� szamponu");
				}
				
				
				
				if (proszek < proszekExpected) {
					int shortage = proszekExpected - proszek;
					System.out.println("Musisz kupi� " + shortage + " gram�w proszku" );
				}
				else {
				System.out.println("Nie musisz kupowa� proszku");
				}
				


	}

}
