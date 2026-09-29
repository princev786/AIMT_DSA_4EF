public class LongestSubstrK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,0,4};
        int k = 4;
        int l=0,sum=0;
        int maxlen=0;

        for(int r=0;r<arr.length;r++){
            sum += arr[r];
            while(sum>k){
                sum -= arr[l];
                l+=1;
            }
            if(sum<=k){
                maxlen= Math.max(maxlen,r-l+1);
            }
        }
        System.out.println(maxlen);
    }
}
