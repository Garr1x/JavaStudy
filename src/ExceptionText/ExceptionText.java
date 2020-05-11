package ExceptionText;
import java.util.*;

class IllegalArgumentException extends Exception{
    String message;
    public IllegalArgumentException(int a,int b,int c){
        message = a + " " + b + " " + c + " Cannot be formed into a triangle!";
    }
    @Override
    public String toString(){
        return message;
    }
}

/**
 * @author Garr1x
 * WDNMD
 */
public class ExceptionText {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        try{
            triangle(a,b,c);
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
    static void triangle(int a,int b,int c) throws IllegalArgumentException {
        if(a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException(a,b,c);
        }
        else{
            System.out.println("a:" + a + " b:" + b + " c:" + c + " Can be formed into a triangle!");
        }
    }
}
