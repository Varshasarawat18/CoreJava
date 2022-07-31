package oops;

public class RunnerClass {

	public static void main(String[] args)
	{
			EmployeeClass E1 = new EmployeeClass();
			E1.name="varsha";
			E1.empId =10122;
			E1.dept="HR";
			E1.display();

			EmployeeClass E2 = new EmployeeClass();
			E2.name="Praveen";
			E2.empId =11222;
			E2.dept="Accountant";
			E2.display();		
			
			EmployeeClass E3 = new EmployeeClass("Anshu",102345,"Doctor"); //dont need to write we can use constructor and reduce code,can be pass in single line by constructor parametirize
			E3.display();
			
			Bank B= new Bank();
			B.DisplayBalance();
			int bal=B.GetBalance();
			System.out.println("the balance is:" + B.GetBalance());
			System.out.println("The Balance is :" + bal);
			
			BankOfAmerica B2= new BankOfAmerica();
			System.out.println("Bank of america class");
			B2.CCBalance();
			B2.DisplayBalance();
			B2.AccountNUm=100;
			
			MethodOverloading M1= new MethodOverloading();
			System.out.println("Overloading class");
			int recArea= M1.getArea(3,4);
			int sqArea=M1.getArea(5);
			float sqAreaFloat= M1.getArea(22);
			System.out.println(recArea);
			System.out.println(sqArea);
			System.out.println(sqAreaFloat);
			
			//overridding using same methoda name and same parameter
			System.out.println("Overeridding classes");
			B.closeAccount(123);
			B2.closeAccount(133445);
			
			//Abstraction
			System.out.println("Abstraction classes");
			BroswerChromeChild ch= new BroswerChromeChild();
			ch.closeBrowser();
			ch.show();
			//BrowserAbstraction br = new BrowserAbstraction // not possibe as abstract class
			BrowserAbstraction br = new BroswerChromeChild();
			br.closeBrowser();
			br.openBroswer();	
			
			//interface  its 100%abstraction cant create body but in abstract both method allowed
			System.out.println("Intrface classes");
			CarInterfaceChildHonda C1=new CarInterfaceChildHonda();
			CarInterface C2 = new CarInterfaceChildHonda();  //intialiazing using child object as no object for interface
			C2.start();
			C2.stop();
		
			//encapsulation 
			System.out.println("Encapsulatoons");
			Encapsulation e1= new Encapsulation();
			e1.setBalance(3000);
			System.out.println(e1.getBalance());
	}
}
