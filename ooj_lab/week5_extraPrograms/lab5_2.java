import java.util.Scanner;

class Age{
	double y1,m1,y2,m2;
	public void accept(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter years of john:");
		y1 = s1.nextDouble();
		System.out.println("Enter months of john:");
		m1 = s1.nextDouble();
		System.out.println("Enter years of mark:");
		y2 = s1.nextDouble();
		System.out.println("Enter months of mark:");
		m2 = s1.nextDouble();
	}
	public void compute(){
		double a_1,a_2;
		a_1 = 12*y1 + m1;
		a_2 = 12*y2 + m2;
		if(a_1>a_2){
			System.out.println("john is elder than mark");
		}
		else if(a_2>a_1){
			System.out.println("mark is elder than john");
		}
	}
}
class Amain{
	public static void main(String args[]){
		Age obj1 = new Age();
		Age obj2 = new Age();
		obj1.accept();
		obj1.compute();
	}
}