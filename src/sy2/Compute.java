package sy2;

import sy2.myclinder.Cylinder;

import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.println("请输入半径，圆心位置X，Y以及高度:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strArr = line.split(" ");
        try {
            double[] doubleArr = new double[strArr.length];
            for (int i = 0; i < 4; i++) {
                doubleArr[i] = Double.parseDouble(strArr[i]);
            }
            if (strArr.length != 4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            c.setRadius(doubleArr[0]);
            c.setCenterX(doubleArr[0]);
            c.setCenterY(doubleArr[1]);
            c.setH(doubleArr[3]);
            if(c.getH()<0 || c.getRadius()<0) {
                throw new IllegalAccessException();
            }
            c.calculateArea();
            c.calculatePerimeter();
            System.out.println("该圆柱体的中心坐标位置为(" + c.getCenterX() + "," + c.getCenterY() + "," + c.getRadius() + "),高度为" + c.getH());
            System.out.println("表面积为" + c.area() +"，体积为" + c.volume() + "底面积为" + c.getArea());
        } catch (NumberFormatException e) {
            System.out.println("请输入Double类型的数据!!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("请输入4个数据!!");
        }catch (IllegalAccessException e){
            System.out.println("高度h或半径radius不能为0或负数");
        }
    }
}
