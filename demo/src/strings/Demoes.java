package strings;

public class Demoes {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int min=-1;int  max=0;
		for(int i=1;i<=a.length;i++)
		{
			if(i%2!=0) {
				if(max<a[i-1]) {
					int k=max;
					max=a[i-1];
					a[i-1]=k;
				}
				
			}
			else
			{
				if(min>a[i-1])
				{
					int k=min;
					min=a[i-1];
					a[i-1]=k;
				}
			}
		}
mai();
	}
	public static void mai() {
		System.out.println("vamshi");
	}

}
