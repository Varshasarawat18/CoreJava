package oops;

public class CarInterfaceChildHonda implements CarInterface
{

	@Override
	public void start() {
		System.out.println("Start inside Car class");
		
	}

	@Override
	public void stop() {
		System.out.println("stop inside Car class");
		
	}

}
