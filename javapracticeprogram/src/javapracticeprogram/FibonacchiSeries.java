package javapracticeprogram;

public class FibonacchiSeries {
public static void main(String[]args)
{
	int a=0;
	int b=1;
	int c=0;
	
	for(int i=0;i<=20;i++) 
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
	
}
}
