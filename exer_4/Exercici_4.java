package exer_4;

import java.util.*;

public class Exercici_4 {
	
	private static char [] alfabet = {'a', 'b', 'c', 'd', 'e', 'f'};
	private static Random alea = new Random();
	
	public static void main (String [] args) {		
		long time = System.currentTimeMillis();

		String mot, ite, rec;
		for (int i=1; i<10; i++) {
			mot = genCadena(alea.nextInt(21));
			if(mot.contains("a")){
				ite = torturaIte(mot);
				rec = tortura(mot);
				if (!ite.equals(rec)) {
					System.out.println("Discrepància detectada");
				 	System.out.println("per al mot: "+mot);
				 	System.out.println("la versio recursiva ha generat: "+rec);
				 	System.out.println("la versio iterativa ha generat: "+ite);
				 	System.out.println("CAL REVISAR EL CODI GENERAT");
				 	System.exit(1);
				}
			}
		}

		time = System.currentTimeMillis() - time;
		
		System.out.println("Prova finalitza sense haver detectat discrep�ncies");
		System.out.println("entre les versions iterativa i recursiva.");
		System.out.println("Pero aixo no vol dir ...");

		System.out.println("\nExecuted in " + time + " ms.");
	}
	
	public static String tortura (String s) {
		return replaceAs(s, 0, "start");
	}
	
	public static String torturaIte (String s) {
		String str = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a'){
				if(i%2==0) 
					str+='*';
				else 
					str+='_';
			}
			else str+=s.charAt(i);
		}
		return str;	
	}
	
	public static String genCadena (int n) {
		if(n==0) return "";
		else return genCadena(n-1) + alfabet[alea.nextInt(alfabet.length)];
	}
	
	public static String replaceAs(String s, int l, String costat) {
		if (s.length()==0) return "";
				
		int centre = s.length()/2;
		String esquerra = s.substring(0, centre);
		String dreta = s.substring(centre+1, s.length());
		char c=s.charAt(centre)=='a'? ((centre+l)%2==0?'*':'_') :s.charAt(centre);
		
		return replaceAs(esquerra,l, "esquerra")+c+replaceAs(dreta,centre+l+1, "dreta");
	}
}
