package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Garr1X_Bo
 */
public class TestFileInputStream {
    public static void main(String[] args){
        int b;
        try{
            FileInputStream in = new FileInputStream("d:/JAVAProjects/JavaStudy/file/FileStream.txt");
            long num=0;
            while((b=in.read())!=-1){
                System.out.print((char)b);
                num++;
            }
            in.close();
            System.out.println("\nRead " + num + " Bytes.");
        }catch (FileNotFoundException e){
            System.out.println("Can Not Find The File!!!");
            System.exit(-1);
        }catch (IOException e){
            System.out.println("File Read Error");
            System.exit(-1);
        }
    }
}
