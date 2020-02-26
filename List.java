/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version /02/2020
Referencia tomada del código de Douglas
**/

public interface List<E> {

   public int size();
   // post: devuelve el número de elementos en la lista

   public boolean isEmpty();
   // post: Devulve verdadero si la lista no tiene elementos

   public void clear();
   // post: empties list

   public void addFirst(E value);
   // post: se agrega el valor al comienzo de la lista

   public void addLast(E value);
   // post: se agrega el valor al final de la lista

   public E getFirst();
   // pre: la lista no está vacía
   // post: devuelve el primer valor en la lista

   public E getLast();
   // pre: la lista no está vacía
    // post: devuelve el último valor en la lista   

   public E removeFirst();
   // pre: la lista no está vacía
   // post: elimina el primer valor de la lista   

   public E removeLast();
   // pre: la lista no está vacía
   // post: elimina el último valor de la lista   

   public E remove(E value);
   // post: elimina y devuelve el elemento igual al valor
    // de lo contrario devuelve nulo

   public void add(E value);
   // post: el valor se agrega a la cola de la lista   

   public E remove();
   // pre: list tiene al menos un elemento
   // post: elimina el último valor encontrado en la lista

   public E get();
   // pre: list tiene al menos un elemento
   // post: devuelve el último valor encontrado en la lista

   public boolean contains(E value);
   // pre: el valor no es nulo 
   // post: devuelve verdadero si la lista contiene un objeto igual al valor

   public int indexOf(E value);
    // pre: el valor no es nulo
    // post: devuelve (0-origen) índice de valor,
    // o -1 si no se encuentra el valor

   public int lastIndexOf(E value);
   // pre: el valor no es nulo
   // post: devuelve (0-origen) índice de valor,
   // o -1 si no se encuentra el valor

   public E get(int i);
    // pre: 0 <= i <size ()
    // post: devuelve el objeto encontrado en esa ubicación  

   public E set(int i, E o);
   // pre: 0 <= i <size () 
   // post: establece con la entrada de la lista al valor de; // devuelve el valor anterior

   public void add(int i, E o);
   // pre: 0 <= i <= size ()
   // post: agrega con la entrada de la lista al valor o

   public E remove(int i);
   // pre: 0 <= i <tamaño ()
   // post: elimina y devuelve el objeto encontrado en esa ubicación

   public Iterator<E> iterator();
   // post: devuelve un iterador que permite
    // recorrido ordenado de elementos en la lista
}