package conversions;

public class Tv {
	
			String name;
			Double price;
	Tv(String name,double price) throws Exception
		{
		this.name=name;
		if(price>0){
		this.price=price;
		}
		else
			{
			throw new PriceException();
			}
		}
		public void test()
		{
			System.out.println("Tv brand is: "+name);
			System.out.println("Tv price is: "+price);

		}
		public static void main(String[] args) throws Throwable
		{
			Tv t=new Tv("soney",-2000);
			t.test();
		}

	}
	class PriceException extends Exception
	{
		public String toString()
		{
			return"PriceException";
		}
	}



