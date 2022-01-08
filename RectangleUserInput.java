import java.util.Scanner;
class Rectangle {
	public static void main(String s[]) { 
		
		Scanner sc = new Scanner(System.in);

		int l, w, perim, area;
		System.out.println("Give a length");
		l = sc.nextInt();
		System.out.println("Give a width");
		w = sc.nextInt();
		perim = 2*(l+w);
		area = l*w;
		
		System.out.println("Area of Rectangle: " + area);
		System.out.println("Perimeter of Rectangle: " + perim);
	}
}
