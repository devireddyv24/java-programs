//find the adge
import java.util.*;
class Age 
{
	int date;
	int month;
	int year;
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the date of birth");
	System.out.println("entar the date");
	int date=sc.nextInt();
	System.out.println("enter the month");
	int month=sc.nextInt();
	System.out.println("enter the year");
	int year=sc.nextInt();
	Age a=new Age(date,month,year);
	a.age();
	}
	Age(int date,int month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public void age()
	{
		Calendar ce=Calendar.getInstance();
		int pdate=ce.get(Calendar.DATE);
		int pmonth=(ce.get(Calendar.MONTH))+1;
		int pyear=ce.get(Calendar.YEAR);
		if(this.date>pdate)
		{
			pdate=pdate+30;
pmonth--;
		}
		if(this.month>pdate)
		{
			pmonth=pmonth+12;
			pyear--;
		}
System.out.println("age is :"+(pdate-this.date)+"days"+(pmonth-this.month)+"months"+(pyear-this.year)+"years");
	}

}
