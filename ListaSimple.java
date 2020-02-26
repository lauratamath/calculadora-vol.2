/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
Referencia tomada del código de Douglas
**/
public class ListaSimple<E>  extends AbstractList<E>{

   protected int count; // tamano de lista
   protected Nodo<E> head; // ref. al primer elemento

   public ListaSimple()
   /* post: genera una lista vacía*/
   {
      head = null;
      count = 0;
   }
   
   public int size()
   /* post: devuelve el número de elementos en la lista */
  {
    return count;
  }
  
  public void addFirst(E value){
  	/* post: el valor se agrega al comienzo de la lista*/
    
     head = new Nodo<E>(value, head);
     count++;
  }
  
  public E removeFirst()
  /* pre: la lista no está vacía
   post: elimina y devuelve el valor desde el principio de la lista*/
 {
     Nodo<E> temp = head;
     head = head.next(); /* mueve la lista hacia abajo*/
     count--;
     return temp.value();
  }
  
  public E getFirst()
  /* pre: la lista no está vacía
   post: devuelve el primer valor en la lista*/
  {
      return head.value();
  }
  
  public void addLast(E value) {
  	/* post: agrega valor al final de la lista
     ubicación para nuevo valor*/
      Nodo<E> temp = new Nodo<E>(value,null);
      if (head != null)
     {
        /*puntero a posible cola */
         Nodo<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
   
   
   public boolean contains(E value)
  /* pre: el valor no es nulo 
   post: devuelve verdadero si el valor se encuentra en la lista*/
  {
      Nodo<E> finger = head;
	  
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
   }
}