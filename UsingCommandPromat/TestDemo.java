public class TestDemo{

int id;
String name;
static String collegeName = "VIT College Pune Maharastra";

public TestDemo(int id,String name,String collegeName){
  System.out.println("Parameters Constructors");
  this.id=id;
  this.name=name;
  this.collegeName=collegeName;
}

public static void dispaly(){

  System.out.println("Display Method Call");
}

public static void main(String[] args) {
  TestDemo emp1 = new TestDemo(1,"Deendayal",collegeName);
  emp1.dispaly();
}
}
