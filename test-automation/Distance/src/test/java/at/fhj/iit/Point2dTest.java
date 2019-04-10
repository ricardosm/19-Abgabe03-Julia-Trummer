package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Point2dTest {

	/**
	 * Set some Point2d for testing their functionality
	 */
	Point2d point2X = new Point2d();
	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		point2X.setX(7);
		assertEquals(7, point2X.getX(), 0.001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		point2X.setY(10);
		assertEquals(10, point2X.getY(), 0.001);
	}


	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		Point2d pt = new Point2d(10, 10);
		double distance = point2X.distanceFrom(pt);
		assertEquals(14.1421, distance, 0.001 );
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin() {
		point2X.setXY(20, 0);
		double distfromOrigin = point2X.distanceFromOrigin();
		assertEquals(20, distfromOrigin, 0.001);
	}
}
