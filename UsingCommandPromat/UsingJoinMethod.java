class MyThread extends Thread{

    public void run(){


        for (int i=0;i<10;i++ ) {

          System.out.println("Child Thread");
            }
    try{
          Thread.sleep(3000);
        }

    catch(InterruptedException e){
      System.out.println("I got InterruptedException");
    }

    }
}

public class UsingJoinMethod{
  public static void main(String[] args) throws InterruptedException{

    MyThread t = new MyThread();
    t.start();
    t.join();
    for (int i=0;i<10 ;i++ ) {
        System.out.println("Main Thread");
    }

  }
}
