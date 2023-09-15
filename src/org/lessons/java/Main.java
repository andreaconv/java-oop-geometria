package org.lessons.java;

import java.util.Scanner;

import org.lessons.java.geometria.Rettangolo;

public class Main {
	
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Inserisci la base del rettangolo: ");
	        int base = sc.nextInt();
	        System.out.print("Inserisci l'altezza del rettangolo: ");
	        int altezza = sc.nextInt();
			
			Rettangolo rett1 = new Rettangolo(base, altezza);
			
			System.out.println("RETTANGOLO " + (i + 1));
			
			System.out.println("la base è: " + base + "\n" + "l'altezza è: " + altezza);
			rett1.calcolaArea();
			rett1.calcolaPerimetro();	
			System.out.println("\n----------------------------------\n");
		}
		
		
	}

}
