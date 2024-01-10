import java.util.Scanner;

public class purchase_Amout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int purchase;
		Scanner sc = new Scanner(System.in);
		
		
		for (int i =0;i<3;i++) {
			
		
		purchase = sc.nextInt();
		if(purchase <=500) 
		{
			System.out.println("no discount is applied");
		}
		if((purchase>500)&&(purchase<=1000)) {
			
			int x= purchase-(purchase/10);
			System.out.println("discount applied" + x);
		}
		
		if(purchase>1000) {
			int y= purchase-(purchase/20);
			System.out.println("discount applied" + y);
		}
		}

	}

}
