package javaadavance;

public class Maximam3rd {

	public static void main(String[] args) {
	int a[]= {23,7,8,9,10};
	int m1=0,m2=0,m3=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>m1) {
			m3=m2;
			m2=m1;
			m1=a[i];
		}
		else if(a[i]>m2&&a[i]<m1) {
			m3=m2;
			m2=a[i];		}
		else if(a[i]>m3&&a[i]<m2) {
			m3=a[i];
		}
	}
	System.out.println("["+m1+" "+m2+" "+m3+" ]");
			}
		
	}
	



