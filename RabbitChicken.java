package dxc;

import java.util.Scanner;

public class RabbitChicken {

	public static void main(String[] args) {
		int heads,legs, rabbit,chicken;
		System.out.println("Enter the number of heads");
		Scanner sc=new Scanner(System.in);
		heads=sc.nextInt();
		System.out.println("Enter the number of legs");
		legs=sc.nextInt();
		chicken=((4*heads)-legs)/2;
		rabbit=((legs-(2*heads))/2);
		
		if((legs%2)!=0 || heads==0 || heads>legs)
		{
		System.out.println("The number of chickens and rabbits cannot found");
		}
		else
		{
			System.out.println("Chickens:"+chicken);
			System.out.println("Rabbits:"+rabbit);
		}
		
		

	}

}
