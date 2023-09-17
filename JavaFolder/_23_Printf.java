public class _23_Printf {
    public static void main(String[] args) {
        // an optional method to control, format, and display text to the console window
        // two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true; //%b
        char myChar = '@'; //%c
        String myString = "String"; //%s
        int myInt = 10; //%d
        double myDouble = 1000; //%f

        //[precision]
        // sets number of digits of precision when outputting floating point values
        System.out.printf("You have this much money%.2f\n",myDouble);

        //[width]
        //minimum number of characters to be written as output
        System.out.printf("Hello %10s\n", myString);

        //flags
        // - : left=justify
        // +: out put a plus or minus sign for a numeric value
        //0: numeric values are zero padded
        // ,: comma grouping separator if numbers > 1000

        System.out.printf("You have this much money: %,f\n",myDouble);

        System.out.printf("%dThis is a format string\n", 123);



        System.out.printf("%b", myBoolean);


    }
}
