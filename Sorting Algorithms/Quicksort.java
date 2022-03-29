public class Quicksort {

    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int partition(int[] arr, int start, int pivot) {
        int i = start - 1;
        for (int j = start; j < pivot; j++) {
            if (arr[j] < arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[pivot];
        arr[pivot] = arr[i];
        arr[i] = temp;
        return i;
    }
    

    public static void quicksort(int[] arr, int start, int pivot) {

        if (start < pivot) {
            int idx = partition(arr, start, pivot);
            quicksort(arr, start, idx - 1);
            quicksort(arr, idx + 1, pivot);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[9];
        for (int i = 0; i < arr1.length-1; i++) {
            arr1[i] = (int)(Math.random() * 10) + 0;
        }
        arr1[arr1.length-1] = 5;
        int pivot = arr1.length - 1;    
        print_arr(arr1);
        // partition(arr1, 0, pivot);
        quicksort(arr1, 0, pivot);
        print_arr(arr1);
        
        
        
    }
}   

// public static int partition(int[] arr, int start, int pivot) {
    //     int i = start-1;
    //     // traverse through the array
    //     for (int j = start; j < pivot; j++) {
    //         if (arr[j] < arr[pivot]) {
    //             i++;
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }
    //     int temp = arr[i+1];
    //     arr[i+1] = arr[pivot];
    //     arr[pivot] = temp;
    //     return i;
    // }
    // public static void quicksort(int[] arr, int pos, int pivot) {

    //     if (pos < pivot) {
    //         pivot = partition(arr, pos, pivot);
    //         quicksort(arr, 1, pivot - 1); // lower half
    //         quicksort(arr, pivot, arr.length - 1); // upper half
    //     }

    // }