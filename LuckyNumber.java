package dxc;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		int count=1,num,rem=0,sum,lucky=0,no;
		
		System.out.println("Enter the number to check");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		no=num;
		while(num>0) //reversing a given number
		{
			
			rem=(rem*10)+(num%10);
			num=num/10;
		}
		while(rem>0)
		{
			if((count%2)==0)
			{
				sum=rem%10;
				lucky=sum*sum;
			}
			rem=rem/10;
			count++;
			
		}
		if((lucky%9)==0)
		{
			System.out.println("The given number "+no+" is a lucky number");
		}
		else
		{
			System.out.println("The given number "+no+" is not a lucky number");
		}
		
	}

}
