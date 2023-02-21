class Empdetail {
  String name;
  int age;
  String phno;

  Empdetail(int age, String name, String phno) {
    this.name = name;
    this.age = age;
    this.phno = phno;
  }
}

class Employee extends Empdetail {
  int empid;
  int empsalary;

  Employee(int id, String name, int age, int salary, String phno) {
    super(age, name, phno);
    empid = id;
    empsalary = salary;
  }

  void Employeeoveralldetails() {
    System.out.println("Employee ID     :  " + empid);
    System.out.println("Employee Name   :  " + name);
    System.out.println("Employee Age    :  " + age);
    System.out.println("Employee Salary :  " + empsalary);
    System.out.println("Employee phone number :  " + phno);
  }
}

class C20program {
  public static void main(String args[]) {
    Employee E = new Employee(143, "Ravi", 30, 25000, "9848012345");
    E.Employeeoveralldetails();
  }
}
