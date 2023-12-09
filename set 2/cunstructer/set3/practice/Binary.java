class  Binary
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="101010";
		int p=1;int sum=0;
		int co=s.length();
		String sv;
		String sc="";
		while(co>0) {
		sum=0;
		p=1;
		int i=co-1;
		while(i>=co-5)
		{
			int k=Integer.parseInt(s.charAt(i)+"");
			if(k!=0)
			{
			p=p*k;
		
			sum=sum+p;
		}
					p=p*2;
				
		i=i--;
		}
		System.out.println(sum);
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
	sc=sv+sc;
		sv=" ";
		co=co-4;
	}
		//System.out.println(sc);
	}

	}





	

