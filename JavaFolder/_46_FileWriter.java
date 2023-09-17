import java.io.FileWriter;
import java.io.IOException;
public class _46_FileWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\nViolets are blue\nnegawatt\nnegawatt");
            writer.append("\nAn Abstract thing");
            writer.close();
        } catch (IOException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
