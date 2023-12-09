import java.util.*;
class arrays
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row  size");
		int arow=sc.nextInt();
			System.out.println("enter the colum size");
			int acol=sc.nextInt();
			System.out.println("enter the b row size");
			int brow=sc.nextInt();
				System.out.println("enter the b colum");
				int bcol=sc.nextInt();
				if(acol==brow)
		{
					int a[][]=new int[arow][acol];
					System.out.println("enter the array elements ");
					for(int i=0;i<arow;i++){
						for(int j=0;j<acol;j++)
						{
							a[i][j]=sc.nextInt();
						}
					}
					int b[][]=new int[brow][bcol];
					System.out.println("enter the array elements ");
					for(int i=0;i<brow;i++){
						for(int j=0;j<bcol;j++)
						{
							b[i][j]=sc.nextInt();
						}
					}

int res[][]=new int[arow][bcol];
for(int i=0;i<arow;i++)
		{
	for(int j=0;j<bcol;j++)
			{
		for(int k=0;k<acol;k++)
				{
			res[i][j]=res[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<arow;i++)
		{
			for(int j=0;j<bcol;j++)
			{
				System.out.printf("%2d ", res[i][j]);
			}
			System.out.println();
		}
		}



}
}