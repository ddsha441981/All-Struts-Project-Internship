public class EmployeeTestApp{

  public static void main(String[] args) {
    Employee emp = new Employee();
    Department dep = new Department();
    //Jobs job = new Jobs();
    Location loc =  new Location();
    emp.empDetails();
    dep.depDetails();
  //  job.jobsDetails();
    loc.locationdetails();
  }
}
