import java.util.Scanner;
public class _10_LogicalOperators {
    public static void main(String[] args) {

        //logical operators = used to connect two or more expressions
        // AND && both conditions must be true

        int temp = 25;

        if (temp>30){
            System.out.println("It is hot outside");
        }
        else if (temp >=20 && temp <=30){
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }

    }
}
