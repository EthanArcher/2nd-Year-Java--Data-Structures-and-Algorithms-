
import java.util.*;
/**
     * Sort the array using the quicksort algorithm.
     * @pre table contains integer.
     * @post table is sorted.
     * @param table The array to be sorted
     */
public class QuickSort {

    public static  void sort(int [] table) {
    	// Sort the whole table.
       quickSort(table, 0, table.length - 1);
    }
	/**
     * Sort a part of the table using the quicksort algorithm.
     * @post The part of table from first through last is sorted.
     * @param table The array to be sorted
     * @param first The index of the low bound
     * @param last The index of the high bound
     */
    private static void quickSort(int [] table,int first,int last) {

     	printArray(table);
       
        if (first < last) {
        		printArray(table);
        		System.out.println(" first:" + first + " last:" + last + " ");
            int pivIndex = partition(table, first, last);
            quickSort(table, first, pivIndex - 1);
            quickSort(table, pivIndex + 1, last);
        }
    }
    
    /**
     * Partition the table so that values from first to pivIndex
     * are less than or equal to the pivot value, and values from
     * pivIndex to last are greater than the pivot value.
     * @param table The array to be partitioned
     * @param first The index of the low bound
     * @param last  The index of the high bound
     * @return The location of the pivot value
     */
    private static  int partition(int [] table, int first, int last) {
        int pivot = table[first];
        int up = first;
        int down = last;
        do {
            while ((up < last) && (pivot >= table[up])) {
                ++up;
            }
            while (pivot < table[down]) {
                --down;
            }
            if (up < down) {
                swap(table, up, down);
            }
        } while (up < down);
        swap(table, first, down);
        return down;
    }
	// Exchange pair
    private static  void swap(int [] table, int i, int j) {
        int temp = table[i];
        table[i] = table[j];
        table[j] = temp;
    }
    /**
     * print the array
     * @param array. Each integer in the array is to be printed
     */
  private static  void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < (array.length + 1)) {
                System.out.print(" ");
            }
        }
    }
 
 

    public static void main(String[] args) {
 	int [] array =  {42,37,45,70,12,19, 39, 43, 61,7,99};
    sort(array);
    }
}

