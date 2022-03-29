public class BubbleSort {


    public static void bubble_sort(int[] arr) {
        boolean swapped = false;
        do {
            swapped = false;
            int n = arr.length-1;
            for (int i = 0; i < n; i++) {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    swapped = true;
                }
            }
            n -= 1;
        } while (swapped);

    }
    public static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void print_arr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        print_arr(arr);
        bubble_sort(arr);
        System.out.println();
        print_arr(arr);

    }
}