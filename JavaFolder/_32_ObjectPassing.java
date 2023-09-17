public class _32_ObjectPassing {
    public static void main(String[] args) {

        garage garage = new garage();
        car2 car = new car2("Sonata");
        car2 car2 = new car2("Corvette");

        garage.park(car);
        garage.park(car2);

    }
}

