class MyThread extends Thread{

public void run(){
try{
for (int i=0;i<500000;i++ ) {


  System.out.println("Child Thread");


  Thread.sleep(1000);
  }
}
  catch(InterruptedException e){
  System.out.println("I got InterruptException");
  }


}
}

class ThreadDemo {

public static void main(String[] args) {

    MyThread t = new MyThread();
    t.start();
    System.out.println("Main Thread");
  }
}
