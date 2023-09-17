public class _09_Switch {
    public static void main(String[] args) {
        // switch = statement that allows a variable ot be tested for equality against a list of value

        String day = "Friday";
        switch(day) {
            case "Sunday": System.out.println("It is Sunday.");
            break;
            case "Monday": System.out.println("It is Monday.");
            break;
            default: System.out.println("That is not a day");

        }
    }

}
