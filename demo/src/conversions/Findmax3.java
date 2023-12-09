package conversions;

public class Findmax3 {

	public static void main() {
		// TODO Auto-generated method stub
		int max1=0,max2=0,max3=0,i1 = 0,i2=0;
		int a[]= {40,4,4,5,43};
		int j=0;
		while(j<=3) {
		for(int i=0;i<a.length;i++) {
			if(max1<a[i]) {
				max1=a[i];
				i1=i;
			}
				else if(i1!=i&&max2<a[i]) {
					max2=a[i];
					i2=i;
				}
				else if(i1!=i&&i2!=i&&max3<a[i]) {
					max3=a[i];
				}
		}
			j++;

					
				}
		System.out.println(max1+" "+max2+" "+max3);
	}
	public static void main(String[] args) {
		main();
	}
			}
		

	


