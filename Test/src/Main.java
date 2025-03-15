import java.util.Arrays;
import java.util.Random;

public class Main {
   static int partition(int[] arr, int low, int high) {  // location of our pivot
       int pivot = arr[high]; //pivot will at the end
       int i = low - 1;       //index "i" is at the start
       //for loop goes through the whole array
       for (int j = low; j <= high - 1; j++){
            if (arr[j] < pivot){
                i++;
                //creates a swap when a number is less than the pivot it goes on the left hand side
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
       }
       //finishes the array
       int temp = arr[i + 1];
       arr[i + 1] = arr[high];
       arr[high] = temp;
       return i + 1;  //location of pivot
   }
       private static void quickSort ( int[] arr, int low, int high){
           if (high <= low)   //base case, array can't broken apart anymore
               return;
           int pivot = partition(arr, low, high); //the high and low half of the array
           quickSort(arr, low, pivot - 1);   //the low half
           quickSort(arr, pivot + 1, high);  //the high half
       }

    public static void main(String[] args) {
        Random rand = new Random();  //randomizes number
        int n = 10;                  //number of values in the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {  //loops the numbers and randomizes them based on the number
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));   //prints out unsorted array
        quickSort(arr, 0, arr.length - 1);  //uses quicksort
        System.out.println(Arrays.toString(arr));       //prints out sorted array
        }
    }


