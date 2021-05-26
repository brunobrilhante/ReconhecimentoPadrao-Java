package entities;

import java.util.Random;

public class Prato {

	//Iniciando os vetores, cada um com tamanho de 1000 (já separando o do protótipo e o do treinamento)
	public Double[] espessuraTreinamento = new Double[1000];
	public Double[] formaTreinamento = new Double[1000];
	private Double[] espessuraPrototipo = new Double[1000];
	private Double[] formaPrototipo = new Double[1000];	

	Random r = new Random();
	
	//Médoto para gerar os números aleatórios de acordo com cada atributo
	public void gerarNumeros() {
		if(espessuraTreinamento[0] == null) {
			for(int i = 0; i < espessuraTreinamento.length; i++) {			
				double randomValue = 1.4 + (1.8 - 1.4) * r.nextDouble();
				espessuraTreinamento[i] = randomValue;				
			}
			for(int i = 0; i < espessuraTreinamento.length; i++) {			
				double randomValue = 1.4 + (1.8 - 1.4) * r.nextDouble();				
				espessuraPrototipo[i] = randomValue;
			}
			for(int i = 0; i < espessuraTreinamento.length; i++) {
				double randomValue = 3.7 + (5.9 - 3.7) * r.nextDouble();
				formaTreinamento[i] = randomValue;				
			}
			for(int i = 0; i < espessuraTreinamento.length; i++) {
				double randomValue = 3.7 + (5.9 - 3.7) * r.nextDouble();				
				formaPrototipo[i] = randomValue;
			}
		}
	}
	
	//Método para retornar o protótipo da forma
	public double mediaForma() {		
		double somaForm = 0;
		for(int i = 0; i < 1000; i++) {			
			somaForm += formaPrototipo[i];
		}		
		return somaForm / formaPrototipo.length;	
	}
	
	//Método para retornar o protótipo da espessura
	public double mediaEspessura() {		
		double somaEsp = 0;
		for(int i = 0; i < 1000; i++) {			
			somaEsp += espessuraPrototipo[i];
		}		
		return somaEsp / espessuraPrototipo.length;	
	}
	
	//Método para mostrar os valores da base espessuraTreinamento[]
	public void getEspessuraTreinamento() {		
		for(int i = 0; i < 1000; i++) {
			System.out.format("%.2f\n", espessuraTreinamento[i]);
		}
	}
		
	//Método para mostrar os valores da base formaTreinamento[]
	public void getFormaTreinamento() {
		for(int i = 0; i < 1000; i++) {
			System.out.format("%.2f\n", formaTreinamento[i]);
		}		
	}
	
	//Método para mostrar os valores da base espessuraPrototipo[]
	public void getEspessuraPrototipo() {		
		for(int i = 0; i < 1000; i++) {
			System.out.format("%.2f\n", espessuraPrototipo[i]);
		}		
	}
	
	//Método para mostrar os valores da base formaPrototipo[]
	public void getFormaPrototipo() {			
		for(int i = 0; i < 1000; i++) {
			System.out.format("%.2f\n", formaPrototipo[i]);
		}	
	}
}