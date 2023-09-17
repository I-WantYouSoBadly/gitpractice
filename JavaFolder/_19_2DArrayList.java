import java.util.ArrayList;
public class _19_2DArrayList {
    public static void main(String[] args) {
        //a dynamic list of lists
        //you can change the size of these lists during runtime
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("salt bread");
        bakeryList.add("churros");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("potato");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");
        drinksList.add("something");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(2).get(2));
    }
}
