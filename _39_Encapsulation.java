public class _39_Encapsulation {
    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private,
        // can be accessed only through methods (getter, setter)
        // you should make attributes private if you dont have a reason to make them

        Kar car = new Kar("KIA", "Soul", 2009);

        car.setYear(2222);
        //car.year = 2022;

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }

}

