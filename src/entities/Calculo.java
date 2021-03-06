package entities;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Calculo {

	public void start() {
		
		Locale.setDefault(Locale.US);
		
		//Instanciando as classes
		Taca taca = new Taca();
        Jarra jarra = new Jarra();
        Prato prato = new Prato();
        Copo copo = new Copo();
               
        //Gerando as bases de dados        
        taca.gerarNumeros();             
        jarra.gerarNumeros();
        copo.gerarNumeros();
        prato.gerarNumeros();
        
        //Vari?veis que v?o armazenar os acertos e erros da Ta?a
        int acertosTaca = 0;
        int errosTaca = 0;
        
        //C?lculos dos acertos e erros
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
        
        //Vari?veis que v?o armazenar os acertos e erros do Prato
        int acertosPrato = 0;
        int errosPrato = 0;
        
        //C?lculos dos acertos e erros
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
       
        //Vari?veis que v?o armazenar os acertos e erros da Jarra
       int acertosJarra = 0;
       int errosJarra = 0;
       
       //C?lculos dos acertos e erros
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
       
       //Vari?veis que v?o armazenar os acertos e erros do Copo
       int acertosCopo = 0;
       int errosCopo = 0;
       
       //C?lculos dos acertos e erros
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
       
       System.out.println("==================TA?A==================");
	   System.out.println("-----Espessura-Media-----");
	   taca.getEspessuraPrototipo();
	   System.out.println("-----Espessura-Teste-----");
	   taca.getEspessuraTreinamento();
	   System.out.println("-----Forma-Media-----");
	   taca.getFormaPrototipo();
	   System.out.println("-----Forma-Teste-----");
	   taca.getFormaTreinamento();	   
	   
	   System.out.println("==================COPO==================");
	   System.out.println("-----Espessura-Media-----");
	   copo.getEspessuraPrototipo();
	   System.out.println("-----Espessura-Teste-----");
	   copo.getEspessuraTreinamento();
	   System.out.println("-----Forma-Media-----");
	   copo.getFormaPrototipo();
	   System.out.println("-----Forma-Teste-----");
	   copo.getFormaTreinamento();	   
	   
	   System.out.println("==================JARRA==================");
	   System.out.println("-----Espessura-Media-----");
	   jarra.getEspessuraPrototipo();
	   System.out.println("-----Espessura-Test-----");
	   jarra.getEspessuraTreinamento();
	   System.out.println("-----Forma-Media-----");
	   jarra.getFormaPrototipo();
	   System.out.println("-----Forma-Teste-----");
	   jarra.getFormaTreinamento();	   
	   
	   System.out.println("==================PRATO==================");
	   System.out.println("-----Espessura-Media-----");
	   prato.getEspessuraPrototipo();
	   System.out.println("-----Espessura-Teste-----");
	   prato.getEspessuraTreinamento();
	   System.out.println("-----Forma-Media-----");
	   prato.getFormaPrototipo();
	   System.out.println("-----Forma-Teste-----");
	   prato.getFormaTreinamento();	
       
       //Janela que abre mostrando os resultados
       JOptionPane.showMessageDialog(null, "Acertos Ta?a: " + acertosTaca + 
    		   							"\nErros Ta?a: " + errosTaca +
    		   							"\n\nAcertos Copo: " + acertosCopo + 
    		   							"\nErros Copo: " + errosCopo +
    		   							"\n\nAcertos Jarra: " + acertosJarra + 
    		   							"\nErros Jarra: " + errosJarra +
    		   							"\n\nAcertos Prato: " + acertosPrato + 
    		   							"\nErros Prato: " + errosPrato,     		   							
    		   							"RESULTADOS", JOptionPane.INFORMATION_MESSAGE);
	}
}
