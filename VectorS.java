/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */
import java.util.Vector;

public class VectorS<E>
 extends AbstractPila<E>
{
	protected Vector<E> data;

	public VectorS()
	// post: constructs a new, empty stack
	{
		data = new Vector<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	
}