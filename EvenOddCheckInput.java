//Taking the input from keyboard

import java.util.Scanner;

class EvenOddCheckInput{
public static void main(String s[])
{
Scanner sc = new Scanner(System.in);
	
int num;
System.out.println("Enter a number to check EVEN or ODD");
//taking input as int variable
num = sc.nextInt();
 if(num%2==0)
 {
 System.out.println("Number is Even");
 }
 
 else
 {
 System.out.println("Number is Odd");
 }
}
}