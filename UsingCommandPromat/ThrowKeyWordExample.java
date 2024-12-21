class ThrowKeyWordExample{
  public void display(){
  new throw IllegalArgumentException();
  }
}
public class Test extends ThrowKeyWordExample{
  public static void main(String[] args){
  Test t = new Test();
    try{
      t.display();
    }
    catch(IllegalArgumentException e)
    {
      e.PrintStackTrace();
    }
  }
}
