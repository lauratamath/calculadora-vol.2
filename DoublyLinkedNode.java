/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */
public class DoublyLinkedNode<E>{
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v,
                            DoublyLinkedNode<E> next,
                            DoublyLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }

    public DoublyLinkedNode<E> previous(){
        return this.previousElement;
    }

    public void setNext(DoublyLinkedNode<E> next){
        this.nextElement = next;
    }

    public E value(){
        return this.data;
    }

}