import java.io.File;
public class _45_FileClass {
    public static void main(String[] args) {
        //file = an abstract representation of file and directory path names

        File file = new File("Summer.txt");

        if(file.exists()) {
            System.out.println(("That file exists"));
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();

        }
        else{
            System.out.println("That file doesn't exist");
        }

    }
}
