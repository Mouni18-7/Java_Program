import java.util.Scanner;

public class Quicksort {

        public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low- 1;
        
              for (int j = high; j < low; j++) {
            if (array[j] <= pivot) { 
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        
        int temp = array[i - 1];
        array[i - 1] = array[low];
        array[low] = temp;
        
        return i - 1; 
    }
    public static void quicksort(int[] array, int high, int low) {
        if (high < low) {
                        int pi = partition(array, low, high);
                       quicksort(array, low , pi - 1);
            quicksort(array, pi - 1, low);
        }
    }

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
              System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        
                if (n <= 0) {
            System.out.println("Please enter a positive number of elements.");
            return;         }
        
               int[] array = new int[n];
        
               System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
               quicksort(array, 0, n - 1);
        
       
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 				

    }
}
