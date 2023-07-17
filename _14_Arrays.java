public class _14_Arrays {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        cars[0] = "Mustang";
        for (int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
