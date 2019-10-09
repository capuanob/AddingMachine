/**
 * @author Bailey Capuano
 * ClassID: 85141
 * Assignment Number: 2
 * This file implements the AddingMachine class. This class provides the functionality required to keep track of a 
 * running sum of additions and subtractions. 
 *
 */

package cse360assign2;

public class AddingMachine {
	
	/**
	 * Holds the sum of the additions and subtractions within the AddingMachine
	 */
	private int total;
	
	/**
	 * Stores string representation of additions and subtractions that the AddingMachine has encountered.
	 */
	private String history;
	
	/**
	 * Default class constructor, sets total to a default value of zero.
	 */
	public AddingMachine() {
		total = 0; 
		history = "0";
	}
	
	/**
	 * Gets the running total of the AddingMachine
	 * 
	 * @return value of total	
	 */
	public int getTotal() {
		return total;
	}
	
	
	/**
	 * Adds to the AddingMachine's total
	 * 
	 * @param value	what to add to the total
	 */
	public void add(int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts from the AddingMachine's total
	 * 
	 * @param value	what to subtract from the total
	 */
	public void subtract(int value) {
		total -= value;
		history += " - " + value;
	}
	
	/*
	 * Override of Java's toString method, used for easy representation of an AddingMachine for debugging.
	 * 
	 * @return	a string representation of the AddingMachine object.
	 */
	public String toString() {
		return history;
	}
	
	/**
	 * Resets the AddingMachine's properties.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
	
	
}
