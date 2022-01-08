import java.util.Scanner;

class Circle{
public static void main(String s[])
{
	
Scanner sc = new Scanner(System.in);

double r,area,circum,pi;


pi = 3.14;	
System.out.println("Enter radius of circle");
r = sc.nextDouble(); 
area = pi*r*r;
circum = 2*pi*r;

System.out.printf("Area of Circle: %.2f",area);
System.out.printf("\nCircumference of Circle: %.2f",circum); 
}
}