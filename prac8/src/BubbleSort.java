import java.util.*;
/** Implements the bubble sort algorithm.
 * */
public class BubbleSort {
	/**
     * Sort the array using bubble sort algorithm.
     * @pre  table containing integers.
     * @post table is sorted.
     * @param table The array to be sorted
     */
    public static  void sort(int [] table) {
    
        int pass = 0;
        int numExchanges = 0;
        boolean exchanges = false;
        int temp;
        pass++;
        do {
            exchanges = false;
            numExchanges = 0;  
            // Compare each pair of adjacent integers.      
            for (int i = 0; i < (table.length - pass); i++) {
              
                   if (table[i] > table[i + 1]) {
                   	  ++numExchanges;
					// Exchange pair
                    temp = table[i];
                    table[i] = table[i + 1];
                    table[i + 1] = temp;
                    exchanges = true;
                }
                   
            }
            printArray(table);
            System.out.print("pass number " + pass);
            System.out.print(" num of exchanges " + numExchanges);
            System.out.println("");
            pass++;
        } while (exchanges);
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

