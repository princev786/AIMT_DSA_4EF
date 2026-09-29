class Toll{
    static int getMax(int[] arr,int k){
        if(arr.length == 0 ) return -1;
        int curr =0;
        int maxsum = 0;
        int start = 0;
        int end = k-1;
        for(int i=0;i<k;i++){
            curr += arr[i];
        }
        maxsum = Math.max(curr,maxsum);
        for(int i=k;i<arr.length;i++){
            curr -= arr[i-k];
            curr += arr[i];
            if(curr>maxsum){
                maxsum = curr;
                end = i;
                start = i-k+1;
            }
        }
        for(int j=start;j<=end;j++){
            System.out.print(arr[j]+ " ");
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr = {10,5,7,6,4,12,10,8};
        int k = 3;
        int res = getMax(arr,k);
        System.out.println(res);
    }
}