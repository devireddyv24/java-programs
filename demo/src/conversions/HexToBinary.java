package conversions;

public class HexToBinary {

	public static void main(String[] args) {
		String s="100";
		String v="0123456789ABCDEF";
		int p=1;
		int sum=0;
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			int k=v.indexOf(ch);
			sum=sum+(p*k);
			p=p*16;
		}
		System.out.println(sum);
		String bin="";
		while(sum>0) {
			int r=sum%2;
			bin=r+bin;
			sum=sum/2;
		}
		System.out.println(bin);

	}

}
