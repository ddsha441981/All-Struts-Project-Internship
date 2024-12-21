public class EmployeeCal {

	int emp_id;
	char emp_name;
	double basic_salary = 5000;
	double hra = 50;
	double medical;
	double pf = 12;
	double pt = 200;
	double net_salary;
	double gross_salary;
	double res;

	public void hraEmpcal() {

		res = basic_salary * hra / 100;
	}

	public void pfEmpcal() {

		res = basic_salary * pf / 100;
	}

	public void ptEmpcal() {

		res = pt + basic_salary;
	}

	public void disBscal() {

		System.out.println("Basic Salary and Hra are :" + res);
	}

	public void disPfcal() {

		System.out.println("Basic Salary and Pf are :" + res);
	}

	public void disPtcal() {

		System.out.println("Basic Salary and PT are :" + res);
	}

	public static void main(String arg[]) {

		EmployeeCal emp1 = new EmployeeCal();
		emp1.hraEmpcal();
		emp1.disBscal();
		emp1.pfEmpcal();
		emp1.disPfcal();
		emp1.ptEmpcal();
		emp1.disPtcal();
	}
}
