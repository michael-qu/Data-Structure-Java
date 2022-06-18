public class QueueByLL {
    private ListNode head;
    private ListNode tail;
    private int size;
    public QueueByLL() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean offer(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size++;
            return true;
        }
        tail.next = newNode;
        tail = tail.next;
        size++;
        return true;
    }
    public Integer poll() {
        if (isEmpty()) {
            return null;
        }
        if (size == 1) {
            Integer resVal = head.value;
            head = null;
            tail = null;
            size--;
            return resVal;
        }
        ListNode res = head;
        head = head.next;
        res.next = null;
        size--;
        return res.value;
    }
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return head.value;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {

        QueueByLL queue = new QueueByLL();
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
