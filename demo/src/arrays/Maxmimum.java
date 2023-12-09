package arrays;

public class Maxmimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,2,5,6,8,9};
		int in = 0,im = 0;
		int fmax=0,smax=0,tmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				fmax=a[i];
				in=i;
			
			}
			else if(smax<a[i]&&in!=i)
			{
				{
					smax=a[i];
				}
			}
			if(tmax<a[i]&&in!=i&&im!=i)
			{
				tmax=a[i];
			}
		}
		System.out.println(tmax);

	}

}
