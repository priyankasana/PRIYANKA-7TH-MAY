package javapracticeprogram;

public class SecondLargestNo {
	public static void main(String[ ]args) {
		int a[ ] = {10,20,40,30,77,89,500,-90,100,544};
		int t;
		for(int i=0;i<a.length;i++) {
			
			for(int j =i+1;j<a.length;j++){
			if(a[i]<a[j])
			{
				t=a[i];
			     a[i]=a[j];
			     a[j]=t;
			}
			
			}
		}
		 
		System.out.println( "  this is second largest no"+a[1]);	
		}
		
	}


