package entities;

import java.util.Random;

public class Taca {
	
	//Iniciando os vetores, cada um com tamanho de 1000 (j� separando o do prot�tipo e o do treinamento)
	public Double[] espessuraTreinamento = new Double[1000];
	public Double[] formaTreinamento = new Double[1000];
	private Double[] espessuraPrototipo = new Double[1000];
	private Double[] formaPrototipo = new Double[1000];

	Random r = new Random();
	
	//M�doto para gerar os n�meros aleat�rios de acordo com cada atributo
	public void gerarNumeros() {
		if(espessuraTreinamento[0] == null) {
			for(int i = 0; i < 1000; i++) {			
				double randomValue = 0.8 + (1.3 - 0.8) * r.nextDouble();
				espessuraTreinamento[i] = randomValue;
				espessuraPrototipo[i] = randomValue;
			}
			for(int i = 0; i < 1000; i++) {
				double randomValue = 4.2 + (6.7 - 4.2) * r.nextDouble();
				formaTreinamento[i] = randomValue;
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
	
	
}
