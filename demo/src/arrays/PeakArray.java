package arrays;

public class PeakArray {

	public static void main(String[] args) {	
		int a[]= {2,5,1,8,9,5,35,41,75,85,4,9};
		int n=a.length;
		int max=1,len=1,maxIndex=0;
		
		for(int i=1;i<n;i++) {
			if(a[i]>a[i-1])
				len++;
			else {
				if(max<len) {
					max=len;
					maxIndex=i-max;
				}
				len=1;
			}
		}
		if(max<len) {
			max=len;
			maxIndex=n-max;
		}
		for(int i=maxIndex;i<max+maxIndex;i++)
			System.out.println(a[i]+" ");
		System.out.println();
		System.out.println(max);

	}
}
