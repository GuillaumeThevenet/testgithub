package Jeux;

import java.util.*;
public class Grille {
	
	//attributs
	private int nblig;
	private int nbcol;
	private char [][] grille;
	
	//structure
	public Grille(int n, int p){
		nblig = n;
		nbcol = p;
		grille = new char[nblig][nbcol];
		
		for(int i=0; i<nblig; i++){
			for(int j=0; j<nbcol; j++){
				
				grille[i][j] = '-';
			}
		}
	}

	public void afficher(){
		System.out.println();
		for(int i=0; i<nblig; i++){
			for(int j=0; j<nbcol; j++){
				
				System.out.print(" | " + grille[i][j]);
			}
			
			System.out.println(" | ");
			
		}
		System.out.println();
	}
	
	public void placer(int l, int c, char t){
		
		l = l-1;
		c = c-1;
		
		//test si sur grille
		if (l<0 || c<0 || l>nblig || c>nbcol){
			System.out.print("Ereur !");
			return;
			
		}
		
		if(grille[l][c] == '-'){
			grille[l][c] = t;
		}
		
		else{
			System.out.print("Ereur, zone non vide !");
			
		}
	}
	//déplacer
	//positionner des objets
}
