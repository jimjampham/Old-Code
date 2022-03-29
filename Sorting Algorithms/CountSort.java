import java.util.Arrays;
import java.util.Collections;

public class CountSort {


    public static void print_arr(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
public static void print_arr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}


    public static void countsort(Integer[] arr1, int[] arr2, int max) {
        int[] occurances = new int[max+1];
        for (int i = 0; i < arr1.length; i++) {
            occurances[arr1[i]]++;
        }
        for (int i = 1; i < occurances.length; i++) {
            occurances[i] = occurances[i] + occurances[i-1];
        }
        int idx = occurances.length - 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[occurances[arr1[i]]-1] = arr1[i]; 
            occurances[arr1[i]]--;
        }
    }

    public static void main(String[] args) {
        int arr_len = 10;
        Integer[] arr = new Integer[arr_len];
        int[] sorted_arr = new int[arr_len];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 0;
        }
        int max = Collections.max(Arrays.asList(arr));
        System.out.println(max);
        print_arr(arr);
        countsort(arr, sorted_arr, max);
        print_arr(sorted_arr);
        
    }
}