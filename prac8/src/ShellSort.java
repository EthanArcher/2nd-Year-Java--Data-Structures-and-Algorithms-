
import java.util.*;
/**
 * Implements the Shell sort algorithm.
 **/
public class ShellSort {

    /**
     * Sort the array using Shell sort algorithm.
     * @pre  table contains integers.
     * @post table is sorted.
     * @param table The array to be sorted
     */
   
    public static  void sort(int [] table) {
    	   // Gap between adjacent integers.
        int gap = table.length / 3;
        int pass = 0;
        int numExchanges = 0;
        int nextVal;
        boolean exchanges = false;
        while (gap > 0) {
            pass = 1;
            for (int nextPos = gap; nextPos < table.length; nextPos++) {
     
                numExchanges = 0;
                nextVal = table[nextPos];// Element to insert.
       			 // Shift all values > nextVal in subarray down by gap.
                int j = nextPos;
                while (j > gap - 1 && nextVal < table[j - gap])  {
                    ++numExchanges;
                    table[j] = table[j - gap];
                    j -= gap;
                }
                table[j] = nextVal;
                pass++;
            }
            System.out.print("gap:" + gap + " ");
            printArray(table);
            System.out.println("");
            
            //reset the gap for next pass
            if (gap == 2) {
                gap = 1;
            } else {
                gap = (int) (gap / 3);
            }

        }
        
    }

    private static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length + 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        int [] array =  {42,37,45,70,12,19, 39, 43, 61,7,99};
    	sort(array);
    }
}


