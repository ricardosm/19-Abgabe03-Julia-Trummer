package at.fhj.iit;

public interface Stack {

	/**
	 * Tests if this stack is empty.
	 */
	public abstract boolean isEmpty();


	public abstract void push(String item);

	/**
	 * Removes the object at the top of this stack and returns that
	 * object as the value of this function.
	 * 
	 * if Stack is empty return an error message
	 * @throws Exception 
	 */
	public abstract String pop() throws Exception;

}