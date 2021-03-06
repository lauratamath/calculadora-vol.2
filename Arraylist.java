/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */

import java.util.ArrayList;
public class Arraylist<E> extends AbstractPila<E>{

    protected ArrayList<E> pila;
    /**
	* Sin importar los elementos, agrega un dato a la pila 
	* post: se le agrega dicho elemento
	*/
    public void add (E value) {
		pila =  new ArrayList<E>();
    	pila.add(value);
    }
    /**
	* Eliminar un elemento de la pila
	* pre: En la pila se encuentra minimo un elemento en la pila
	* post: elimina el ultimo elemento de la pila
	* @return el elemento eliminado de la pila
	*/
    public E remove () {
    	return pila.remove(pila.size()-1);
    }
    
    public E peek(){
		return pila.get(pila.size() - 1);
	}

}
