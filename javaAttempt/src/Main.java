import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static int mergeAndCount(int[] arr, int l,int m, int r)  {
        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }
    private static int mergeSortAndCount(int[] arr, int l,int r) {
        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Total inversion count = left subarray count
            // + right subarray count + merge count

            // Left subarray count
            count += mergeSortAndCount(arr, l, m);

            // Right subarray count
            count += mergeSortAndCount(arr, m + 1, r);

            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] arr = { 1, 20, 6, 4, 5 };
//        System.out.println(mergeSortAndCount(arr, 0, arr.length - 1));

        System.out.print("iterations = ");
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        int iterations = sc.nextInt();
        System.out.print("input = ");
        ArrayList<Integer> output = new ArrayList<Integer>();

        while (iterations>0){
            String userinput = sc.next();
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int first = 0;
            int second = 0;
            int third = 0;
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 1; i < userinput.length()-1; i++){
                if (userinput.charAt(i) == '('){
                    first = i;
                }
                if (userinput.charAt(i) == ','){
                    second = i;
                }
                if (userinput.charAt(i) == ')'){
                    third = i;
                    int firstVal = Integer.parseInt(userinput.substring(first + 1, second));
                    array.add(firstVal);
                    map.put(firstVal, Integer.parseInt(userinput.substring(second+1, third)));
                }
            }
            System.out.println(array);
            System.out.println(map.keySet());
            System.out.println(map.values());
//        100 [(20,74),(95,95),(15,92),(92,38)]
            iterations-=1;
        }
    }
}
