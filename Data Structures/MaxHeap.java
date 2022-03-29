// import java.util.Random;
// Max Heap
// Heapify
// Insert
// Extract Max
// Build Heap
// Heap Sort

class MaxHeap {
    private int heap_size;
    public int[] heap;
    private int current_size = 0;
    
    public MaxHeap(int array_size) {
        this.heap = new int[array_size];
        this.heap_size = array_size;
    }
    

    public boolean is_leaf(int idx) {
        int child1 = idx * 2 + 1;
        int child2 = idx * 2;
        if ((child1 <= current_size) || (child2 <= current_size)) {
            return false;
        }
        return true;
    }


    public void swap(int pos1, int pos2) {
        int temp = this.heap[pos1];
        this.heap[pos1] = this.heap[pos2];
        this.heap[pos2] = temp;
    }


    public void print() {
        for (int i = 0; i < this.heap.length; i++) {
            System.out.print(this.heap[i] + " ");
        }
        System.out.println();
    }


    public void heapify(int idx) {
        int largest = idx;
        int left = idx * 2 + 1; 
        int right = idx * 2 + 2;
        if (left <= this.current_size-2 || right <= this.current_size-2) {
            if (this.heap[left] > this.heap[largest]) {
                largest = left;
            }
            if (this.heap[right] > this.heap[largest]) {
                largest = right;
            }
        }
        if (largest != idx) {
            swap(largest, idx);
            heapify(largest);
        }
    }


    public int extract_max() {
        int max = this.heap[0];
        this.heap[0] = this.heap[this.current_size-1];
        this.heap[this.current_size-1] = max;
        this.current_size--;
        this.heapify(0);
        return max;
    }
    
    
    public void build_heap() {

        int idx = this.current_size;
        for (int i = idx / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }


    public void heap_sort() {
        build_heap();
        
        int size = this.current_size;
        for (int i = size-1; i >= 0; i--) {
        extract_max();
        }
    }


    public void insert(int data) {
        if (this.current_size < this.heap_size) {
            heap[this.current_size] = data;
        }

        // Check if parent is smaller than the data point we inserted
        int parent;
        int arr_idx = this.current_size;    // last element to be added
        // sets correct parent
        if (arr_idx % 2 == 0) {
            parent = (arr_idx) / 2; 
        }
        else {
            parent = (arr_idx-1) / 2; 
        }

        while (this.heap[arr_idx] > this.heap[parent]) {  // conditional checks if item at current index is larger than parent
            swap(arr_idx, parent);
            arr_idx = parent;   // updates array index
            if (arr_idx % 2 == 0) {
                parent = (arr_idx) / 2; 
            }
            else {
                parent = (arr_idx - 1) / 2; 
            }
        }
        current_size++;
    }

    public static void main(String[] args) {
        // MaxHeap max1 = new MaxHeap(10);
        // max1.insert(24);
        // max1.insert(4);
        // max1.insert(1);
        // max1.insert(8);
        // max1.insert(7);
        // max1.insert(9);
        // max1.insert(3);
        // max1.insert(14);
        // max1.insert(10);
        // max1.insert(16);

        

        // for (int i = 0; i < max1.heap_size; i++) {
        //     System.out.print(max1.heap[i] + " ");
        // }


        MaxHeap max2 = new MaxHeap(20);
        for (int i = 0; i < max2.heap_size; i++) {
            max2.heap[max2.heap_size - 1 - i] = (int)(Math.random() * 100) + 1;
            max2.current_size +=1;
        }
        max2.print();
        max2.build_heap();
        max2.heap_sort();
        max2.print();
    }

}