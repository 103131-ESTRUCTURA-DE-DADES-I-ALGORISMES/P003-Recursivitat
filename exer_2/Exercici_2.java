package exer_2;

import java.util.*;


public class Exercici_2 {
	
	// atributs estàtics utilitzats en la generació aleatòria de caràcters
	private static char [] theChars = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'}; // els caràcters que poden ser generats
	private static Random alea = new Random();
	
	public static void main (String [] args) {
		/* Escriviu aquí el vostre codi de prova. Genereu 10000 palíndroms de mides 
		 * aleatòries en l'interval [0,20] i verifiqueu-los amb la funció 
		 * checkPalindrome subministrada. Vegeu enunciat de la pràctica
		 */
	}
	
	private static String genPalindrome (int length) {
		/* COMPLETAR */
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
