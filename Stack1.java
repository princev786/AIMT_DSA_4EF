
public class Stack1 {
    static class Node{
        int data;
        Node next;
        
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    static Node top = null;

    static void push(int val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }
    static int pop(){
        if(top==null) return -1;
        int d = top.data;
        top = top.next;
        return d;       
    }
    static int peek(){
        if(top==null) return -1;
        return top.data;
    }

    static int[] middle(){
        if(top==null) return new int[]{-1,-1};
        if(top.next == null) return new int[]{top.data,-1};

        Node slow = top;
        Node fast = top;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next==null){
            return new int[]{slow.data,-1};
        }else{
            return new int[]{slow.data,slow.next.data};
        }
    }
    public static void main(String[] args) {
        
    }
}
