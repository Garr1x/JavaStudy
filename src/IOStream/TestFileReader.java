package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args){
        try{
            char c[] = new char[500];
            FileReader fr = new FileReader("d:/JAVAProjects/JavaStudy/file/TFReader.txt");
            int num = fr.read(c);
            String str = new String(c,0,num);
            System.out.println(str);
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
