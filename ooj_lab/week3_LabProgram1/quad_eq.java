import java.util.Scanner;
class equation
{
	public static void main(String args[]){
		double r1,r2;
		Scanner num = new Scanner(System.in);
		System.out.println("Let the quadratic equation be of the form ax^2+bx+c=0\n");
		System.out.println("Enter value of a");
		double a = num.nextDouble();
		System.out.println("Enter value of b");
		double b = num.nextDouble();
		System.out.println("Enter value of c");
		double c = num.nextDouble();
		double det = ((b*b)-(4*a*c));
		double sqrt = Math.sqrt(det);
		if(det>0){
            r1 = (-b + sqrt)/(2*a);
            r2 = (-b - sqrt)/(2*a);
            String s1 = String.format("%.2f", r1);
            String s2 = String.format("%.2f", r2);
            System.out.println("Roots are real and distinct");
            System.out.println("Roots are" +" "+ s1 +" "+ "and" +" "+ s2);
		}
		else if(det == 0){
			System.out.println("Roots are Real and equal");
			r1 = (-b + sqrt)/(2*a);
			System.out.println("Roots is");
			String s3 = String.format("%.2f", r1);
			System.out.println(s3);
		}
		else{
			System.out.println("No real roots\n");
		}
	}
}