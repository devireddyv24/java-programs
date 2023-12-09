package ObjectEx;

public class euals {
	String bname;
	double d;
	double p;
	euals(String bname,double d,double p)
	{
		this.bname=bname;
		this.d=d;
		this.p=p;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.bname==((euals)obj).bname&&this.d==((euals)obj).d;
	}
	

}
