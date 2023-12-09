/*automarphic number is anumber contains last degits of its square
*/
class Automorphic
{
	public static void main(String [] args)
	{
		int n=25,square;
		square=n*n;
		int k=0;
		while(n!=0)
		{
			if(n%10==square%10)
			{
				k=1;
			}
			else{
				k=0;
			}
			n=n/10;
			square/=10;
		}
		if(k==1)
		{
			System.out.println("automorphic");
		}
		else{
			System.out.println("not automorphic");
		}
	}

}