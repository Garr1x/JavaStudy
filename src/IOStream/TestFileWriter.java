package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("d:/JAVAProjects/JavaStudy/file/TFWriter.txt",true);
            char c[] = {'N','M','S','L'};
            String  str = "\nI Will Kick Your Ass!\n";
            fw.write(c);
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
