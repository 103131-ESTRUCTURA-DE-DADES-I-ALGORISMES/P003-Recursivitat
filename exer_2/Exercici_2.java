package exer_2;

import java.util.*;


public class Exercici_2 {
	
	// atributs est�tics utilitzats en la generaci� aleat�ria de car�cters
	private static char [] theChars = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'}; // els car�cters que poden ser generats
	private static Random alea = new Random();
	
	public static void main (String [] args) {
		/* Escriviu aqu� el vostre codi de prova. Genereu 10000 pal�ndroms de mides 
		 * aleat�ries en l'interval [0,20] i verifiqueu-los amb la funci� 
		 * checkPalindrome subministrada. Vegeu enunciat de la pr�ctica
		 */

		for (int i = 0; i < 10000; i++) {
			String s = genPalindrome(alea.nextInt(20));
			if (!checkPalindrome(s)) {
				System.out.println("ERROR: " + s);
			}
		}
	}
	
	private static String genPalindrome (int length) {
		char c = randomChar();
		if(length == 1) return ""+c;
		if(length == 2) return ""+c+c;
		return c+""+genPalindrome(length-2)+""+c;
	}
	
	
	/* Randomly "generates" a char */
	private static char randomChar() {
		return theChars[alea.nextInt(theChars.length)];
	}
	

	/* Verifies whether the given string is a palindrome or not.
	 * Returns true if the parameter is a palindrome and false otherwise */
	private static boolean checkPalindrome (String s) {
		String ns = "";
		for (int i=1; i<=s.length(); i++) 
			ns = ns + s.charAt(s.length()-i);
		return s.equals(ns);
	}
	

}
