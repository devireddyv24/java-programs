class Star 
{public static void main(String [] args)
	{
		int space=3;
		int star=-2;
		for(int i=1;i<=5;i++)
		{
			if(i<=3)
			{space--;
			star=star+2;

				for(int j=0;j<=space;j++)
				{
				System.out.print(" ");
				}
				for(int j=0;j<=star;j++)
				{if(i==3&&j==1)
					{
						System.out.print("$");
					}
					else if(i==3&&j==2)
						System.out.print("@");
					else if(i==3&&j==3)
						System.out.print("$");
					else
					System.out.print("*");
					
				}
			}
				else
			{
					space++;
					star=star-2;
					for(int j=0;j<=space;j++)
				{
						System.out.print(" ");
				}
				for(int k=0;k<=star;k++)
				{
				System.out.print("*");
				}

			}

				System.out.println();
		}
	}
}
