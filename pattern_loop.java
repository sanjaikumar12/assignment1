public class pattern_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        int rows = 5;

		        for (int i = 1; i <= rows; i++) {
		            int value = 5;
		            for (int j = 1; j <= i; j++) {
		                System.out.print(value);
		                value--;
		            }
		            for (int k = i + 1; k <= rows; k++) {
		                System.out.print(rows);
		            }
		            System.out.println();
		        }
		    }
		
		

	}