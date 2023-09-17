public class _29_OverloadedConstructors {
    public static void main(String[] args) {
        //overloaded constructors = multiple constructors within a class within the same name
        //but have different parameters
        //name + parameters = signature

        Pizza pizza = new Pizza(
                "김태현뱃살",
                "김태현오줌",
                "태현이가먹다남긴치즈",
                "태현이가먹다흘린햄"
                );
        System.out.println("Here is your ingredients of pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
