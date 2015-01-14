package Jeux;

public class Personnage {

	// Attributs

	private int position; // position du perso
	private int vitesse;// vitesse du perso
	private String color;// couleur du perso

	// Constructeurs

	public Personnage(int v, int p, String c) {
		position = p;
		vitesse = v;
		color = c;

	}

	// Accesseurs

	public int getPosition() {
		return position; // Renvoie la position
	}

	public int getVitesse() {
		return vitesse;
	}

	public String getColor() {
		return color;
	}

	// Setters

	public void setPosition(int p) {
		position = p; // D�finie la position
	}

	public void setVitesse(int v) {
		vitesse = v;
	}

	public void setColor(String c) {
		color = c;
	}
}

// Services

