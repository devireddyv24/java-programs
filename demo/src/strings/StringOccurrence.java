package strings;

public class StringOccurrence {

	public static void main(String[] args) {
		String s="TimisplayinginthehouseofTimwiththeTim";
		String s1="Tim";
		char ch=s1.charAt(0);
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				if(s1.equals(s.substring(i, i+3))) {
					c++;
				}
			}
		}
		System.out.println(c);

	}
}
