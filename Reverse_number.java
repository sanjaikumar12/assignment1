public class Reverse_number {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int x= 876;
		int reversed = 0;
		int y= 678;
		int reversed1 = 0;
		
		
		
		
		 while(x != 0) {
			    
		      // get last digit from num
		      int digit = x % 10;
		      reversed = reversed * 10 + digit;
		      x /= 10;
		    }
		 
		 System.out.println(reversed);
		 
		 
		 while(y != 0) {
			    
		      // get last digit from num
		      int digit = y % 10;
		      reversed1 = reversed1 * 10 + digit;
		      y /= 10;
		    }
		 
		 System.out.println(reversed1);
		 
		 

	}

}