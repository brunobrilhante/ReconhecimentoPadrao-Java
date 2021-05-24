package entities;

import java.util.Random;

public class Copo {
	
	//Iniciando os vetores, cada um com tamanho de 1000 (j� separando o do prot�tipo e o do treinamento)
	public Double[] espessuraTreinamento = new Double[1000];
	public Double[] formaTreinamento = new Double[1000];
	private Double[] espessuraPrototipo = new Double[1000];
	private Double[] formaPrototipo = new Double[1000];	

	Random r = new Random();
	
	//M�doto para gerar os n�meros aleat�rios de acordo com cada atributo
	public void gerarNumeros() {
		if(espessuraTreinamento[0] == null) {
			for(int i = 0; i < espessuraTreinamento.length; i++) {			
				double randomValue = 1.1 + (1.5 - 1.1) * r.nextDouble();
				espessuraTreinamento[i] = randomValue;				
			}
			for(int i = 0; i < espessuraTreinamento.length; i++) {			
				double randomValue = 1.1 + (1.5 - 1.1) * r.nextDouble();				
				espessuraPrototipo[i] = randomValue;
			}
			for(int i = 0; i < espessuraTreinamento.length; i++) {
				double randomValue = 3.9 + (6.5 - 3.9) * r.nextDouble();
				formaTreinamento[i] = randomValue;				
			}
			for(int i = 0; i < espessuraTreinamento.length; i++) {
				double randomValue = 3.9 + (6.5 - 3.9) * r.nextDouble();				
				formaPrototipo[i] = randomValue;
			}
		}
	}
	
	//M�todo para retornar o prot�tipo da forma
	public double mediaForma() {		
		double somaForm = 0;
		for(int i = 0; i < 1000; i++) {			
			somaForm += formaPrototipo[i];
		}		
		return somaForm / formaPrototipo.length;	
	}
	
	//M�todo para retornar o prot�tipo da espessura
	public double mediaEspessura() {		
		double somaEsp = 0;
		for(int i = 0; i < 1000; i++) {			
			somaEsp += espessuraPrototipo[i];
		}		
		return somaEsp / espessuraPrototipo.length;	
	}
	
	//M�todo para mostrar os valores da base espessuraTreinamento[]
	public void getEspessuraTreinamento() {		
		for(double d : espessuraTreinamento) {
			System.out.format("%.2f\n", d);
		}		
	}
	
	//M�todo para mostrar os valores da base formaTreinamento[]
	public void getFormaTreinamento() {
		for(double d : formaTreinamento) {
			System.out.format("%.2f\n", d);
		}			
	}
		
	//M�todo para mostrar os valores da base espessuraPrototipo[]
	public void getEspessuraPrototipo() {		
		for(double d : espessuraPrototipo) {
			System.out.format("%.2f\n", d);
		}
		
	}
	
	//M�todo para mostrar os valores da base formaPrototipo[]
	public void getFormaPrototipo() {			
		for(double d : espessuraPrototipo) {
			System.out.format("%.2f\n", d);
		}
	}
}