import java.util.*;
public class ReverseQuue {
    static void reverse(Queue<Integer> que){
        Deque<Integer> st = new LinkedList<>();
        while(!que.isEmpty()){
            int curr = que.poll();
            st.push(curr);
        }
        while(!st.isEmpty()){
            int curr = st.pop();
            que.offer(curr);
        }  
    }
    static int[] repeatNonrepeat(Queue<Integer> que){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<que.size();i++){
            int curr = que.poll();
            map.put(curr,map.getOrDefault(curr, 0)+1);
        }
        int[] res = new int[2];
        for(int key : map.keySet()){
            if(res[0]==0 && map.get(key)==1){
                res[0]= key;
            }
            if(res[1]==0 && map.get(key)!=1){
                res[1]= key;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(10);
        que.offer(20);
        que.offer(30);
        que.offer(20);
        que.offer(30);
        // reverse(que);
        int[] res = repeatNonrepeat(que);
        System.out.println(res[0]+" "+res[1]);
        // while(!que.isEmpty()){
        //     System.out.println(que.poll());
        // }
    }
}
