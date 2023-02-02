package dxc;
import java.util.Scanner;

public class FoodCorner {

	public static void main(String[] args) {
		int distance=0,deliverycharge=0,platecost=0,quantity=1;
		long totalcost;
		char foodtype;
		System.out.println("Food Type:V/N");
		Scanner sc=new Scanner(System.in);
		foodtype=sc.next().charAt(0);
		
		if(foodtype=='V')
		{
		
			System.out.println("Quantity Ordered");
			quantity=sc.nextInt();
			platecost=quantity*12;
			System.out.println("Distance in kms");
			distance=sc.nextInt();
		    if(distance>0 && distance<=3)
		    {
		    	deliverycharge=distance*0;
		    }
		    else if(distance>3 && distance<=6)
		    {
		    	deliverycharge=(distance-3)*1;
		    	
		    }
		    else
		    {
		    	deliverycharge=(((distance-6)*2)+3);
		    }
		    totalcost=platecost+deliverycharge;
		    System.out.println("FoodType \t Quantity Ordered \t Distance(kms) \t Total amount");
		    System.out.println(foodtype+"\t\t\t"+quantity+"\t\t\t"+distance+"\t\t"+totalcost);
			}
			else if(foodtype=='N')
			{
			System.out.println("Quantity Ordered");
			quantity=sc.nextInt();
			platecost=quantity*15;
			System.out.println("Distance in kms");
			distance=sc.nextInt();
		    if(distance>0 && distance<=3)
		    {
		    	deliverycharge=distance*0;
		    }
		    else if(distance>3 && distance<=6)
		    {
		    	deliverycharge=(distance-3)*1;
		    	
		    }
		    else
		    {
		    	deliverycharge=(((distance-6)*2)+3);
		    }
		    totalcost=platecost+deliverycharge;
		    System.out.println("FoodType \t Quantity Ordered \t Distance(kms) \t Total amount");
		    System.out.println(foodtype+"\t\t\t"+quantity+"\t\t\t"+distance+"\t\t"+totalcost);
			}
			else 
				System.out.println(" Totalcost=-1");
		
	   
	}

	private static char ignoreCase(char c) {
		// TODO Auto-generated method stub
		return 0;
	}

}
