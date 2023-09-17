import java.util.Scanner;

public class _43_DynamicPolymorphism {
    public static void main(String[] args) {
        // polymorphism = many shapes/forms
        // dynamic = after compilation (during runtime)

        Scanner scanner = new Scanner(System.in);
        Aniimal animal;

        System.out.println("what animal do you want");
        System.out.println("(1=dog, 2=cat: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new dawg();
            animal.speak();
        } else if (choice == 2) {
            animal = new kat();
            animal.speak();

        }
        else{
            animal = new Aniimal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}
