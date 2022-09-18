package javapracticeprogram;

import java.util.ArrayList;
import java.util.TreeSet;

public class largestNoTreeSet {
	
	public static void main(String[ ]args) {
		
	     int a[ ]= {10,30,50,70,100,80};
	
	        TreeSet treeset=new TreeSet();
	
	for(int ae:a)
		treeset.add(ae);
	
	        ArrayList arraylist=new ArrayList(treeset);
	        
	System.out.println("2nd Largest number"+arraylist.get(arraylist.size()-2));
		
	

}
}