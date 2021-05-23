package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Copo;
import entities.Jarra;
import entities.Prato;
import entities.Taca;

public class Program {

	public static void main(String[] args) {
			
        Locale.setDefault(Locale.US);		
        
        Taca taca = new Taca();
        Jarra jarra = new Jarra();
        Prato prato = new Prato();
        Copo copo = new Copo();
        
        taca.gerarNumeros();             
        jarra.gerarNumeros();
        copo.gerarNumeros();
        prato.gerarNumeros();
        
        int acertosTaca = 0;
        int errosTaca = 0;
        
        for(int i = 0; i < 1000; i++) {        	        
	        double acertoTaca = Math.abs((taca.espessuraTreinamento[i] - taca.mediaEspessura()) + (taca.formaTreinamento[i] - taca.mediaForma()));		               
	        double erroJarra = Math.abs((jarra.espessuraTreinamento[i] - jarra.mediaEspessura()) + (jarra.formaTreinamento[i] - jarra.mediaForma()));        	        
	        double erroPrato = Math.abs((prato.espessuraTreinamento[i] - prato.mediaEspessura()) + (prato.formaTreinamento[i] - prato.mediaForma()));        	        
	        double erroCopo = Math.abs((copo.espessuraTreinamento[i] - copo.mediaEspessura()) + (copo.formaTreinamento[i] - copo.mediaForma()));	        
	        
	        if(acertoTaca < erroJarra && acertoTaca < erroPrato && acertoTaca < erroCopo) {
	        	acertosTaca += 1;
	        }
	        else {
	        	errosTaca += 1;
	        }        
        }
        
        /*System.out.println("Acertos Taça: " + acertosTaca);
        System.out.println("Erros Taça: " + errosTaca + "\n");*/
        
        /* ------------------------------------------------------------------ */
        
        int acertosPrato = 0;
        int errosPrato = 0;
        
        for(int i = 0; i < 1000; i++) {        	        
	        double acertoPrato = Math.abs((prato.espessuraTreinamento[i] - prato.mediaEspessura()) + (prato.formaTreinamento[i] - prato.mediaForma())); 
	        double erroJarra = Math.abs((jarra.espessuraTreinamento[i] - jarra.mediaEspessura()) + (jarra.formaTreinamento[i] - jarra.mediaForma()));        	        
	        double erroTaca = Math.abs((taca.espessuraTreinamento[i] - taca.mediaEspessura()) + (taca.formaTreinamento[i] - taca.mediaForma()));		                 	        
	        double erroCopo = Math.abs((copo.espessuraTreinamento[i] - copo.mediaEspessura()) + (copo.formaTreinamento[i] - copo.mediaForma()));	        
	        
	        if(acertoPrato < erroJarra && acertoPrato < erroTaca && acertoPrato < erroCopo) {
	        	acertosPrato += 1;
	        }
	        else {
	        	errosPrato += 1;
	        }        
        }
        
       /*System.out.println("Acertos Prato: " + acertosPrato);
       System.out.println("Erros Prato: " + errosPrato + "\n");*/
        
       /* ------------------------------------------------------------------ */
       
       int acertosJarra = 0;
       int errosJarra = 0;
       
       for(int i = 0; i < 1000; i++) {        	        
	        double acertoJarra = Math.abs((jarra.espessuraTreinamento[i] - jarra.mediaEspessura()) + (jarra.formaTreinamento[i] - jarra.mediaForma())); 	        		 
	        double erroPrato = Math.abs((prato.espessuraTreinamento[i] - prato.mediaEspessura()) + (prato.formaTreinamento[i] - prato.mediaForma()));        	        
	        double erroTaca = Math.abs((taca.espessuraTreinamento[i] - taca.mediaEspessura()) + (taca.formaTreinamento[i] - taca.mediaForma()));		                 	        
	        double erroCopo = Math.abs((copo.espessuraTreinamento[i] - copo.mediaEspessura()) + (copo.formaTreinamento[i] - copo.mediaForma()));	        
	        
	        if(acertoJarra < erroPrato && acertoJarra < erroTaca && acertoJarra < erroCopo) {
	        	acertosJarra += 1;
	        }
	        else {
	        	errosJarra += 1;
	        }        
       }
       
       /*System.out.println("Acertos Jarra: " + acertosJarra);
       System.out.println("Erros Jarra: " + errosJarra + "\n");*/
	
       /* ------------------------------------------------------------------ */
       
       int acertosCopo = 0;
       int errosCopo = 0;
       
       for(int i = 0; i < 1000; i++) {        	        
	        double acertoCopo = Math.abs((copo.espessuraTreinamento[i] - copo.mediaEspessura()) + (copo.formaTreinamento[i] - copo.mediaForma())); 
	        double erroPrato = Math.abs((prato.espessuraTreinamento[i] - prato.mediaEspessura()) + (prato.formaTreinamento[i] - prato.mediaForma()));        	        
	        double erroTaca = Math.abs((taca.espessuraTreinamento[i] - taca.mediaEspessura()) + (taca.formaTreinamento[i] - taca.mediaForma()));		                 	        
	        double erroJarra = Math.abs((jarra.espessuraTreinamento[i] - jarra.mediaEspessura()) + (jarra.formaTreinamento[i] - jarra.mediaForma()));	        
	        
	        if(acertoCopo < erroPrato && acertoCopo < erroTaca && acertoCopo < erroJarra) {
	        	acertosCopo += 1;
	        }
	        else {
	        	errosCopo += 1;
	        }
       }
       
       JOptionPane.showMessageDialog(null, "Acertos Taça: " + acertosTaca + 
    		   							"\nErros Taça: " + errosTaca +
    		   							"\n\nAcertos Copo: " + acertosCopo + 
    		   							"\nErros Copo: " + errosCopo +
    		   							"\n\nAcertos Jarra: " + acertosJarra + 
    		   							"\nErros Jarra: " + errosJarra +
    		   							"\n\nAcertos Prato: " + acertosPrato + 
    		   							"\nErros Prato: " + errosPrato,     		   							
    		   							"Resultados", JOptionPane.INFORMATION_MESSAGE);
       
       /*System.out.println("Acertos Copo: " + acertosCopo);
       System.out.println("Erros Copo: " + errosCopo + "\n");*/  
	
	}

}
