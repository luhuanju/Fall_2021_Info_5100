package homework4.pro1;

class ThreadSafeLinkedList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;
    private synchronized boolean add(E element) {
        addAtLast(element);
        return true;
    }
    private synchronized void addAtLast(E element) {
        Node<E> l = last;
        Node<E> node = new Node<E>(element, null, l);
        last = node;
        if (l == null) {
            first = node;
        } else {
            l.next = node;
        }
        size++;
    }
    public synchronized void addAtPosition(int index, E element) {
        checkRange(index);
        if (index == size) {
            addAtLast(element);
        } else {
            Node<E> l = node(index);
            addBeforeNode(element, l);
        }
    }
    private synchronized Node<E> node(int index) {
        if (index < (size << 1)) {
            Node<E> cursor = first;
            for (int i = 0; i < index; i++) {
                cursor = cursor.next;
            }
            return cursor;
        } else {
            Node<E> cursor = last;
            for (int i = size - 1; i > index; i--) {
                cursor = cursor.prev;
            }
            return cursor;
        }
    }
    private synchronized void addBeforeNode(E element, Node<E> specifiedNode) {
        Node<E> preNode = specifiedNode.prev;
        Node<E> newNode = new Node<>(element, specifiedNode, preNode);
        if (preNode == null) {
            first = newNode;
        } else {
            preNode.next = newNode;
        }
        specifiedNode.prev = newNode;
        size++;
    }
    private synchronized void checkRange(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("over index");
        }
    }
    public synchronized E removeAtPosition(int index, E e) {
        if (size==0) return null;
        checkRange(index);
        return deleteLink(index);
    }
    private synchronized E deleteLink(int index) {
        Node<E> l = node(index);
        E item = l.item;
        Node<E> prevNode = l.prev;
        Node<E> nextNode = l.next;

        if (prevNode == null) {
            first = nextNode;
        }else{
            prevNode.next = nextNode;
            l.next = null;
        }

        if (nextNode == null) {
            last = prevNode;
        }else{
            nextNode.prev = prevNode;
            l.prev = null;
        }
        size--;
        l.item = null;
        return item;
    }
    public synchronized int size() {
        return size;
    }
    public synchronized E getFirst() {
        if(size==0) return  null;
        return first.item;
    }
    public synchronized E getLast() {
        if(size==0) return  null;
        return last.item;
    }
}
