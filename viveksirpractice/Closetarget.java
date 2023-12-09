package viveksirpractice;

public class Closetarget {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9,11,2,33,44};
		int target=12;
		close(a,target);
	}
		public static void close(int a[],int target)
		{
		int max=0;
		int min=0;
		for (int i : a) {
			if(max<i)
				min=i;
		}for (int i : a) {
			if(target>=i) {
				if(max<i) {
					max=i;
				}
			}
			else
			{
				if(target<=i)
				{
					if(min>i) {
						min=i;
					}
				}
			}
		
		}
		System.out.println(min+" "+max);
		int c=min-target;
		int d=target-max;
		if(c>d)
			System.out.println("Close set value of target is :"+max);
		else
			System.out.println("close value of target is :"+min);
	}

}
