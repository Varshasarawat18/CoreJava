package oops;

public class BroswerChromeChild extends BrowserAbstraction {

	@Override
	public void openBroswer() {
		System.out.println("Open broswer inside chrome class");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close broswer inside chrome class");
		
	}
	
	public 	void show()
	{
		System.out.println("Show method ");
	}

}
