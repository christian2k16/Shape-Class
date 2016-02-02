/**
 *   File Name: Shape.java<br>
 *
 *   Mallapre, Christian<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Feb 1, 2016
 *
 */

package com.sqa.CM.shape.project;

import com.sqa.CM.util.helper.RequestInput;

/**
 * Shape //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mallapre, Christian
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Shape {
	private String name;
	private String type;
	private String color;
	private int numSides;
	private boolean ellipse;
	private boolean polygon;
	private boolean square;

	/**
	 * @param name
	 * @param type
	 * @param color
	 */
	public Shape() {
		this(RequestInput.getString("What is the name of the shape:"),
				RequestInput.getStringIgnoreCase("What is the type of the shape:", "Square", "Circle", "Triangle"),
				RequestInput.getString("What is the color of the shape:"));
	}

	public Shape(String name, String type, String color) {
		this.setName(name);
		this.setType(type);
		this.setColor(color);
		switch (type.toLowerCase()) {
		case "square":
			this.setEllipse(false);
			this.setSquare(true);
			this.setPolygon(true);
			this.setNumSides(4);
			break;
		case "circle":
			this.setEllipse(true);
			this.setSquare(false);
			this.setPolygon(false);
			this.setNumSides(0);
			break;
		case "triangle":
			this.setEllipse(false);
			this.setSquare(false);
			this.setPolygon(true);
			this.setNumSides(3);
			break;
		default:
			this.setEllipse(false);
			this.setSquare(false);
			this.setPolygon(false);
			this.setNumSides(0);
			break;
		}

	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the numSides
	 */
	public int getNumSides() {
		return this.numSides;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @return the ellipse
	 */
	public boolean isEllipse() {
		return this.ellipse;
	}

	/**
	 * @return the polygon
	 */
	public boolean isPolygon() {
		return this.polygon;
	}

	/**
	 * @return the square
	 */
	public boolean isSquare() {
		return this.square;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param ellipse
	 *            the ellipse to set
	 */
	public void setEllipse(boolean eclipse) {
		this.ellipse = eclipse;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param numSides
	 *            the numSides to set
	 */
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	/**
	 * @param polygon
	 *            the polygon to set
	 */
	public void setPolygon(boolean polygon) {
		this.polygon = polygon;
	}

	/**
	 * @param square
	 *            the square to set
	 */
	public void setSquare(boolean square) {
		this.square = square;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shape [name=");
		builder.append(this.name);
		builder.append(", type=");
		builder.append(this.type.toUpperCase());
		builder.append(", color=");
		builder.append(this.color);
		builder.append(", numSides=");
		builder.append(this.numSides);
		builder.append(", ellipse=");
		builder.append(this.ellipse);
		builder.append(", polygon=");
		builder.append(this.polygon);
		builder.append(", square=");
		builder.append(this.square);
		builder.append("]");
		return builder.toString();
	}

	public String toString2() {
		StringBuilder ab = new StringBuilder();
		ab.append("My Shape:");
		ab.append(this.getName());
		ab.append(" (");
		ab.append(this.getType());
		ab.append(")");
		return ab.toString();

	}
}
