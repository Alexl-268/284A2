import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        String[] words = {"Car", "Cat" ,"Hello", "World", "Hi", "Bye", "Dog", "Be"};

        Map<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

        for (String word: words) {
            Integer len = word.length();
            List<String> l = map.get(len);
            if (l == null) {
                l = new ArrayList<String>();
                l.add(word);
                map.put(len, (ArrayList<String>) l);
            }
            else {
                if (! l.contains(word))
                    l.add(word);
            }
        }

        System.out.println(map);
    }
}