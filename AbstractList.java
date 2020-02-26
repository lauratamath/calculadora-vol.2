/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
**/

public abstract class AbstractList<E> implements Lista<E>{

    protected int count;

    /**
     * Se encarga de agregar un dato al final de la lista
     * @param value dato que se agregara a la lista
     */
    public abstract void add(E value);

    /**
     * Se encarga de eliminar y retornar el ultimo valor
     * @return el valor eliminado
     */
    public abstract E remove();

    /**
     * Se encarga de conseguir el tamañoñ de la lista
     * @return el tamaño de la lista
     */
    public int getSize(){
        return count;
    }

}