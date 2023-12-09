package viveksirpractice;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=94;
		int count=0;
		for(int i=0;i<a/2;i++) {
			if(a%i==0) {
				count++;
			}
			if(count==0)
			{
				System.out.println("is prime number");
			}
		}

	}

}
