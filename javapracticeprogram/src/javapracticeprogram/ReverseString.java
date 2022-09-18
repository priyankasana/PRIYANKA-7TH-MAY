package javapracticeprogram;

public class ReverseString {
	public static void main(String[]args) {
		
		String p="PRIYANKA";
		String reverse="";
		
		for(int i=p.length()-1;i>=0;i--)
		{
			reverse=reverse+p.charAt(i);
		}
		System.out.println(reverse);
	}

}
