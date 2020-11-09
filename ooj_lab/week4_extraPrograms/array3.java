import java.util.Scanner;
class array3{
	public static void main(String args[]){
		double a1[],a3[],total_bill=0,final_bill;
		int a2[];
		Scanner s1 = new Scanner(System.in);
		a1=new double[100];
		a3=new double[100];
		a2=new int[100];
		System.out.println("Enter number of items");
		int n = s1.nextInt();
		System.out.println("Enter rate per item");
		for(int i=0; i<n; i++){
			System.out.println("Enter a1["+i+"]");
			a1[i]=s1.nextDouble();
		}
		System.out.println("Enter quantity of each item");
		for(int i=0; i<n; i++){
			System.out.println("Enter a2["+i+"]");
			a2[i]=s1.nextInt();
		}
		for(int i=0; i<n; i++){
			a3[i] = a1[i]*a2[i];
			total_bill = total_bill + a3[i];
		}
		System.out.println("Total bill is" +" "+ total_bill);
		if(total_bill >= 10000){
		final_bill = total_bill*0.95;
		System.out.println("The final bill is" +" "+ final_bill);
		}
		else if(total_bill >= 7500 && total_bill < 10000){
			final_bill = total_bill*0.97;
			System.out.println("The final bill is" +" "+ final_bill);
		}
		else if(total_bill >= 5000 && total_bill < 7500){
			final_bill = total_bill*0.98;
			String fb = String.format("%.2d", final_bill);
			System.out.println("The final bill is" +" "+ fb);
     	}
	}
}