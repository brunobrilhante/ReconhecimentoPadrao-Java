package entities;

import java.util.Random;

public class Prato {

	private Double[] espessuraTreinamento = new Double[1000];
	private Double[] formaTreinamento = new Double[1000];
	private Double[] espPrototipo = new Double[1000];
	private Double[] formPrototipo = new Double[1000];	

	Random r = new Random();
	
	public void passoUm() {
		if(espessuraTreinamento[0] == null) {
			for(int i = 0; i < 1000; i++) {			
				double randomValue = 1.4 + (1.8 - 1.4) * r.nextDouble();
				espessuraTreinamento[i] = randomValue;
				espPrototipo[i] = randomValue;
			}
			for(int i = 0; i < 1000; i++) {
				double randomValue = 3.7 + (5.9 - 3.7) * r.nextDouble();
				formaTreinamento[i] = randomValue;
				formPrototipo[i] = randomValue;
			}
			double somaEsp = 0;
			double somaForm = 0;
			for(int i = 0; i < 1000; i++) {
				somaEsp += espPrototipo[i];
				somaForm += formPrototipo[i];
			}
			double mediaEsp = somaEsp / espPrototipo.length;
			double mediaForm = somaForm / formPrototipo.length;								
		}		
		for(Double d : espessuraTreinamento) {
        	System.out.format("%.2f\n", d);
        }
	}
}