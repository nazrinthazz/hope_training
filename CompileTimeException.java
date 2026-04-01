public class CompileTimeException {
    public static void main(String[] args){
        Thread t=new Thread(()->{
            try{
                System.out.println("Thread sleep");
                Thread.sleep(6000);
                System.out.println("Thread wake");

            }catch(InterruptedException e){
                System.out.println("Sleep interrupted");
            }
        });
        t.start();
        try{
            Thread.sleep(2000);

        }catch(Exception e){
            System.out.println("Not T");
        }
        t.interrupt();

    }

}
