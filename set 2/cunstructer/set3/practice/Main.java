class  Buss
{
	
		String col="read";
		double pri=20;

		
public void brea()
		{
	System.out.println("buss coler is: "+col);
	System.out.println("bus price is: "+pri);

}
}
class Car extends Buss
{
	public void bre(){
		System.out.println("car colour is: "+super.col);
		System.out.println("car price is: "+super.pri);
	}

}
class Main
{static Car c;
	public static void main(String [] args)
	{
Buss b=new Buss();
c=(Car)b;
c.bre();
	}
}
