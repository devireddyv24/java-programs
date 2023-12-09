package arrays;

public class classsefdf {
	public static void main(String[] args) {
		int el=100;
		int rev=0;
		while(el>0) {
			int rem=el%10;
			rev=rev*10+rem;
			el=el/10;
			
		}
		System.out.println(rev);
	}

}
