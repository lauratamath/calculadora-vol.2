/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
Referencia tomada del código de Douglas
**/

public class Nodo<E>{
   protected E data; // Valor almacenado
   protected Nodo<E> nextElement; // refiere al siguiente

   public Nodo(E v, Nodo<E> next)
   // pre: v es un valor, el siguiente es una referencia a resto de la lista
   // post: un elemento se construye como el nuevo
   {
       data = v;
       nextElement = next;
   }

   public Nodo(E v)
   // post: construye una nueva cola de una lista con valor v
   {
      this(v,null);
   }

   public Nodo<E> next()
   // post: devuelve la referencia al siguiente valor en la lista
   {
      return nextElement;
   }

   public void setNext(Nodo<E> next)
   // post: establece referencia al nuevo valor siguiente
   {
      nextElement = next;
   }

   public E value()
   // post: devuelve el valor asociado con este elemento
   {
      return data;
   }

   public void setValue(E value)
   // post: establece el valor asociado con este elemento
   {
      data = value;
   }
}