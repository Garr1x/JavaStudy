package ThreadTest;

class MyThead extends Thread{
    private int ticket = 10;
    @Override
    public void run(){
        for(int i=0;i<10;i--){
            if(ticket>0){
                System.out.println("Remaining votes:" + --ticket);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args){
        MyThead t = new MyThead();
        t.run();
    }
}
