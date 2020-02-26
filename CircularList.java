/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
Referencia tomada del código de Douglas
**/
public class CircularList<E> extends AbstractList<E>{

	protected Node<E> tail; 
	protected int count;

	public CircularList()
	/*pre: construye una nueva lista circular*/
	{
	   tail = null;
	   count = 0;
	}

	public void addFirst(E value){
	/* pre: valor no nulo
	  post: agrega elemento al encabezado de la lista */
	   Node<E> temp = new Node<E>(value);
	   if (tail == null) { // primer valor agregado
	       tail = temp;
	       tail.setNext(tail);
	   } else { // el elemento existe en la lista
	       temp.setNext(tail.next());
	       tail.setNext(temp);
	   }
	   count++;
	}


	public void addLast(E value)
	/*pre: valor no nulo
	  post: agrega elemento a la cola de la lista*/
	{
	   // new entry:
	   addFirst(value);
	   tail = tail.next();
	}


	public E removeLast()
	/* pre:! isEmpty ()
	post: devuelve y elimina el valor de la cola de la lista*/
	{
	   Node<E> finger = tail;
	   while (finger.next() != tail) {
	       finger = finger.next();
	   }
	   /*el dedo ahora apunta al penúltimo valor*/
	   Node<E> temp = tail;
	   if (finger == tail)
	   {
	       tail = null;
	   } else {
	       finger.setNext(tail.next());
	       tail = finger;
	   }
	   count--;
	   return temp.value();
	}
}