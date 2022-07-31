package oops;

public class MethodOverloading {
	
	public int getArea(int a, int b)
	{
		return a*b;
	}
	public int getArea(int a)
	{
		return a*a;
	}
	public float getArea(float l)
	{
		return l+l;
	}

}
