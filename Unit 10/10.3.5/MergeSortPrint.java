public class MergeSortPrint {

    public static void main(String[] args) {
        int[] myArray = {20, 9, 13, 34, 11, 22, 13, 10};
        System.out.print("Unsorted: ");
        
        // Print unsorted array
        for(int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
        mergeSort(myArray, myArray.length);
        System.out.println();
        System.out.print("Sorted: ");
        
        // Print Sorted Array
       for(int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
    }

    public static void mergeSort(int[] current, int length) {
        if (length < 2) {
            return;
        }
        
        System.out.println("Splitting ...");
        
        int mid = length / 2;
        int[] left = new int[mid];

        int[] right = new int[length - mid];
        
        
        System.out.print("*** Left: ");
        
        // Create and print left array
        
        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
            System.out.print(left[i] + " ");
        }
        System.out.println();
        System.out.print("*** Right: ");
        
        // Create and print right array
        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
            System.out.print(right[i-mid] + " ");

        }
        System.out.println();
        System.out.println();
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(current, left, right);
        
        System.out.print("*** Current: ");
        
        // Print current array
        for(int i = 0; i < current.length; i++)
            System.out.print(current[i] + " ");
        System.out.println();
    }

    public static void merge(int[] current, int[] left, int[] right)
    {
        System.out.println("Merging ... ");
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                current[k++] = left[i++];
            }
            else {
                current[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            current[k++] = left[i++];
        }
        while (j < rightSize) {
            current[k++] = right[j++];
        }
    }
}
