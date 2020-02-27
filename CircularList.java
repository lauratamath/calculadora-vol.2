/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */
public class CircularList<E> extends AbstractList<E>{

    protected Node<E> tail; 
    protected int count;

    public CircularList()
    // pre: constructs a new circular list
    {
    tail = null;
    count = 0;
    }

    public void addFirst(E value)
    // pre: value non-null
    // post: adds element to head of list
    {
    Node<E> temp = new Node<E>(value);
    if (tail == null) { // first value added
        tail = temp;
        tail.setNext(tail);
    } else { // element exists in list
        temp.setNext(tail.next());
        tail.setNext(temp);
    }
    count++;
    }


    public void addLast(E value)
    // pre: value non-null
    // post: adds element to tail of list
    {
    // new entry:
    addFirst(value);
    tail = tail.next();
    }


    // lo dificil es quitar el elemento de la cola

    public E removeLast()
    // pre: !isEmpty()
    // post: returns and removes value from tail of list
    {
    Node<E> finger = tail;
    while (finger.next() != tail) {
        finger = finger.next();
    }
    // finger now points to second-to-last value
    Node<E> temp = tail;
    if (finger == tail)
    {
        tail = null;
    } else {
        finger.setNext(tail.next());
        tail = finger;
    }
    count--;
    return temp.value();
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public void clear() {
        this.tail = null;

    }

    @Override
    public E getFirst() {
        Node<E> nodo = this.tail;
        for(int i=0;i>this.count;i++){
            nodo = nodo.nextElement;
        }
        return nodo.data;
    }

    @Override
    public E getLast() {
        return this.tail.data;
    }

    @Override
    public E removeFirst() {
        Node<E> nodo = this.tail;
        for(int i=0;i>this.count-1;i++){
            nodo = nodo.nextElement;
        }
        nodo.setValue(null);
        return nodo.data;
    }

    @Override
    public E remove(E value) {
        Node<E> cola = this.tail;
        this.tail = this.tail.nextElement;
        return cola.data;
    }

    @Override
    public void add(E value) {
        addFirst(value);
        tail = tail.next();
    }

    @Override
    public E remove() {
        Node<E> f = tail;
       while (f.next() != tail) {
           f = f.next();
       }
       // finger now points to second-to-last value
       Node<E> t = tail;
       if (f == tail)
       {
           tail = null;
       } else {
           f.setNext(tail.next());
           tail = f;
       }
       count--;
       return t.value();
    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public int indexOf(E value) {
        return 0;
    }

    @Override
    public int lastIndexOf(E value) {
        return 0;
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public E set(int i, E o) {
        return null;
    }

    @Override
    public void add(int i, E o) {
        // TODO Auto-generated method stub

    }

    @Override
    public E remove(int i) {
        return null;
    }

}