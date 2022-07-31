package oops;

public class EmployeeClass {
	public String name;
	public int empId;
	public String dept;
	
	public EmployeeClass()
	{
		System.out.println("Default constructor");
	}
	public EmployeeClass(String p1,int p2,String p3)
	{
		name=p1;
		empId=p2;
		dept=p3;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(empId);
		System.out.println(dept);
	}
	

}
