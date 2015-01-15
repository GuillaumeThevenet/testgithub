package Jeux;

import java.awt.Color;
import java.awt.event.KeyEvent;


public class Personnage extends Thread {

	// Attributs

	private int positionX; // position du perso
	private int positionY; // position du perso
	private int vitesse = 1;// vitesse du perso
	private Color color;// couleur du perso
	public final static double WIN_WIDTH = 640.0;
	public final static double WIN_HEIGHT = 640.0;

	// Constructeurs

	public Personnage( int x, int y, Color c) {
		positionX = x;
		positionY = y;
		
		color = c;
		

		StdDraw.setPenColor(this.color);
		StdDraw.filledSquare(this.getPositionX(), this.getPositionY(), map.WIDTH);
		start();
		
	}

	// Accesseurs

	public int getPositionX() {
		return positionX; // Renvoie la position
	}

	public int getPositionY() {
		return positionY; // Renvoie la position
	}

	public int getVitesse() {
		return vitesse;
	}

	public Color getColor() {
		return color;
	}

	// Setters

	public void setPositionX(double d) {
		positionX = (int) d; // Définie la position
	}

	public void setPositionY(double d) {
		positionY = (int) d; // Définie la position
	}

	public void setVitesse(int v) {
		vitesse = v;
	}

	public void setColor(Color c) {
		color = c;
	}

	// déplacement
	
	private int upKey = KeyEvent.VK_UP;
	

	public int getUpKey() {
		return upKey;
	}

	public void setUpKey(int up_key) {
		this.upKey = up_key;
	}

	public void run() {
		while (true) {
			
			double deltaX = 0;
			double deltaY = 0;
			double deltaZ = 1;

			if (StdDraw.isKeyPressed(getUpKey())) {
				deltaY = +1;
			}

			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
				deltaY = -1;
			}

			if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
				deltaX = +1;
			}

			if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
				deltaX = -1;
			}

			this.setPositionX(this.getPositionX()+deltaX);
			this.setPositionY(this.getPositionY()+deltaY);
			StdDraw.setPenColor(this.color);
			StdDraw.filledSquare(this.getPositionX(), this.getPositionY(), map.WIDTH);
			
			StdDraw.show();
		}

	}
}
