package ObjectEx;

public class Car {
	String bname;
	double d;
	

	public Car(String bname, double d) {
		super();
		this.bname = bname;
		this.d = d;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "bname :"+this.bname+"speed"+this.d;
	}
public static void main(String[] args) {
	Car[] car=new Car[2];
	car[0]=new Car("Green",78);
	car[1]=new Car("yello",77);
	printArray(car);
}


private static void printArray(Car[] car) {
	// TODO Auto-generated method stub
	for(Car c1:car)
	{
		System.out.println(c1);
		
	}
	
}

	

}
