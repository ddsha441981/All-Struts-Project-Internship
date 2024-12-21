public class SingleArr {
	int a, b;

	SingleArr(int x, int y) {

		a = x;
		b = y;
	}

	public static void sum(SingleArr arr[]) {
		SingleArr s;
		s = arr[0];

	}

	public String toString() {
		return " " + a + " " + b;
	}

	public static void main(String args[]) {
		SingleArr[] d1 = new SingleArr[1];
		d1[0] = new SingleArr(1, 5);
		sum(d1);
		System.out.println("This No" + d1[0]);
	}
}
