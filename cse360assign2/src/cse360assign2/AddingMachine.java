/**
 *@author An Ngo
 *@classID 85141
 *@assignment 2
 */
package cse360assign2;

/**
 * 
 * class AddingMachine
 *
 */
public class AddingMachine {
	private int total;
	private String record;
	/**
	 * constructor for class AddingMachine
	 */
	public AddingMachine() {
		total = 0;	// not needed - included for clarity
		record = "0";
	}
	/**
	 * 
	 * @return total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * 
	 * @param value integer to be added to total
	 */
	public void add (int value) {
		record = record + " + " + Integer.toString(value);
		total = total + value;
	}
	/**
	 * 
	 * @param value	integer to be subtracted from total
	 */
	public void subtract (int value) {
		record = record + " - " + Integer.toString(value);
		total = total - value;
	}
	/**
	 * @return record of all of the methods and parameters used
	 */
	public String toString() {
		return record;
	}
	/**
	 * 
	 */
	public void clear() {
		total = 0;
		record = "0";
	}
}
