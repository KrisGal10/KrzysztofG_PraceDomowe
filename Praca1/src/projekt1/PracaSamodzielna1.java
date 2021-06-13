package projekt1;

public class PracaSamodzielna1 {

	public static void main(String[] args) {

				int myd³o = 50;		//sztuki
				int szampon = 100;  //litry
				int proszek = 35;   //gramy
				
				int myd³oExpected = 150;	//sztuki
				int szamponExpected = 80;	//litry
				int proszekExpected = 220;	//gramy
						
				boolean holiday = false;
				
				System.out.println("Masz " + myd³o + " sztuk myd³a");
				System.out.println("Masz " + szampon + " litrów szamponu");
				System.out.println("Masz " + proszek + " gramów proszku");
				
				
				
				if (holiday && myd³o < myd³oExpected / 2) {
					int shortage = (myd³oExpected/2) - myd³o;
					System.out.println("Musisz kupiæ " + shortage + " sztuk myd³a" );
				}
				else if (myd³o < myd³oExpected) {
					int shortage = myd³oExpected - myd³o;
					System.out.println("Musisz kupiæ " + shortage + " sztuk myd³a" );
				}
				else {
				System.out.println("Nie musisz kupowaæ myd³a");
				}
				
				
				
				if (holiday && szampon < szamponExpected / 2) {
					int shortage = (szamponExpected/2) - szampon;
					System.out.println("Musisz kupiæ " + shortage + " litrów szamponu" );
				}
				else if (szampon < szamponExpected) {
					int shortage = szamponExpected - szampon;
					System.out.println("Musisz kupiæ " + shortage + " litrów szamponu" );
				}
				else {
				System.out.println("Nie musisz kupowaæ szamponu");
				}
				
				
				
				if (proszek < proszekExpected) {
					int shortage = proszekExpected - proszek;
					System.out.println("Musisz kupiæ " + shortage + " gramów proszku" );
				}
				else {
				System.out.println("Nie musisz kupowaæ proszku");
				}
				


	}

}
