/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
**/

public abstract class AbstractList<E> implements Lista<E>, Pila<E>{

    protected int count;

    /**
     * Se agrega un dato al final de la lista
     * @param value dato que se agregará
     */
    public abstract void add(E value);

    /**
     * Elimina y retorna el ultimo valor
     * @return el valor eliminado
     */
    public abstract E remove();

    /**
     *Obtiene el tamaño de la lista
     * @return el tamaño de la lista
     */
    public int getSize(){
        return count;
    }

}