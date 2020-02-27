/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */

public abstract class AbstractPila<E> implements Pila<E>{

    @Override
    public void add(E value) {
        add(value);
    }

    @Override
    public E remove() {
        return remove();
    }
}