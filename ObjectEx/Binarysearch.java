package ObjectEx;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		int l=0;
		int b=a.length;
		int mid=0;
		int c=8;
		while(l<b) {
			if(c==a[mid]) {
				System.out.println("element found"+mid);
				break;
			}
			if(c>a[mid]) {
				l=mid+1;
			}
			else
			{
				b=mid-1;
			}
			mid=(l+b)/2;
			
		}
		System.out.println("element not found");

	}

}
