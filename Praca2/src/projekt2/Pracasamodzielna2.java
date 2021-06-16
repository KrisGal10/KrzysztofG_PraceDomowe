package projekt2;
import java.util.Scanner;
public class Pracasamodzielna2 {
		
		  public static void showOne(int [] pkb) {
		    Scanner read = null;
		    try {
		      read = new Scanner(System.in);
		      System.out.print("Wybierz rok: 200");
		      int year =read.nextInt();
		      if (year <= 9) {
		        System.out.println("200"+year + ": " + pkb[year]);
		      }
		      else {
		        System.out.println("Niepoprawna wartoœæ");
		      }
		    }
		    finally {
		      if (read != null) read.close();
		    }
		  }
		   

		 public static void showAll(int [] pkb) {
			    for (int i = 0; i < pkb.length;i++) {
			      System.out.println("200" + i + ": " + pkb[i]);
			    }
			  }
			   
		
		 public static void showMax( int [] pkb) {
			    int max = 0;
			    for (int i = 0;i<pkb.length;i++) {
			      if (pkb[i] > max)
			        max = pkb[i];
			    }
			    System.out.println("Najwy¿sza wartoœæ PKB: " + max);
			  }
		 
		 
		 public static void showMin( int [] pkb) {
			    int min = pkb[0];
			    for (int i = 1; i < pkb.length;i++) {
			      if (pkb[i]<min)
			        min = pkb[i];
			    }
			    System.out.println("Najmniejsza wartoœæ PKB: " + min);
			  }
		 
		 
		 public static void showAvg ( int [] pkb ) {
			 int suma = 0;
			 int avg;
			 int iloscPKB = pkb.length;
			 for (int i = 0; i < pkb.length;i++) {
				 suma += pkb[i];
			 }
			 avg = suma/iloscPKB;
			 System.out.println("Srednia PKB: " +avg);
		 }
		 
		 
		 
		 
		public static void main(String[] args) {
		
		int pkb [] = { 19527, 20391, 21203, 22148, 24438, 25955, 28056, 31158, 33741, 35966  };
		
		showAll(pkb);
		showOne(pkb);
		showMax(pkb);
		showMin(pkb);
		showAvg(pkb);
	}
	}


	

