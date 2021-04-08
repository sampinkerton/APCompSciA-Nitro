import java.util.ArrayList;

public class MergeSortCounter {

    private static int count;

    public static void main(String[] args) {
    int[] n = {100, 1000, 10000, 100000};
    for(int i = 0; i < n.length; i++)
    {
        count = 0;
        mergeSort(makeRandomArray(n[i]), n[i]);
        System.out.println("Total Recursive calls for " + n[i] + ": " + count);
    }
       
        
    }

    public static void mergeSort(int[] current, int length) {
        count++;
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];

        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }

        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }

        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(current, left, right);

    }

    public static void merge(int[] current, int[] left, int[] right)
    {
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

    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for (int i = 0; i < number; i++){
            sorted.add(i);
        }

        // Now shuffle it.
        int index = 0;
        while (sorted.size() > 0){
            int randomIndex = (int)(Math.random()*sorted.size());
            array[index] = sorted.remove(randomIndex);
            index ++;
        }

        return array;
    }
}
