class Tv
{
		String name;
		Double price;
Tv(String name,double price)
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
	public static void main(String[] args)
	{
		Tv t=new Tv("soney",-2000);
		t.test();
	}

}
class PriceException extends Exception
{
	public String toString()
	{
		return"enter the price curect";
	}
}
