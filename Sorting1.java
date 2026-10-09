public class Sorting1 {
    static void mergeSort(int[] arr,int p,int r){
        if(p<r){
            int q = p+(r-p)/2;
            mergeSort(arr, p, q);
            mergeSort(arr, q+1, r);
            merge(arr,p,q,r);
        }
    }
    static void merge(int[] arr,int p,int q,int r){
        int n1 = q-p+1;
        int n2 = r-q;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = arr[p+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = arr[q+1+j];
        }
        int i=0,j=0,k=p;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {25,1,0,33,9,16,31};
        mergeSort(arr,0,arr.length-1);

        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}
