//selection sorting first fimd min value index value and swap it.
class Selectionsort
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,8,3,9};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{min=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					min=j;
				}
				}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			
		}
		for (int i : a) {
			System.out.println(i);
			
		}

	}

}
