import java.util.ArrayList;

public class _20_ForEachLoop {
    public static void main(String[] args) {
        // for - each = traversing technique to iterate through the elements in array/collection
        //less steps, more readable
        //less flexible
        //String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("bird");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
