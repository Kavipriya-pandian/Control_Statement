package dxc;
import java.util.*;
public class ArmstrongNumnber {

	static void armstrong(int num)
	{
		int temp,rem,arm=0,count=0,temp1;
		temp1=num;
		temp=num;
		while(temp1>0) //to calculate the number of digits in a number
		{
			temp1=temp1/10;
			count++;
		}
		while(num>0) //to calculate armstrong number
		{
			rem=num%10;
			arm=(int) (arm+(Math.pow(rem,count)));
			num=num/10;
		}
		if(temp==arm)
		{
		System.out.println("The given number "+temp+" is Armstrong Number");
		}
		else
			System.out.println("The given number "+temp+" is not Armstrong Number");
	}

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		armstrong(num);
}
}

