package testingPackage;

//import edu.princeton.cs.introcs.StdDraw;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

//enum Planets {
//	MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE
//};

public class TestingDriver {

	public static void main(String[] args) {
		int[] fileInts = new int[10];
		boolean success = false;
		String fileName;
		File inputFile;
		Scanner keyboard = new Scanner(System.in);

		while (!success) {
			double total = 0.0;
			try {
				
				System.out.println("Enter the name of the file:");
				fileName = keyboard.next();

				inputFile = new File(fileName);

				Scanner scanFile;
				scanFile = new Scanner(inputFile);
				for (int i = 0; i < 10; i++) {
					fileInts[i] = scanFile.nextInt();
					total += fileInts[i];
				}
				double average = total / 10.0;
				for (int i = 0; i < 10; i++) {
					System.out.println(fileInts[i]);
				}
				System.out.println("The average is: " + average);
				keyboard.close();
				scanFile.close();
				success = true;
			} catch (FileNotFoundException e) {
				System.out.println("File not found. Try again.");
			} catch (InputMismatchException e) {
				System.out.println("File contained non-int values. Try another file.");
			} catch (NoSuchElementException e) {
				System.out.println("The file did not contain 10 ints. Try again.");
			}
		}

	}
}
//		Planets firstPlanet = Planets.MERCURY;
//		Planets lastPlanet = Planets.NEPTUNE;
//		
//		System.out.println(firstPlanet + " " +  lastPlanet);
//	}
//}
// declare two rectangle objects
// BouncingRectangle rect1, rect2;
// instantiate two objects at random locations within the canvas
// their x-velocity and y-velocity are random between 0 and 0.01, and their size
// is 5% of the canvas
// rect1 = new BouncingRectangle(Math.random(), Math.random(),
// Math.random()*0.01, Math.random()*0.01, 0.05);
// rect2 = new BouncingRectangle(Math.random(), Math.random(),
// Math.random()*0.01, Math.random()*0.01, 0.05);

//		BouncingRectangle[] rArray = new BouncingRectangle[30];
//		
//		for (int i = 0; i < 30; i++) {
//			rArray[i] = new BouncingRectangle(Math.random(), Math.random(), Math.random()*0.01, Math.random()*0.01, 0.05);
//		}
//
//		// set up the StdDraw canvas
//		StdDraw.setCanvasSize(500, 500);
//		StdDraw.enableDoubleBuffering();
//
//		// animation loop
//		while (true) {
//			StdDraw.clear(StdDraw.LIGHT_GRAY);
//			/*
//			 * rect1.move(); rect2.move(); rect1.draw(); rect2.draw();
//			 */
//			for (int i = 0; i < 30; i++) {
//				rArray[i].move();
//				rArray[i].draw();
//			}
//			StdDraw.show();
//			StdDraw.pause(20);
//		}
//	}
//}

/*
 * package testingPackage;
 * 
 * public class TestingDriver {
 * 
 * public static void main(String[] args) { Fraction fract1 = new Fraction(1,2);
 * Fraction fract2 = new Fraction(1,2);
 * 
 * Fraction fractMulti = fract1.multiply(fract2);
 * 
 * //fractMulti = fract1.multiply(fract2);
 * 
 * System.out.println(fractMulti);
 * 
 * Fraction[] fractArray = new Fraction[100];
 * 
 * for (int i = 0; i < 100; i++) { fractArray[i] = new Fraction(i, i);
 * System.out.println(fractArray[i]); } } }
 */