package javapracticeprogram;

public class ArmStrongNo {
	public static void main(String[ ]args) {
		int hold=153;
		int op=hold;
		int remainder=0;
		int result = 0;
		
		while(op!=0)
		{
			remainder=op%10;
			result=result+(remainder*remainder*remainder);
			op=op/10;
			}
		if(result==hold) {
			System.out.println(hold + "  given no is armstrong number");
		}
			else
				System.out.println(hold + "  given no is not armstrong number");
			}
	}


