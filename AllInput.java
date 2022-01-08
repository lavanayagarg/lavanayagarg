import java.util.Scanner;

class AllInput{
public static void main(String s[])
{
Scanner sc = new Scanner(System.in);
int x;
float y;
double z;
String name;
char ch;
System.out.println("Enter name ");
//name = sc.next();
name = sc.nextLine();//--> used for with different type of variable are used with String;
System.out.println("Enter int ");
x = sc.nextInt();
System.out.println("Enter float ");
y = sc.nextFloat();
System.out.println("Enter double ");
z = sc.nextDouble();

System.out.println("Enter char ");
ch = sc.next().charAt(0);

System.out.println("name : "+name+" x = "+x+" y = "+y+" z = "+z+" ch = "+ch);
}
}