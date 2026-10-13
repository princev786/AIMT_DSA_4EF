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
    boolean isPathExist(Node root,int target){
        if(root == null) return false;
        if(root.left == null && root.right ==null && root.data == target){
            return true;
        }
        int rsum = target - root.data;
        return isPathExist(root.left,rsum) || isPathExist(root.right, rsum);
    }
    static ArrayList<Integer> hasPath(Node root,int target){
        ArrayList<Integer> res = findPath(root,target,new ArrayList<Integer>(),new ArrayList<Integer>());
        return res;
    }
    static ArrayList<Integer> findPath(Node root,int target,ArrayList<Integer> res,ArrayList<Integer> path){
        if(root == null) return res;
        if(root.left == null && root.right==null && root.data == target){
            path = new ArrayList<>(res);
            path.add(root.data);
            System.out.println(path);
            // return path;
        }
        res.add(root.data);
        findPath(root.left, target-root.data, res,path);
        findPath(root.right, target-root.data, res,path);
        res.remove(res.size()-1);
        return path;
    }

    static boolean isIdentical(Node root1,Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2==null) return false;

        if(root1.data != root2.data) return false;

        return isIdentical(root1.left, root2.left) || isIdentical(root1.right, root2.right);
    }
    public static void main(String[] args) {
        Node root = buildTree(new Integer[]{5,2,3,1,3,4,1,null,null,null,3});
        ArrayList<Integer> path = hasPath(root, 12);
        // System.out.println(path);
        // preOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // postOrder(root);
        // System.out.println();
        // levelOrder(root);
    }
}
