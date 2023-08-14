public class _40_CopyObjects {
    public static void main(String[] args) {

        Carr car1 = new Carr("Sonata", "Hyundai", 2022);
        //Carr car2 = new Carr("Korando", "Ssangyong", 2017);
        Carr car2 = new Carr(car1);

        //car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());


    }
}

