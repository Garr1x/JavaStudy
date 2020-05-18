package zy724;

import java.util.Scanner;
/**
 * @author Administrator
 */
public class zy724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        parseLineToIntArr(line);
    }
    public static void parseLineToIntArr(String line){
        String[] strArr = line.split(" ");
        try{
            int[] intArr = new int[strArr.length];
            for(int i=0;i<5;i++){
                intArr[i]=Integer.parseInt(strArr[i]);
            }
            if(strArr.length<5){
                throw new ArrayIndexOutOfBoundsException();
            }
        }catch (NumberFormatException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("请输入至少5个整数");
            e.printStackTrace();
        }
    }
}

