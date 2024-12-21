class A7 implements Output,Input{
	public void Ooutput(){
		System.out.println("Hello OOutput");
	}
	public void Iinput(){
		System.out.println("Hello Iinput");
	}
	public static void main(String[] args) {
		A7 obj = new A7();
		obj.Ooutput();
		obj.Iinput();
	}
}
