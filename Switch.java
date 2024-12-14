package HW_Day4;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter From Option:");
		System.out.println("1.Area of circle, 2.Area of Triangle, 3.Circumference, 4.perimeter of triangle ");
		int ch = sc.nextInt();
		double r,area,peri,base,height,side1,side2,cir;
		double pi = 3.14;
		
		switch(ch) {
			case 1:
				System.out.println("Enter the radius: ");
				r = sc.nextFloat();
				area = pi*r*r;
				System.out.println("Area is "+area);
				break;
			case 2:
				System.out.println("Enter the base: ");
				base = sc.nextFloat();
				System.out.println("Enter the height: ");
				height = sc.nextFloat();
				area = 1/2*base*height;
				System.out.println("Area is "+area);
				break;
			case 3:
				System.out.println("Enter the radius: ");
				r = sc.nextFloat();
				cir = 2*pi*r;
				System.out.println("Ciecumference is "+cir);
				break;
			case 4:
				System.out.println("Enter the side 1: ");
				side1 = sc.nextFloat();
				System.out.println("Enter the side 2: ");
				side2 = sc.nextFloat();
				System.out.println("Enter the base: ");
				base = sc.nextFloat();
				peri = side1+base+side2;
				System.out.println("Perimeter is "+peri);
				break;
		}
	}
}
