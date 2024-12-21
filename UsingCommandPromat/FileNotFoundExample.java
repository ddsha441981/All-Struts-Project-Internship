import java.io.*;
class FileNotFoundExample{

  public static void main(String[] args) {
    try{
    PrintWriter p = new PrintWriter("abc.txt");
      p.print("Hello");
    }
    catch(FileNotFoundException e){
      System.out.println(e.PrintStackTrace());
    }

  }
}
