public class ArrayDeque<item> {
    private item[] items;

    /** length of array */
    private  int length;

    /** size of deque */
    private int size;

    /** nextLast is the index  addLast wil take,and default is 4 */
    public int nextLast ;

    /** nextLast is the index addFirst will takeand default is 4 */
    public int nextFirst;



    public ArrayDeque() {
        size = 0;
        items = (item[]) new Object[8];
        length = 8;
        nextFirst = 4;
        nextLast = 5;
    }

    public int IndexLoopAdd(int x) {
        if(x >= length){x = 1;}
        else {x += 1;}
        return x;
    }
    public int IndexLoopMinus(int x) {
        if(x == length){x = length - 8;}
        else if (x == length - 8) {
            x =length - 1;
        } else {x -= 1;}
        return x;
    }


    public boolean isEmpty() {
        return nextFirst - nextLast == 1;
    }

   public item getFirst() {
        if(nextFirst == length -1){return items[0];}
        return items[nextFirst + 1];
   }

    /** resize capacity of items to cap */
    private void resize(int cap) {
        item[] a = (item[]) new Object[length + cap];
        System.arraycopy(items,0,a,0,size);
        items = a;
        length += cap;

    }
    public void addLast(item x) {
        if(size == length) {
            this.resize(8);
            nextLast += 8;
        }
        nextLast = IndexLoopAdd(nextLast);
        if(nextLast == length){items[length - 1] = x;}
        else{items[nextLast -1] = x;}
        size ++;

    }

    public void addFirst(item x) {
        if(size  == length) {
            this.resize(8);
            nextFirst += 8;
            nextLast += 8;
        }
        nextFirst = IndexLoopMinus(nextFirst);
        if(nextFirst == length -1){items[length -8] = x;}
        else{items[nextFirst + 1] = x;}
        size ++;
    }

    public item get(int x) {
        return items[x];
    }

    /** test */
    public static void main(String[] args) {
        ArrayDeque<Integer> testArray = new ArrayDeque<>();
        testArray.addFirst(4);
        testArray.addLast(8);
        testArray.addLast(6);
        testArray.addFirst(5);
        testArray.addLast(9);
        testArray.addLast(10);
        testArray.addLast(11);
        testArray.addLast(13);
        testArray.addFirst(15);
        testArray.addFirst(20);
        testArray.addLast(21);
        testArray.addLast(21);
        testArray.addLast(21);
        testArray.addLast(23);
        testArray.addFirst(22);
        testArray.addFirst(17);
        testArray.addLast(11);
        testArray.addLast(12);





        System.out.println("nextFirst:" + " " + testArray.nextFirst);
        System.out.println("nextLast:" + " " + testArray.nextLast);
        System.out.println("size:" + " " + testArray.size);
        System.out.println("length:" + " " + testArray.length);
        System.out.println("getFirst:" + " " + testArray.getFirst());
        System.out.println("isEmpty?:" + " " + testArray.isEmpty());

    }

}
