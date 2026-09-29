public class Queue1 {
    static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
        }
    }
    Node front = null,rear=null;

    void enqueue(int val){
        Node newNode = new Node(val);
        if(this.rear == null){
            this.rear=newNode;
            this.front = newNode;
            return;
        }
        this.rear.next = newNode;
    }
    int dequeue(){
        if(this.front == null) return -1;
        int d = this.front.data;
        this.front = this.front.next;
        return d;
    }

    
    public static void main(String[] args) {
        
    }
}
