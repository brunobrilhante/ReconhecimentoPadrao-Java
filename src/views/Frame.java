package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import entities.Calculo;

public class Frame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame() {
		setTitle("Reconhecimento de Padrão");
	    setBounds(400, 400, 400, 400);
	
	    // Criando um JButton e um Painel
	    JButton button = new JButton("Calcular");
	    Painel panel = new Painel();
	
	    button.setBounds(150, 150, 90, 30);
	    panel.setLayout(null);
	    panel.add(button); 
	    this.getContentPane().add(panel);
	    button.addActionListener(
	    		  new ActionListener(){
	    			    public void actionPerformed(ActionEvent e){
	    			      Calculo calculo = new Calculo();
	    			      calculo.start();
	    			    }
	    			  }
	    			);
	    
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}