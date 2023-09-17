import java.util.Scanner;
public class _06_SmallProject {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size x: ");
        x = scanner.nextDouble();
        System.out.println("Enter size y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+z);

        scanner.close();






    }
}
