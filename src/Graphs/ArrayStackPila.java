package Graphs;

public class ArrayStackPila implements StackPila{

	private NodePila tope;
	private int cantidad;

	public ArrayStackPila() {
		this.tope = null;
		this.cantidad = 0;

	}//Constructor

	@Override
	public int getSize() {
		return this.cantidad;
	}//getSize

	@Override
	public boolean isEmpty() {
		return this.cantidad == 0;
	}//isEmpty

	@Override
	public Object top() throws EmptyStackException {
		if (isEmpty()) {
			throw new FullStackException("The stack is empty");
		}

		return tope.element;
	}//top

	@Override
	public void push(Object element) throws FullStackException {
		NodePila newNode = new NodePila(element);

		if (tope == null) {
			tope = newNode;
			System.out.println("Añadió: "+newNode.element);
		} else {
			newNode.next = tope;
			tope = newNode;
			System.out.println("Añadió: "+newNode.element);
		}
		cantidad++;
	}//push

	@Override
	public Object pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("The stack is empty");
		}
		Object element = tope.element;
		tope = tope.next;
		cantidad--;

		return element;
	}//pop

}//end class

