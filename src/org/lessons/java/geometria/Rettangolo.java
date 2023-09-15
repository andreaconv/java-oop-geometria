package org.lessons.java.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public void calcolaArea() {
		int area = base * altezza;
		System.out.println("L'area del rettandolo è: " + area);
	}
	
	public void calcolaPerimetro() {
		int perimetro = (base + altezza) * 2;
		System.out.println("Il perimetro del rettandolo è: " + perimetro);
	}

}
