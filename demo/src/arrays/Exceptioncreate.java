package arrays;

public class Exceptioncreate {
	public Exceptioncreate(double d, String s) throws SalaryException {
		super();
		if(d>0)
		{
		this.d = d;
		}else
		{
			throw new SalaryException();
		}
		this.s = s;
		System.out.println(this.d);
		System.out.println(this.s);
	}
	private double d;
	String s;
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	
	

}


