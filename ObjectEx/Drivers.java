package ObjectEx;

public class Drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechile v=new Cars();
		if( v instanceof Bike)
		{
		Bike b=(Bike)v;
		b.drive();
		}
		if(v instanceof Cars)
		{
			Cars c=(Cars)v;
			c.drive();
		}

	}

}
