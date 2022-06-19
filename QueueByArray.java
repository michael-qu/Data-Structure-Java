public class QueueByArray {
    //Note that the queue size is bounded by a specified capacity
    private int[] array;    //The array is logically cyclic
    private int head;   //Index of the first meaningful element
    private int tail;   //Index of the last meaningful element
    private int size;
    public QueueByArray(int cap) {
        array = new int[cap];
        head = 0;
        tail = 0;
        size = 0;
    }

    public boolean offer(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            array[tail] = value;
            head = tail;    //For defensive purpose
            size++;
            return true;
        }
        tail++;
        tail %= array.length;
        array[tail] = value;
        size++;
        return true;
    }
    public Integer poll() {
        if (isEmpty()) {
            return null;
        }
        if (size == 1) {
            size--;
            return array[head];
        }
        int tmp = array[head];
        head++;
        head %= array.length;
        size--;
        return tmp;
    }
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return array[head];
    }
    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == array.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {

        QueueByArray queue = new QueueByArray(2);
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        while (!queue.isEmpty()){
            System.out.println(queue.size());
            System.out.println(queue.peek());
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        while (!queue.isEmpty()){
            System.out.println(queue.size());
            System.out.println(queue.peek());
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());

    }


}