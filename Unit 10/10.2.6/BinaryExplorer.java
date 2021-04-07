public class BinaryExplorer {

    public static void main(String[] args) {
        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        binaryRec(testArray, 8, 0, testArray.length - 1);
    }

    /**
     * Add Print statements to the binaryRec method:
     * 
     * Print Starting, ending, and midpoint values.
     * 
     * Print when you find a match
     * 
     * Print if you are too high or too low.
     * 
     **/
    public static int binaryRec(int[] array, int target, int begin, int end) {
        if (begin <= end)
        {
            
            int mid = (begin + end) / 2;
            System.out.println("Starting value: " + array[begin]);
            System.out.println("Ending value: " + array[end]);
            System.out.println("Testing midpoint value: " + array[mid]);
            
            // Base Case
            if (target == array[mid]) {
                System.out.println("Match!\n");
                return mid;
            }
    
            if (target < array[mid]) {
                System.out.println("Too high!\n");
                return binaryRec(array, target, begin, mid - 1);
            }
    
            if (target > array[mid]) {
                System.out.println("Too low!\n");
                return binaryRec(array, target, mid + 1, end);
            }
        }
        return -1; //Alternate Base Case - not found
    }
}
