import java.util.Scanner;

public class QuadraticUC4 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the value of a");
			double a = scan.nextDouble();
			System.out.println("Enter the value of b");
			double b = scan.nextDouble();
			System.out.println("Enter the value of c");
			double c = scan.nextDouble();
			
			double delta = (b*b-4.0*a*c);
			if(delta>0.0) {
			double root1 = (-b+(Math.sqrt(delta)))/(2*a); 
			double root2 = (-b-(Math.sqrt(delta)))/(2*a); 
			System.out.println("the roots are "+root1+"and"+root2);
			}
			else if (delta==0.0) {
				double root1 = -b/(2.0*a);
				System.out.println("the roots is "+root1); }
			else {
				System.out.println("the roots are not real");
			}
		}
	}
}