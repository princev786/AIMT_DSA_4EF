
import java.util.HashMap;

public class CountSubarrays {
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k = -10;
        int sum =0,c=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                c+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }

        System.out.println(c);
    }
}
