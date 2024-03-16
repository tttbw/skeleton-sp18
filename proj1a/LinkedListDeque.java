public class LinkedListDeque {
    public static class Node {
        int value;
        Node prev;
        Node rest;
        public Node(int x,Node m,Node n){
            value = x;
            rest = n;
            prev = m;
        }
    public void leftlink(Node l) {
            this.prev = l;
        }
    public void rightlink(Node r) {
            this.rest = r;
        }
    }
    public Node sentinel;
    public Node first;
    public Node last;
    public int size;
    public LinkedListDeque() {
        first = null;
        size = 0;
    }

    public LinkedListDeque(int x) {
        sentinel = new Node( 233,null,null);
        first = new Node(x,sentinel,null);

        /** find last node **/
        Node p = sentinel;
        while(p.rest != null) {
            p = p.rest;
        }
        last = p;
        sentinel = new Node( 233,last,first);
        size += 1;

    }
    public void getFirst() {
        System.out.println(first.value);
    }
    public void getLast() {
        System.out.println(last.value);
    }
    public void addFirst(int x) {
        size += 1;
        first = new Node(x,sentinel,first);
        /**sentinel.rest = first;**/
    }
    public void addLast(int x){
        size += 1;
        last = new Node(x,last,sentinel);
        /**sentinel.prev = last;**/

    }
    public boolean isEmpty() {
        return first == null;
    }
    public int size() {
        return this.size;
    }
    public void printDeque() {
            Node p = first;
            while(p != sentinel){
                System.out.println(p.value);
                p = p.rest;
        }
    }


    public  static  void  main(String[] args) {
        LinkedListDeque ld = new LinkedListDeque();
        ld.addFirst(123);
        ld.addLast(456);
        ld.addLast(789);
        ld.getFirst();
        ld.getLast();
        ld.printDeque();
        LinkedListDeque emld = new LinkedListDeque();
        System.out.println(emld.isEmpty());
        System.out.println(ld.size());

    }
}
