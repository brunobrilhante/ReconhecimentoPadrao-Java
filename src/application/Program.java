package application;

import java.util.Locale;

import entities.Taca;

public class Program {

	public static void main(String[] args) {
			
        Locale.setDefault(Locale.US);
		
        /*
        
		double[] base = new double[2000]; 
		
		for(int i = 0; i < 2000; i++) {
			Random r = new Random();
			double randomValue = 0.8 + (1.5 - 0.8) * r.nextDouble();
			base[i] = randomValue;
		}
		
        for(Double d : base) {
        	System.out.format("%.2f\n", d);
        }
        
		*/
        
        Taca taca = new Taca();
        
        //System.out.format("%d", taca.passoUm());
        taca.passoUm();
        
        System.out.println("--------------");
        
        taca.passoUm();
	}

}
