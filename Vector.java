/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
**/
import java.util.Vector;

public class Vector<E> extends AbstractPila<E> implements Pila<E> {

    protected Vector<E> pila = new Vector<E>();
    /**
	* Sin importar los elementos, agrega un dato a la pila 
	* post: se le agrega dicho elemento
	*/
    public void add (E value) {
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