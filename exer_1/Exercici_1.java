package exer_1;

import java.util.*;

public class Exercici_1 {
	
	/* Punt d'entrada en execuci� per a fer proves */
	public static void main (String [] args) {
		Random alea = new Random();
		int original, resultat;
		String cadena= Integer.toString(123);
		System.out.println(str2int(cadena));
		
		
//		for (original = 0; original<=1000; original++) {
//			cadena = Integer.toString(original);
//			System.out.println("cadena="+cadena);
//			resultat = str2int(cadena, 0);
//			if (original!=resultat) {
//				System.out.println("Error. String era: "+cadena+" resultat ha estat: "+resultat);
//				break;
//			}
//		}
		
//		for (int i=1; i<=100000; i++) {
//			original = alea.nextInt(Integer.MAX_VALUE);
//			cadena = Integer.toString(original);
//			resultat = /* Invoqueu aqu� la vostra funci� de conversi� */
//			if (original!=resultat) {
//				System.out.println("Error. String era: "+cadena+" resultat ha estat: "+resultat);
//			}
//		}
	}
	
	
	
	/* ESCRIVIU AQU� LA VOSTRA FUNCI� DE CONVERSI� String -> int */ 
	
	private static int str2int(String s) {
//		int num=translateChar(s.charAt(0));
//		String ns=s.substring(1, s.length());
//		r+=num*Math.pow(10, ns.length());
		if(s.length()==0) return 0;
		int i=str2int(s.substring(0,s.length()-1));
		
	}
	
	
	/* funci� que "transforma" un car�cter en el d�git (int) corresponent */
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
