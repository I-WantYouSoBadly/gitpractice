public class _42_Polymorphism {
    public static void main(String[] args) {
        //polymorphism = the ability of an object to identify as more than one type

        car1r car = new car1r();
        Bicyclle bicycle = new Bicyclle();
        Boat boat = new Boat ();

        Veh1cle[] racers= {car,bicycle,boat};

        //car.go();
        //bicycle.go();
        //boat.go();

        for (Veh1cle x : racers){
            x.go();
        }
    }
}

