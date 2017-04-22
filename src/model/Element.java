package model;

import javafx.geometry.Point2D;

/**
 * Abstract class to be extended by Elements in the Model.
 * This class describes abstract fields and methods an Element has.
 * For now Element is only subclassed by Lander and Triangle.
 * 
 * @author Luis
 *
 */
public abstract class Element {

	/**
	 * Abstract method to be overridden by concrete Elements.
	 * If an Element of the Model should at some point be updated, it
	 * should override this method
	 * 
	 * @param gravity
	 * @param deltaSec
	 */
	public abstract void update(double deltaSec);
	
}
