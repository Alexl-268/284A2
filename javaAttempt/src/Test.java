import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.print("iterations = ");
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        int iterations = sc.nextInt();
        ArrayList<Integer> output = new ArrayList<Integer>();
//        final long startTime = System.nanoTime();
        while (iterations>0){
            String userinput = sc.next();
            int first = 0;
            int second = 0;
            int third = 0;
            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();
            for (int i = 1; i < userinput.length()-1; i++){
                if (userinput.charAt(i) == '('){
                    first = i;
                }
                if (userinput.charAt(i) == ','){
                    second = i;
                }
                if (userinput.charAt(i) == ')'){
                    third = i;
                    array1.add(Integer.parseInt(userinput.substring(first + 1, second)));
                    array2.add(Integer.parseInt(userinput.substring(second+1, third)));
                }
            }
            int count = 0;

            for (int i = 0 ; i < array1.size(); i++){
                for (int j = i+1 ; j < array2.size(); j++){
                    int val1 = array1.get(i);
                    int val2 = array2.get(i);
                    if (array1.get(j)>val1){
                        if (array2.get(j)<val2){
                            count+=1;
                        }
                    }

                    if (array1.get(j)<val1){
                        if (array2.get(j)>val2){
                            count++;
                        }
                    }
                }
            }

            output.add(count);
            iterations-=1;
        }
        for (int i : output){
            System.out.println(i);
        }

//        final long duration = System.nanoTime() - startTime;
//        System.out.println(duration);
    }
}