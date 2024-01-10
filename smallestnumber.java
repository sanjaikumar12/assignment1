import java.util.Scanner;

public class smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a ,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		a= sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if((a<b)&& (a<c)){
			System.out.println("Smallest Number is "+a);
			
		}
		
		if(b<c) {
			System.out.println("Smallest Number is"+b);
		}
		else
		{
			System.out.println("Smallest  Number is "+c);
		}

	}

}