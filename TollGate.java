public class TollGate {
    public static void main(String[] args){
        int[] arr = {8,5,1,12,2,9,6,3};
        int k = 3;
        int curr=0,maxsum=0;

        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        maxsum = Math.max(curr,maxsum);
        for(int i=k;i<=arr.length-1;i++){
            curr -= arr[i-k];
            curr += arr[i];
            maxsum = Math.max(curr,maxsum);
        }
        System.out.println(maxsum);
    }
}
