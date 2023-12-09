package arrays;
import java.util.*;
public class Hexatobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hexadecimal value");
		String s=sc.next();
		String ha="0123456789ABCDEF";
		System.out.println(ha.indexOf(s.charAt(1)));

	}

}
