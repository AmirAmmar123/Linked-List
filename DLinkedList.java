public class DLinkedList<T> implements  List<T> {
    private DNode cursor;
    private DNode tail;
    private DNode head;
    private int size;


    public DLinkedList() {
        size = 0;
        this.tail = new DNode(null);
        this.head = new DNode(null);
    }

    @Override
    public void insert(T newElement) {
        if (newElement == null) throw new NullPointerException();

        DNode newNode = new DNode(newElement);

        if(isEmpty()){
            head = tail = cursor = newNode;
            newNode.setPrev(null);
            newNode.setNext(null);
        }else{
            DNode current = cursor;
            DNode next = current.getNext();

            if(next == null){
                current.setNext(newNode);
                newNode.setPrev(current);
                newNode.setNext(null);
                cursor = newNode;
                tail = cursor;
            }else{
                current.setNext(newNode);
                newNode.setPrev(current);
                newNode.setNext(next);
                next.setPrev(current);
                cursor = newNode;
            }


        }
        size++;





    }

    @Override
    public T remove() {
        if (!isEmpty()) {
            DNode current = cursor;
            T elem = current.getElement();
            if (cursor == tail ) {
                tail = cursor.getPrev();
                current.setNext(null);
                current.setPrev(null);
                cursor = head;
                size -- ;
                return elem;
            } else {
                DNode prev = current.getPrev();
                DNode next = current.getNext();
                prev.setNext(next);
                next.setPrev(prev);
                current.setNext(null);
                current.setPrev(null);
                cursor = next;
                size -- ;
                return elem;
            }

        }
        return null;


    }

    @Override
    public T remove(T element) {
        if(element == null) throw new NullPointerException();
        if(goToBeginning()){
            while(hasNext()){
                DNode curr = cursor;
                T curren_val = curr.getElement();

                if(curren_val.equals(element)){
                    DNode next = cursor.getNext();
                    DNode prev = cursor.getPrev();
                    if( (prev != null) && (next != null)){
                        prev.setNext(next);
                        next.setPrev(prev);
                        curr.setNext(null);
                        curr.setNext(null);
                        cursor = next;
                    }
                    if( (prev==null) && (next !=null)){
                        curr.setNext(null);
                        cursor = head = next ;

                    }else if( (prev !=null) && (next == null)) {
                        curr.setPrev(null);
                        cursor = tail = prev ;
                    }
                    return curren_val;
                }else{
                    cursor = cursor.getNext();
                }


            }
            size --;
        }


        return null;
    }

    @Override
    public void clear() {
        cursor = null;
        tail = null;
        head = null;
        size = 0 ;

    }

    @Override
    public void replace(T newElement) {
        if( (newElement == null)  ) throw new NullPointerException();
        if(isEmpty()) return ;
        cursor = new DNode(newElement);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean goToBeginning() {
        if (isEmpty()) return false;
        cursor = head;
        return true;


    }

    @Override
    public boolean goToEnd() {
        if (isEmpty()) return false;
        cursor = tail;
        return true;
    }

    @Override
    public T getNext() {
        if(cursor != tail){
            return cursor.getNext().getElement();
        }
        return null;
    }

    @Override
    public T getPrev() {
        if(cursor != head){
            return this.cursor.getPrev().getElement();
        }
        return null;
    }

    @Override
    public T getCursor() {
        if (isEmpty()) return null;
        return cursor.getElement();
    }

    @Override
    public boolean hasNext() {
        return cursor != tail ;
    }

    @Override
    public boolean hasPrev() {
        return cursor != head;
    }

    /*
    * Class DNode
    * */
    private class DNode {
        private T element;
        private DNode next;
        private DNode prev;

        public DNode(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public void setNext(DNode next) {
            this.next = next;
        }

        public DNode getNext() {
            return next;
        }

        public void setPrev(DNode prev) {
            this.prev = prev;
        }

        public DNode getPrev() {
            return prev;
        }

    }
}


