// import java.util.Random;


class MyMergeSort {
    
    public void sort(int[] arr, int l, int r) {

        if (l < r) {    // continues recursion until  r reduces to l, or l increases to r.
            int midpt = l + (r - l) / 2;
            sort(arr, l, midpt);    // left side split
            sort(arr, midpt + 1, r);    // right side split
            merge(arr, l, midpt, r);   
        }
    }

    public void merge(int[] arr, int l, int midpt, int r) {
        int n1 = midpt - l + 1;     // current size of left array
        int n2 = r - midpt;     // current size of right array
        
        int[] n1_arr = new int[n1];     
        int[] n2_arr = new int[n2];

        for(int i = 0; i < n1; ++i) {
            n1_arr[i] = arr[l + i];     // adds values from left side of split
        }
        for(int j = 0; j < n2; ++j) {
            n2_arr[j] = arr[midpt + j + 1];     // adds values from right side of split
        }

        int i = 0;
        int j = 0;
        int k = l;      // starting point of array comparison; right side does not occur at arr[0]

        while (i < n1 && j < n2) {      // loop until one of them is out of index range
            if (n1_arr[i] < n2_arr[j]) {
                arr[k] = n1_arr[i];
                i++;
            } else {
                arr[k] = n2_arr[j];
                j++;
            }
            k++;    // next array slot of our original array
        }
        while (i < n1) {    // loop to add the rest of elements that were not added - left side
            arr[k] = n1_arr[i]; 
            k++;
            i++;
        }
        while (j < n2) {        // loop to add rest of elements not added - right side
            arr[k] = n2_arr[j];
            k++;
            j++;
        }
    }


    public static void print_array(int[] arr) {
        System.out.println("hello");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        MyMergeSort sort1 = new MyMergeSort();
        int[] arr1 = new int[10];
        int len = arr1.length;
        int r = arr1.length - 1;

        for (int i = 0; i < len; i++) {
            arr1[i] = (int)(Math.random() * 20) + 1;
            System.out.println(arr1[i]);
        }
        print_array(arr1);

        sort1.sort(arr1, 0, r);
        print_array(arr1);
    }
}