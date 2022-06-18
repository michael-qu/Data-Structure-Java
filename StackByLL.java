public class StackByLL {
    private ListNode head;
    private int size;
    public StackByLL() {
        head = null;
        size = 0;
    }
    public boolean push(int value) {
        //Assume the linked list will not be full
        ListNode newNode = new ListNode(value);
            /*
            if (isEmpty()) {
                head = newNode;
                size++;
                return true;
            }
            */
        newNode.next = head;
        head = newNode;
        size++;
        return true;
    }
    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        ListNode res = head;
        head = head.next;
        res.next = null;    //de-link from the linked list
        size--;
        return res.value;
    }
    public Integer peek() {
        if (isEmpty()) {
            return null;    //return type as Integer enables null as return value
        }
        return head.value;  //int will be converted to Integer by auto-boxing
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        StackByLL stack = new StackByLL();
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
