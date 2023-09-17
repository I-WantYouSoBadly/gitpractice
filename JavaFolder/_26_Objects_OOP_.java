public class _26_Objects_OOP_ {
    public static void main(String[] args) {
        // object = an instance of a class that may contain attributes and methods
        //example: (phone, desk, computer, coffee cup)

        _26_car myCar = new _26_car();
        _26_car myCar2 = new _26_car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);
        System.out.println();
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);
        System.out.println();
        myCar.drive();
        myCar.brake();



    }
}
