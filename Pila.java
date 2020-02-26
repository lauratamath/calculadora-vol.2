/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
**/
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
