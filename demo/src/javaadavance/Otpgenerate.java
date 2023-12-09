package javaadavance;

public class Otpgenerate {
	public static void main(String[] args) {
		
	int max=0;
	int index=-1;
	int arr[]= {6,3,2,0,10};
	int b[]=new int[arr.length+3];
int j=0;
	for(int i=0;i<b.length;i++) {
		if(i>arr.length-1) {
			b[i]=arr[j];
		j++;
	}
		else
		{
			b[i]=arr[i];
		}
	}
	//for(int i=0;i<b.length;i++)
	//{
		//System.out.println(b[i]);
	//}
	for(int i=0;i<arr.length;i++)
	{
		int a=b[i]*b[i+1]*b[i+2];
		if(max<a) {
			max=a;
			index=i;
		}
	}
	System.out.println(index+"max product is"+max);
	
	
	

}
}
