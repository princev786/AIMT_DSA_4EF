class LL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    void addAtHead(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;
    }
    void addAtTail(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            return;
        }
        Node temp = this.head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void addAtPos(int data,int pos){
        Node newNode = new Node(data);
        if(this.head == null || pos<=1){
            addAtHead(data);
        }
        Node temp = this.head;
        for(int i=1;i<=pos-2 && temp.next!=null;i++){
            temp = temp.next;
        }
        if(temp.next!=null){
            newNode.next = temp.next;
            temp.next = newNode;
        }else{
            temp.next = newNode;
        }
    }
    void dltAtHead(){
        if(this.head == null ){
            return;
        }
        this.head = this.head.next;
    }
    void dltAtTail(){
        if(this.head == null ){
            return;
        }
        if(this.head.next==null){
            this.head = null;
            return;
        }
        Node temp = this.head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    void dltWithData(int key){
        if(this.head == null ){
            return;
        }
        if(this.head.data == key){
            this.head = this.head.next;
            return;
        }
        Node temp = this.head;
        while(temp.next.data != key && temp.next.next!=null){
            temp = temp.next;
        }
        if(temp.next.next!=null){
            temp.next = temp.next.next;
        }
    }
    Node reverse(){
        if(this.head == null ){
            return null;
        }
        Node curr = this.head;
        Node prev = null;
        
        while(curr!=null){
            Node fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }
        return prev;
    }
    Node middle(){
        if(this.head == null ){
            return null;
        }
        Node slow = this.head;
        Node fast = this.head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next; 
        }
        return slow;
    }
    boolean isPalindrome(){
        if(this.head == null || this.head.next==null) return true;

        Node midnode = this.middle();
        Node curr = midnode.next;
        Node prev = null;
        while(curr!=null){
            Node fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }
        Node temp = this.head;
        while(temp!=null && prev!=null){
            if(temp.data != prev.data ){
                return false;
            }
            temp = temp.next;
            prev = prev.next;
        }
        return true;
    }
    boolean isCyclic(){
        if(this.head == null){
            return false;
        }
        if(this.head.next == this.head){
            return true;
        }
        Node slow = this.head;
        Node fast = this.head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    Node startOfCycle(){
        if(this.head == null){
            return null;
        }
        Node slow = this.head;
        Node fast = this.head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = this.head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    
    Node addition(Node head1,Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        int sum =0,c=0;
        Node res = null;
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1!=null && temp2!=null){
            sum=temp1.data + temp2.data + c;
            Node newNode = new Node(sum%10);
            newNode.next= res;
            res = newNode;
            c= sum/10;
        }
        while(temp1!=null){
            sum=temp1.data+ c;
            Node newNode = new Node(sum%10);
            newNode.next= res;
            res = newNode;
            c= sum/10;
        }
        while(temp2!=null){
            sum=temp2.data+ c;
            Node newNode = new Node(sum%10);
            newNode.next= res;
            res = newNode;
            c= sum/10;
        }
        if(c!=0){
            Node newNode = new Node(c);
            newNode.next= res;
            res = newNode;
        }
        return res;
    }
}
public class LinkedList1 {
    public static void main(String[] args) {

    }
}
