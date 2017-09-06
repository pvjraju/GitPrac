package practice;

class Inter
{
	int a;
   Inter(int a)
	{
	   this.a=a;
		System.out.println("This is display");
	}
 //abstract void read();
}
class Inter1 extends Inter
{
	void read()
	{
		System.out.println("Read is implemented");
	}
     Inter1(int a,int b)
	{   
    	 super(a);
		System.out.println("gsfiusiushgfiaug");
	}
}
public class Innter1 {
	public static void main(String args[])
	{
		Inter1 i1=new Inter1(3,4);
		
		
	}

}
