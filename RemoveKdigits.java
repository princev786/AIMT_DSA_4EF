import java.util.*;

public class RemoveKdigits {
    static String removeKDigits(String s,int k){
        if(k>=s.length()) return "0";
        Deque<Character> st = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>=curr){
                st.pop();
                k--;
            }
            st.push(curr);
        }
        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }
        int i;
        for(i=0;i<ans.length();i++){
            if(ans.charAt(i)!='0'){
                break;
            }
        } 
        return ans.substring(i,ans.length());
    }
    public static void main(String[] args) {
        String s = "7259986153";
        int k = 3;
        String res = removeKDigits(s,k);
        System.out.println(res);
    }
}
