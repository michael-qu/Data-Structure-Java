public class StackByArray {
    //Note that the stack size is bounded by a specified capacity
    private int[] array;
    private int head;
    //private int size;
    public StackByArray(int cap) {
        array = new int[cap];
        head = -1;
        //size = 0;
    }
    public boolean push(int value) {
        if (isFull()) {
            return false;
        }
        head++;
        array[head] = value;
        //size++;
        return true;
    }
    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        int res = array[head];
        head--;
        //size--;
        return res;

    }
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return array[head];
    }
    public boolean isFull() {
        //return size == array.length;
        return size() == array.length;
    }
    public boolean isEmpty() {
        //return size == 0;
        return size() == 0;
    }
    public int size() {
        //return size;
        return head + 1;
    }

    public static void main(String[] args) {
        StackByArray stack = new StackByArray(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()){
            System.out.println(stack.size());
            System.out.println(stack.peek());
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()){
            System.out.println(stack.size());
            System.out.println(stack.peek());
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        
    }
}
