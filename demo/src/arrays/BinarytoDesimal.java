package arrays;

public class BinarytoDesimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1010";
		int p=1;int sum=0;
		String sv;
			for(int i=s.length()-1;i>=0;i--)
			{
				int k=Integer.parseInt(s.charAt(i)+"");
				if(k!=0)
				{
					p=p*k;
					sum=sum+p;
							
				}
				p=p*2;
				
			}
			sv=Integer.toString(sum);
			if(sum==10)
				sv="A";
			else if(sum==11)
			sv="B";
			else if(sum==12)
				sv="C";
			else if(sum==13)
				sv="D";
			else if(sum==14)
				sv="E";
			else if(sum==15)
				sv="F";
			System.out.println(sv);
		}
			//System.out.println(sc);
		}