public class _17_WrapperClasses {
    public static void main(String[] args) {

        //provides a way to use primitive data types as reference data types
        //reference data types contain useful methods
        //can be used with collections(ex.collections)

        //primitive     //wrapper
        //boolean       Boolean
        //char              character
        //int               Integer
        //double        Double

        //autoboxing = the automatic conversion that the Java Compiler makes between the primitive types and their corresponding object classes wrapper
        // unboxing = the reverse of autoboxing; automatic conversion of wrapper class to primitive
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Moe";

        if(a==true) {
            System.out.println("This is true");
        }
        if(b=='@') {
            System.out.println("This is true");
        }



    }
}
