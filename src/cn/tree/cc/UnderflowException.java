package cn.tree.cc;

/**
 * Exception class for access in empty containers
 * such as stacks, queues, and priority queues.
 * @author SunRuiGuang
 *
 */
public class UnderflowException extends RuntimeException {
	/**
	 * Construct this exception object.
	 * @param message the error message.
	 */
	public UnderflowException(String message) {
		super(message);
	}
	public UnderflowException() {
		super("null");
	}
}
