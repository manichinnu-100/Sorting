import java.util.Scanner;
public class BubbleSort {
    public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void bubbleSort(int [] arr, int n){
        for(int x = 1; x<n; x++){
            boolean flag = true;
            for(int i = 0; i<n-x; i++){
                flag = false;
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
            if(flag == true) break;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,n);
        for(int each:arr){
            System.out.print(each+" ");
        }
    }
}
