import java.io.*;
public class _47_FileReader {
    public static void main(String[] args) {
        //File reader = read the contents of a file as a stream of characters.
        //One by one read() returns an int value which contains the byte value
        //when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while(data != -1){
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
