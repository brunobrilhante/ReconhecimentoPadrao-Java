package entities;

import java.util.Random;

public class Jarra {

	public Double[] espessuraTreinamento = new Double[1000];
	public Double[] formaTreinamento = new Double[1000];
	private Double[] espPrototipo = new Double[1000];
	private Double[] formPrototipo = new Double[1000];	

	Random r = new Random();
	
	public void gerarNumeros() {
		if(espessuraTreinamento[0] == null) {
			for(int i = 0; i < 1000; i++) {			
				double randomValue = 1.0 + (1.7 - 1.0) * r.nextDouble();
				espessuraTreinamento[i] = randomValue;
				espPrototipo[i] = randomValue;
			}
			for(int i = 0; i < 1000; i++) {
				double randomValue = 4.2 + (6.7 - 4.2) * r.nextDouble();
				formaTreinamento[i] = randomValue;
				formPrototipo[i] = randomValue;
			}
										
		}				
	}
	
	public double mediaForma() {		
		double somaForm = 0;
		for(int i = 0; i < 1000; i++) {			
			somaForm += formPrototipo[i];
		}		
		return somaForm / formPrototipo.length;	
	}
	
	public double mediaEspessura() {		
		double somaEsp = 0;
		for(int i = 0; i < 1000; i++) {			
			somaEsp += espPrototipo[i];
		}		
		return somaEsp / espPrototipo.length;	
	}
}