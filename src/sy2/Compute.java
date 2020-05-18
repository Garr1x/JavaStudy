package sy2;

import sy2.myclinder.Cylinder;

import java.util.Scanner;

/**
 * @author Garr1X_Bo
 */
public class Compute {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.println("������뾶��Բ��λ��X��Y�Լ��߶�:");
        Scanner sc = new Scanner(System.in);
        //��ȡһ���ڵ�����
        String line = sc.nextLine();
        //�Կո�Ϊ��ָ���������ַ�
        String[] strArr = line.split(" ");
        try {
            //���ַ�ת��Ϊdouble���ʹ��������
            double[] doubleArr = new double[strArr.length];
            for (int i = 0; i < 4; i++) {
                doubleArr[i] = Double.parseDouble(strArr[i]);
            }
            //���������ݲ�����4��ʱ �׳��쳣
            if (strArr.length != 4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            //�����ݸ�ֵ
            c.setRadius(doubleArr[0]);
            c.setCenterX(doubleArr[0]);
            c.setCenterY(doubleArr[1]);
            c.setH(doubleArr[3]);
            //���߶�h��뾶radiusС�ڻ������ʱ�׳��쳣
            if(c.getH()<=0 || c.getRadius()<=0) {
                throw new IllegalAccessException();
            }
            //c.calculateArea();
            //c.calculatePerimeter();
            System.out.println("��Բ�������������λ��Ϊ(" + c.getCenterX() + "," + c.getCenterY() + "," + c.getRadius() + "),�߶�Ϊ" + c.getH());
            //System.out.println("�����Ϊ" + c.area() +"�����Ϊ" + c.volume() + "�����Ϊ" + c.getArea());
            System.out.println("�����Ϊ" + c.area() +"�����Ϊ" + c.volume() + "�����Ϊ" + c.getRadius()*c.getRadius()*Math.PI);
        } catch (NumberFormatException e) {
            System.out.println("������Double���͵�����!!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("������4������!!");
        }catch (IllegalAccessException e){
            System.out.println("�߶�h��뾶radius����Ϊ0����");
        }
    }
}
