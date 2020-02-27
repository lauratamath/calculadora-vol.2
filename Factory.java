/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */

public class Factory<E> {
    //selecciona la implementacion a utilizar para un stack
    //se utiliza el patron Factory
       public Pila<E> getStack(String entry) {
        // seleccion de la implementacion a utilizar:
        if (entry.equals("AL"))
          return new Arraylist<E>(); //regresa ArrayList
        else
          return new VectorS<E>(); //regresa Vector
       }

       public List<E> getList(String entry){
           if(entry.equals("SI")){
               return new SinglyLinkedList<E>();
           }else if(entry.equals("DO")){
               return new DoublyLinkedList<E>();
          }else{
            return new CircularList<E>();
          }
       }
    }