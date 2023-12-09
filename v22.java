class v22
{
public static void main(String [] args)
{
int k=1,m=12;
for(int i=1;i<=6;i++)
{
k++;
m-=2;
for(int j=1;j<=k;j++)
{
System.out.print(" ");
}
for(int j=1;j<=1;j++)
{
System.out.print("*");
}
for(int j=1;j<=m;j++)
{
System.out.print(" ");
}
for(int j=1;j<=1;j++)
{
System.out.print("*");
}
for(int j=1;j<=k;j++)
{
System.out.print(" ");
}
for(int j=1;j<=4;j++)
{
 if(i==1||i==3||i==6)
{
System.out.print("*");
}
else if((i==2&j==4)||((i==4||i==5)&&j==1))
{
System.out.print("*");
}
else 
{
System.out.print(" ");
}
}for(int j=1;j<=2;j++)
{
System.out.print(" ");
}for(int j=1;j<=4;j++)
{
 if(i==1||i==3||i==6)
{
System.out.print("*");
}
else if((i==2&j==4)||((i==4||i==5)&&j==1))
{
System.out.print("*");
}
else 
{
System.out.print(" ");
}
}
System.out.println();
}
}
}
