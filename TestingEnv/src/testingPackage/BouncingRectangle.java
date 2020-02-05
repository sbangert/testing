package testingPackage;

import edu.princeton.cs.introcs.StdDraw;

/* BouncingRectangle class, for managing the movement of a rectangle that bounces around
   an StdDraw canvas
*/
import java.lang.Math;

public class BouncingRectangle {

	/*
	 * A rectangle bounces within a StdDraw window. The (xPosition, yPosition) is
	 * the center of the rectangle. The values of xVelocity and yVelocity determine
	 * how far (and which direction the rectangle moves each time the move() method
	 * is invoked. The value of size gives the half-width of the rectangle. The
	 * boundary values give the edges of the bounding box in which the rectangle
	 * bounces. This is important in case client programs use a scale other than the
	 * default of 0 to 1.
	 */
	private double xPosition;
	private double yPosition;
	private double xVelocity;
	private double yVelocity;
	private double size; // this is the half-width of the rectangle
	private double leftBoundary, rightBoundary, topBoundary, bottomBoundary;

	/*
	 * no-argument constructor. Assumes an StdDraw scale from 0 to 1. Initializes
	 * values to be reasonable random values.
	 */
	public BouncingRectangle() {
		this.xPosition = Math.random();
		this.yPosition = Math.random();
		this.xVelocity = Math.random() * .005;
		this.yVelocity = Math.random() * .005;
		this.size = Math.random() * 0.1;
		this.leftBoundary = 0;
		this.rightBoundary = 1;
		this.topBoundary = 1;
		this.bottomBoundary = 0;
	}

	/*
	 * Constructor that allows setting of position, velocity and size variables
	 */
	public BouncingRectangle(double x, double y, double xv, double yv, double s) {
		this.xPosition = x;
		this.yPosition = y;
		this.xVelocity = xv;
		this.yVelocity = yv;
		this.size = s;
		this.leftBoundary = 0;
		this.rightBoundary = 1;
		this.topBoundary = 1;
		this.bottomBoundary = 0;
	}

	/*
	 * Constructor that allows setting of position, velocity and size variables, as
	 * well as boundaries. This is necessary to set the edges of the canvas in case
	 * your scale is not 0 through 1.
	 */
	public BouncingRectangle(double x, double y, double xv, double yv, double s, double l, double r, double b,
			double t) {
		this.xPosition = x;
		this.yPosition = y;
		this.xVelocity = xv;
		this.yVelocity = yv;
		this.size = s;
		this.leftBoundary = l;
		this.rightBoundary = r;
		this.topBoundary = t;
		this.bottomBoundary = b;
	}

	public void move() {
		// advance the position, according to the velocity:
		this.xPosition += this.xVelocity;
		this.yPosition += this.yVelocity;
		// If the boundary is reached, then bounce by reversing
		// the relevant velocity:
		if ((this.xPosition + this.size > this.rightBoundary && this.xVelocity > 0) || 
			(this.xPosition - this.size < this.leftBoundary && this.xVelocity <0)) {
			this.xVelocity *= -1;
		}
		if ((this.yPosition + this.size > this.topBoundary && this.yVelocity >0 ) ||
		  (this.yPosition - this.size < this.bottomBoundary && this.yVelocity < 0)) {
			this.yVelocity *= -1;
		}
	}

	/* The rectangle is filled with white, and has a black outline */
	public void draw() {
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(this.xPosition, this.yPosition, this.size, this.size);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(this.xPosition, this.yPosition, this.size, this.size);
	}

}