class SampleThread extends Thread{
    public void run(){
        System.out.println("Thread run using thread class");
    }
}
class SampleThread2 implements Runnable{
    public void run(){//3.running
        try{
            System.out.println("Thread run using Runnable interface");
            Thread.sleep(4000);//4.Blocked / waiting state
            System.out.println("After 4 sec");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        SampleThread t=new SampleThread();
        t.start();
        Thread t1=new Thread(new SampleThread2());//1. new thread
        //SampleThread2 s=new SampleThread2();
        //Thread t1=new Thread(s);
        t1.start();//2. runnable
    }
}
