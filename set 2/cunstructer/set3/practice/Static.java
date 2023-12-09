class  Static
{
	
		
		public int x;
		public int y;
		public void test(int a,int b)
		{
			this.x=a;
			this.y=b;
		}

	
	public static void main(String [] args)
	{
Static v=new Static();

v.test(10,20);
System.out.println(v.x+" "+v.y);
Static v1=new Static();
System.out.println(v1.x);
System.out.println(v1.y);
	}

}
