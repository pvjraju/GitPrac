package practice;
interface Par1{
	int add(int a,int b);
	int sub(int c ,int d);
	
}
interface Par2{
	int sub(int c ,int d,int e);
}

class Calc implements Par1,Par2
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int c,int d)
	{
		return c-d;
	}
	public int sub(int f,int g,int h)
	{
		return 10;
	}
}
public class Multi {
	public static void main(String args[])
	{
		Calc c=new Calc();
		int a=c.add(4,3);
		int b=c.sub(7,3);
		int d=c.sub(1,2,3);
		System.out.println("addition: "+a+" Substraction: "+b+" tafda"+d);
	}

}
