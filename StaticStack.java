package Assignment1;

public class StaticStack {

	private char[] stack;
	private int top;
	private int maxSize;

	public StaticStack(int size) {
		this.maxSize = size;
		this.stack = new char[maxSize];
		this.top = -1;
	}

	public void push(char c) {
		if (top < maxSize - 1) {
			stack[top++] = c;
		}
	}

	public char pop() {
		if (top >= 0) {
			return stack[top--];
		}
		return '\0';
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
