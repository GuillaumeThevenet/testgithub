package Jeux;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class map {
	public final static int X_MAX = 150;
	public final static int Y_MAX = 70;
	public final static int WIDTH = 5;
	private final static int SIZE_X = 15;
	private final static int SIZE_Y = 7;

	public static int xperso1 = 0;
	public static int yperso1 = 6;
	public static int xperso2 = 14;
	public static int yperso2 = 6;

	public static int[][] tableau = new int[SIZE_X][SIZE_Y];

	public static void main(String[] args) {

		StdDraw.setXscale(-WIDTH, X_MAX + WIDTH);
		StdDraw.setYscale(-WIDTH, 100 + WIDTH);

		double x = 0;
		double y = 0;
		double x1 = 0;
		double y1 = 0;
		int i = 0;
		int j = 0;

		tableau[1][1] = 1;// murs
		tableau[1][2] = 1;
		tableau[1][3] = 1;
		tableau[1][4] = 1;
		tableau[1][6] = 1;
		tableau[3][1] = 1;
		tableau[3][2] = 1;
		tableau[3][3] = 1;
		tableau[3][4] = 1;
		tableau[3][6] = 1;
		tableau[5][0] = 1;
		tableau[5][1] = 1;
		tableau[5][2] = 1;
		tableau[5][4] = 1;
		tableau[5][5] = 1;
		tableau[7][0] = 1;
		tableau[7][2] = 1;
		tableau[7][4] = 1;
		tableau[7][5] = 1;
		tableau[7][6] = 1;
		tableau[9][0] = 1;
		tableau[9][1] = 1;
		tableau[9][3] = 1;
		tableau[9][4] = 1;
		tableau[9][5] = 1;
		tableau[11][0] = 1;
		tableau[11][1] = 1;
		tableau[11][3] = 1;
		tableau[11][4] = 1;
		tableau[11][5] = 1;
		tableau[13][0] = 1;
		tableau[13][1] = 1;
		tableau[13][2] = 1;
		tableau[13][3] = 1;
		tableau[13][5] = 1;

		tableau[2][0] = 2;// lampes
		tableau[2][3] = 2;
		tableau[5][6] = 2;
		tableau[6][3] = 2;
		tableau[8][2] = 2;

		tableau[11][2] = 3;// ordi

		tableau[xperso1][yperso1] = 4;// persos
		tableau[xperso2][yperso2] = 5;

		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(0, Y_MAX, X_MAX, Y_MAX);
		StdDraw.line(0, 0, X_MAX, 0);
		for (y = 10; y < Y_MAX; y = y + 10) {
			x1 = X_MAX;
			y1 = y;
			StdDraw.line(x, y, x1, y1);
		}
		for (x = 0; x < X_MAX + 10; x = x + 10) {
			x1 = x;
			y1 = 0;
			StdDraw.line(x, y, x1, y1);
		}
		for (i = 0; i < 15; i++) {
			for (j = 0; j < 7; j++) {

				if (tableau[i][j] == 1) {
					mur(i, j);
				} else				
				if (tableau[i][j] == 2) {
					lampe(i, j);
				} else
				if (tableau[i][j] == 3) {
					ordi(i, j);
				} else {
					couloir(i, j);
				}

				if (tableau[i][j] == 4) {
					perso(i, j, 1);
				} else
				if (tableau[i][j] == 5) {
					perso(i, j, 2);
				}

				
			}
		}
	}

	public static void mur(int hori, int verti) {

		int i = 10 * hori;
		int j = 10 * verti;

		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledSquare(i + WIDTH, j + WIDTH, WIDTH);

	}

	public static void lampe(int hori, int verti) {

		int i = 10 * hori;
		int j = 10 * verti;

		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledSquare(i + WIDTH, j + WIDTH, WIDTH);

	}

	public static void ordi(int hori, int verti) {

		int i = 10 * hori;
		int j = 10 * verti;

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledSquare(i + WIDTH, j + WIDTH, WIDTH);

	}

	public static void couloir(int hori, int verti) {

		int i = 10 * hori;
		int j = 10 * verti;

		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledSquare(i + WIDTH, j + WIDTH, WIDTH);

	}

	public static void perso(int hori, int verti, int nbperso) {

		int i = 10 * hori;
		int j = 10 * verti;
		if (nbperso == 1) {
			//StdDraw.setPenColor(StdDraw.BLUE);
			//StdDraw.filledSquare(i + WIDTH, j + WIDTH, WIDTH);
			//StdDraw.show(100);
			new Personnage(i+WIDTH, j+WIDTH, Color.BLUE);

		} else {
			Personnage gard = new Personnage(i+WIDTH, j+WIDTH, Color.RED);
			gard.setUpKey(KeyEvent.VK_Z);
			gard.setDownKey(KeyEvent.VK_S);
			gard.setLeftKey(KeyEvent.VK_Q);
			gard.setRightKey(KeyEvent.VK_D);
		}

	}

}