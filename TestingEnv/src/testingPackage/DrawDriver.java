package testingPackage;

import edu.princeton.cs.introcs.StdDraw;

public class DrawDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setCanvasSize(600, 700);
		StdDraw.setXscale(0, 3);
		StdDraw.setYscale(0, 3.5);
		
		for (int o = 0; o < 3; o++) {
			StdDraw.circle(0.5, 0.5, (double) (o+1)/10);
		}

	}

}
