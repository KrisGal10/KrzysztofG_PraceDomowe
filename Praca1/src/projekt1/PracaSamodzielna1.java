package projekt1;

public class PracaSamodzielna1 {

	public static void main(String[] args) {

				int myd這 = 50;		//sztuki
				int szampon = 100;  //litry
				int proszek = 35;   //gramy
				
				int myd這Expected = 150;	//sztuki
				int szamponExpected = 80;	//litry
				int proszekExpected = 220;	//gramy
						
				boolean holiday = false;
				
				System.out.println("Masz " + myd這 + " sztuk myd豉");
				System.out.println("Masz " + szampon + " litr闚 szamponu");
				System.out.println("Masz " + proszek + " gram闚 proszku");
				
				
				
				if (holiday && myd這 < myd這Expected / 2) {
					int shortage = (myd這Expected/2) - myd這;
					System.out.println("Musisz kupi� " + shortage + " sztuk myd豉" );
				}
				else if (myd這 < myd這Expected) {
					int shortage = myd這Expected - myd這;
					System.out.println("Musisz kupi� " + shortage + " sztuk myd豉" );
				}
				else {
				System.out.println("Nie musisz kupowa� myd豉");
				}
				
				
				
				if (holiday && szampon < szamponExpected / 2) {
					int shortage = (szamponExpected/2) - szampon;
					System.out.println("Musisz kupi� " + shortage + " litr闚 szamponu" );
				}
				else if (szampon < szamponExpected) {
					int shortage = szamponExpected - szampon;
					System.out.println("Musisz kupi� " + shortage + " litr闚 szamponu" );
				}
				else {
				System.out.println("Nie musisz kupowa� szamponu");
				}
				
				
				
				if (proszek < proszekExpected) {
					int shortage = proszekExpected - proszek;
					System.out.println("Musisz kupi� " + shortage + " gram闚 proszku" );
				}
				else {
				System.out.println("Nie musisz kupowa� proszku");
				}
				


	}

}
