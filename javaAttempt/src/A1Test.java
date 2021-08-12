import java.util.Arrays;

public class A1Test {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 6,5,4,3,2,1,0 };
        int count = 0;
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

//        int i = 1;
//        while (i < intArray.length){
//            if (intArray[i-1]>intArray[i]){
//                int store = intArray[i];
//                intArray[i] = intArray[i-1];
//                intArray[i-1] = store;
//                if (i != 1){
//                    i--;
//                }
//                movement ++;
//            }else{
//                i++;
//            }
//            count++;
//        }


        for (int j : intArray){
            System.out.println(j);
        }
        System.out.println(count);
        System.out.println(movement);
    }
}
