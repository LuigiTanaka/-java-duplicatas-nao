import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        arr1.add("morango");
        arr1.add("manga");
        arr1.add("pessego");
        arr1.add("uva");
        arr1.add("goiaba");
        arr1.add("uva");

        arr2.add("uva");
        arr2.add("melao");
        arr2.add("morango");
        arr2.add("banana");
        arr2.add("abacaxi");

        List<String> arr3 = new ArrayList<>();
        for(int i = 0; i < arr1.size(); i++) {
            String element = arr1.get(i);
            if(arr2.contains(element) && !arr3.contains(element)) {
                arr3.add(element);
                System.out.println(element);
            }
        }
    }
}
