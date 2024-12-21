class Greeting{

  public synchronized void wish(String name){
    for (int i =1;i<10 ;i++ ) {
      System.out.print("Good Morning :: ");

      try{
        Thread.sleep(2000);

      }catch(InterruptedException e){
      }
          System.out.println(name);
    }
  }
}
class MyThread extends Thread{

Greeting g1;
String name;

MyThread(Greeting g1,String name)//Constructor
{
  this.g1=g1;
  this.name=name;
}
  public void run(){
    g1.wish(name);
  }
}
class SynchroziedDemo{
  public static void main(String[] args) {
     Greeting g1 = new Greeting();
     MyThread t1 = new MyThread(g1,"Dhoni");
     MyThread t2 = new MyThread(g1,"YuvRaj");
     t1.start();
     t2.start();
  }
}
