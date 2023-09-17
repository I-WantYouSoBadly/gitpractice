import java.util.ArrayList;

public class _18_ArrayList {
    public static void main(String[] args) {
        //ArrayList = a resizable array
        //Elements can be added and removed after compilation phase
        // store reference data types

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hot-dog");

        food.set(0, "sushi"); //변환
        food.remove(2); //삭제
        food.clear(); //배열클리어

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
