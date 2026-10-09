import java.util.*;
public class Tree1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    //NLR
    static void preOrder(Node root){
        if(root == null)
            return;
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }
    static void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            Node curr = que.poll();
            System.out.print(curr.data +" ");
            if(curr.left!=null) 
                que.offer(curr.left);
            if(curr.right!=null)
                que.offer(curr.right);
        }
    }
    static Node buildTree(Integer[] arr){
        if(arr.length ==0) return null;
        Node root = new Node(arr[0]);
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        int i=1;
        while(i<arr.length && !que.isEmpty()){
            Node curr = que.poll();
            if(arr[i]!=null){
                curr.left = new Node(arr[i]);
                que.offer(curr.left);
            }
            if(arr[i+1]!=null){
                curr.right = new Node(arr[i+1]);
                que.offer(curr.right);
            }
            i+=2;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = buildTree(new Integer[]{1,2,3,6,4,5,null});
        preOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // postOrder(root);
        // System.out.println();
        // levelOrder(root);
    }
}
