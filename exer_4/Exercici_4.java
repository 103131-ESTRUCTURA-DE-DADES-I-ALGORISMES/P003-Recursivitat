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
				System.out.println("mot: " + mot);
				System.out.println("rec: " + rec);
				System.out.println("ite: " + ite);
				if (!ite.equals(rec)) {
					System.out.println("Discrepància detectada");
				// 	System.out.println("per al mot: "+mot);
				// 	System.out.println("la versi� recursiva ha generat: "+rec);
				// 	System.out.println("la versi� iterativa ha generat: "+ite);
				// 	System.out.println("CAL REVISAR EL CODI GENERAT");
				// 	System.exit(1);
				}
				System.out.println();
			}
		}

		time = System.currentTimeMillis() - time;
		
		System.out.println("Prova finalitza sense haver detectat discrep�ncies");
		System.out.println("entre les versions iterativa i recursiva.");
		System.out.println("Per� aix� no vol dir ...");

		System.out.println("\nExecuted in " + time + " ms.");
	}
	
	// Funci� fa�ana (llan�adora) 
	public static String tortura (String s) {
		// escriure aqu� la invocaci� inicial del funci� recursiva de "tortura"
		String str = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a'){
				if(i%2==0) str+='1';
				else str+='2';
			}
			else str += s.charAt(i);
		}
		return str; // 40 ms
	}
	
	// escriure aqu� la funci� RECURSIVA de tortura
	
	public static String torturaIte (String s) {
		// escriure aqu� el cos de la versi� iterativa de la funci� de "tortura"
		if (s.length()==0) return "";
		
		int centre = s.length()/2;
		String esquerra = s.substring(0, centre);
		String dreta = s.substring(centre+1, s.length());
				
		if (s.charAt(centre)=='a')
			if(centre%2==0 ^ s.length()%2==1) return torturaIte(esquerra) + '1' + torturaIte(dreta);
			else return torturaIte(esquerra) + '2' + torturaIte(dreta);
		else
			return torturaIte(esquerra)+s.charAt(centre)+torturaIte(dreta);
	}
	
	public static String genCadena (int n) {
		// escriure aqu� el cos de la funci� RECURSIVA que genera 
		// cadenes de car�cters de mida n
		if(n==0) return "";
		else return genCadena(n-1) + alfabet[alea.nextInt(alfabet.length)];
	}
	


	public static String capitalitzarA (String str) { 
		if (str.length()==0) return "";
		
		int centre = str.length()/2;
		// centre no incorporat a cap subseqüència String esquerra = str.substring(0, centre); String dreta str.substring(centre+1, str.length());
		String esquerra = str.substring(0, centre);
		String dreta = str.substring(centre+1, str.length());
		
		// System.out.println("\n\n=============\nEntra: "+str);
		// System.out.println("Centre: "+centre+" - "+str.charAt(centre));
		// System.out.println("Esquerra: "+esquerra);
		// System.out.println("Dreta: "+dreta);
		
		
		if (str.charAt(centre)=='a')
			return capitalitzarA(esquerra)+"A"+capitalitzarA(dreta);
		
		else
			return capitalitzarA(esquerra)+str.charAt(centre)+capitalitzarA(dreta);
	}
}
