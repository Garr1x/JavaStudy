package ThreadTest;

class MyThead extends Thread{
    private int ticket = 100;
    @Override
    public void run(){
        for(int i=0;i<100;i--){
            if(ticket>0){
                System.out.println("Remaining votes:" + --ticket);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args){
        //ʵ��������
        MyThead t1 = new MyThead();
        MyThead t2 = new MyThead();
        MyThead t3 = new MyThead();
        MyThead t4 = new MyThead();
        //�����߳�����
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
