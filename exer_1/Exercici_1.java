package exer_1;

import java.util.*;

public class Exercici_1 {
	
	public static void main (String [] args) {
		long time = System.currentTimeMillis();

		Random alea = new Random();
		int original, resultat;
		String cadena;
		
		for (original = 0; original<=1000; original++) {
			cadena = Integer.toString(original);
			resultat = str2int(cadena);
			if (original!=resultat) {
				System.out.println("Error. String era: "+cadena+" resultat ha estat: "+resultat);
				break;
			}
		}
		
		for (int i=1; i<=100000; i++) {
			original = alea.nextInt(Integer.MAX_VALUE);
			cadena = Integer.toString(original);
			resultat = str2int(cadena); /* Invoqueu aqu� la vostra funci� de conversi� */
			if (original!=resultat) {
				System.out.println("Error. String era: "+cadena+" resultat ha estat: "+resultat);
			}
		}
		time = System.currentTimeMillis() - time;
		System.out.println("\nExecuted in " + time + " ms.");
	}
	
	
	
	/* ESCRIVIU AQU� LA VOSTRA FUNCI� DE CONVERSI� String -> int */ 
	private static int str2int(String s) {
		if(s.length()==0) return(0);

		int resta=str2int(s.substring(0, s.length()-1));
		int current=translateChar(s.charAt(s.length()-1));
		int total=resta*10+current;

		return total;
	}
	
	
	private static int translateChar (char c) {
		switch (c) {
			case '0': return 0;
			case '1': return 1;
			case '2': return 2;
			case '3': return 3;
			case '4': return 4;
			case '5': return 5;
			case '6': return 6;
			case '7': return 7;
			case '8': return 8;
			case '9': return 9;
			default: throw new IllegalArgumentException("Not a digit "+c);
		}
	}

}
