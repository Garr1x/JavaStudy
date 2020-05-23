package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Garr1X_Bo
 */

public class TestFileOutputStream {
    public static void main(String[] args){
        int b;
        try{
            FileInputStream in = new FileInputStream("d:/JAVAProjects/JavaStudy/file/FileStream.txt");
            FileOutputStream out = new FileOutputStream("d:/JAVAProjects/JavaStudy/file/FileStream(copy).txt");
            while((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
            out.close();
        }catch (FileNotFoundException e){
            System.out.println("Can Not Found The File!!!");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("File Copy ERROR!!!");
            System.exit(-1);
        }
    }
}
