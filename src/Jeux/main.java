package Jeux;

public class main {
	
	public static void main (String[] args){
		
		//on crée la grille
		Grille g1 = new Grille(15, 8);
		
		
		//on place le joueur
		g1.placer(1, 8, 'P');
		g1.placer(15, 1, 'V');
		
		//on affiche la grille
		g1.afficher();
		
	}

}
