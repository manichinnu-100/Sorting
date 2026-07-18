import java.util.Scanner;

public class KthLargestElement {
    static int ans;
    public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int partition(int [] arr, int lo, int hi){
        int pivot = arr[lo];
        int smallerElements = 0;
        for(int i = lo+1; i<=hi; i++){
            if(arr[i]<pivot) smallerElements++;
        }
        int correctIndex = lo+smallerElements;
        swap(arr,lo,correctIndex);
        int i = lo, j = hi;
        while(i<correctIndex && j>correctIndex){
            if(arr[i]<pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<pivot){
                swap(arr,i,j);
            }
        }
        return correctIndex;
    }
    public static void quickSelect(int [] arr, int lo, int hi, int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1){
                ans = arr[lo];
                return;
            }
        }
        int index = partition(arr,lo,hi);
        if(index == k-1){
            ans = arr[index];
            return;
        }
        if(k-1<index) {
            quickSelect(arr, lo, index - 1, k);
        }
        else {
            quickSelect(arr, index + 1, hi, k);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ans = -1;
        quickSelect(arr,0,n-1,k);
        System.out.println(ans);
    }
}
