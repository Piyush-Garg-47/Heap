import java.util.*;

public class Insert {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();
        
        public void add(int data) {
            // Add at last index 
            arr.add(data);
            int x = arr.size() - 1; // child index 
            int par = (x - 1) / 2; // parent index 
            
            // Bubble up the added element to maintain heap property
            while (x > 0 && arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                
                // update x and par to continue
                x = par;
                par = (x - 1) / 2;
            }
        }
        
        public void printHeap() {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(10);
        heap.add(5);
        heap.add(3);
        heap.add(2);
        heap.add(4);
        
        heap.printHeap(); // Should print the elements in heap order
    }
}
