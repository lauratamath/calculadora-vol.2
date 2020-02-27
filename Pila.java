/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */

public interface Pila<E> {

    /**
     * Agrega un valor al final de la lisa
     * post: agrega un nuevo valor a la pila
     * @param value valor que se agrega
     */
    public void add(E value);

    /**
     *Elimina el primer elemento de la lista
     * pre: la pila debe de tener minimo un valor
     * post: se le quita un valor a la pila
     * @return valor eliminado
     */
    public E remove();

    public E peek();
}
