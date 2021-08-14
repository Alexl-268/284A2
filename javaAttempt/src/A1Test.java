import java.util.Arrays;

public class A1Test {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 7,6,5,4,3,2,1 };
        int compare = 0;
        int movement = 0;

//        int i = 0;
//        while (i< intArray.length-1){
//            if  (intArray[i] > intArray[i+1]){
//                int store = intArray[i];
//                intArray[i] = intArray[i+1];
//                intArray[i+1] = store;
//                i = 0;
//                movement +=1;
//            }else{
//                i+=1;
//            }
//            count++;
//        }

        int i = 1;
        System.out.println(Arrays.toString(intArray));
        while (i < intArray.length){
//            System.out.println("comparing " + intArray[i-1] + " and " + intArray[i] + " at - " + i);
            if (intArray[i-1]>intArray[i]){
                int store = intArray[i];
                intArray[i] = intArray[i-1];
                intArray[i-1] = store;
                if (i != 1){
                    i--;
                }
                movement ++;
                System.out.println(Arrays.toString(intArray));
            }else{
                i++;
            }
            compare++;
        }

        System.out.print("Swap : ");
        System.out.println(movement);
        System.out.print("Compare : ");
        System.out.println(compare);
    }
}
