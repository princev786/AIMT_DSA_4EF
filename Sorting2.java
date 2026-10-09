public class Sorting2 {
    static void quickSort(int[] arr,int p,int r){
        if(p<r){
            int pidx = partition(arr,p,r);
            quickSort(arr, p, pidx-1);
            quickSort(arr, pidx+1, r);
        }
    }

    static int partition(int[] arr,int p,int r){
        int pivot = arr[r];
        int i=p-1;
        for(int j=p;j<r;j++){
            if(arr[j]<=pivot){
                int temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = temp;
                i++;
            }
        }
        arr[r] = arr[i+1];
        arr[i+1] = pivot;
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,5,0,21,6,3};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
