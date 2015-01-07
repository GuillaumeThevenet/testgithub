package Jeux;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class main {
	
	public static void main (String[] args){
		
		JFrame t = new JFrame();
		JPanel pan = new JPanel (new GridLayout (10,10));
		Border blackline = BorderFactory.createLineBorder(Color.black,1); 
		for(int i = 0; i<100;i++){
		   JPanel ptest = new JPanel();
		   ptest.setBorder(blackline);
		   pan.add(ptest);
		}
		pan.setBorder(blackline);
		t.add(pan);
		t.setVisible(true);
		
		/*//on crée la grille
		Grille g1 = new Grille(15, 8);
		
		
		//on place le joueur
		g1.placer(1, 8, 'P');
		g1.placer(15, 1, 'V');
		
		//on affiche la grille
		g1.afficher();*/
		
	}

}
