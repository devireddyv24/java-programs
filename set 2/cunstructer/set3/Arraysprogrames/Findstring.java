class Findstring
{
	public static void main(String [] args)
	{
		String s="vamshi123";
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		s=s.replace('v','M');
		System.out.println(s.charAt(0));
		for(int i=0;i<s.length();i++)
		{
			char a=(char)s.charAt(i);
			//System.out.println(a);
			if(a>='0'&&a<='9')
				System.out.println(a);
			
		
	
	}

}
}

