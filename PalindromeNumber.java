package dxc;

import java.util.Scanner;

public class PalindromeNumber {

	static void palindrome(int num)
	{
		int rem=0;
		int temp=num;
		while(num>0)
				{
					rem=(rem*10)+(num%10);
					num=num/10;
				}
				if(rem==temp)
				{
					System.out.println("The given number "+temp+" is palindrome");
				}
				else
					System.out.println("The given number "+temp+" is not palindrome");
	}
	public static void main(String[] args) {
		int num;
		System.out.println("Enter any nummber that you want to check ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		palindrome(num);

	}

}
