package javapracticeprogram;

import java.util.Arrays;

public class arraysEqualOrNot {
	public static void main(String[]args) {
		 
		int ar1[ ]= {10,20,30,40};
		int ar2[ ]= {10,20,32,40};
		int ar3[ ]= {10,20,30,40};
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar1, ar3));
		System.out.println(Arrays.equals(ar2, ar3));
		
	}

}
