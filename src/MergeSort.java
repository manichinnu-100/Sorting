import java.util.Scanner;

public class MergeSort{

    /* Name of the class has to be "Main" only if the class is public. */
        public static void merge(int [] arr1, int [] arr2, int [] arr){
            int i = 0, j = 0, k = 0;
            while(i<arr1.length && j<arr2.length){
                if(arr1[i]<=arr2[j]){
                    arr[k] = arr1[i];
                    i++;
                    k++;
                }
                else {
                    arr[k] = arr2[j];
                    k++;
                    j++;
                }
                while(i<arr1.length){
                    arr[k] = arr1[i];
                    i++;
                    k++;
                }
                while(j<arr2.length){
                    arr[k] = arr2[j];
                    j++;
                    k++;
                }
            }
        }
        public static void mergeSort(int [] arr){
            int n = arr.length;
            if(n==1) return;
            int [] arr1 = new int[n/2];
            int [] arr2 = new int[n-n/2];
            for(int i = 0; i<arr1.length; i++){
                arr1[i] = arr[i];
            }
            for(int i = 0; i<arr2.length; i++){
                arr2[i] = arr[i+n/2];
            }
            mergeSort(arr1);
            mergeSort(arr2);
            merge(arr1,arr2,arr);

        }
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            mergeSort(arr);
            for(int element:arr){
                System.out.print(element+" ");
            }
        }
    }


