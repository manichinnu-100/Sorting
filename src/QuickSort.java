//import java.util.Scanner;
//public class QuickSort{
//    public static void swap(int [] arr,int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//    public static int partition(int [] arr, int lo, int hi){
//        int pivot = arr[lo];
//        int smallerCount = 0;
//        for(int i = lo+1; i<arr.length; i++){
//            if(arr[i]<pivot) smallerCount++;
//        }
//        int correctIndex = lo + smallerCount;
//        swap(arr,correctIndex,lo);
//        int i = lo, j = hi;
//        while(i<correctIndex && j>correctIndex){
//            if(arr[i]<pivot) i++;
//            else if(arr[j]>pivot) j--;
//            else if(arr[i]>pivot && arr[j]<pivot){
//                swap(arr,i,j);
//            }
//        }
//        return correctIndex;
//    }
//    public static void quickSort(int [] arr, int lo, int hi){
//        if(lo>=hi) return;
//        int idx = partition(arr,lo,hi);
//        quickSort(arr,lo,idx-1);
//        quickSort(arr,idx+1,hi);
//    }
//    public static void main(String [] args){
//    Scanner sc = new Scanner(System.in);
//    int [] arr = {4,9,7,1,2,3,6,5,8};
//    int n = arr.length;
//    quickSort(arr,0,n-1);
//    for(int element:arr){
//        System.out.print(element+" ");
//    }
//    }
//}
import java.util.Scanner;
public class QuickSort
{
    public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int partition(int [] arr, int lo, int hi){
        int pivot = arr[lo];
        int smallerCount = 0;
        for(int i = lo+1; i<arr.length; i++){
            if(arr[i]<pivot) smallerCount++;
        }
        int correctIndex = lo+smallerCount;
        swap(arr,correctIndex,lo);
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
    public static void quickSort(int [] arr, int lo, int hi){
        int index = partition(arr,lo,hi);
        quickSort(arr,lo,index-1);
        quickSort(arr,index+1,hi);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
