import java.util.Scanner;
class array1
{
	public static void main(String args[]){
		int a2[];
		int sum_even = 0, sum_odd = 0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n=s1.nextInt();
		a2=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a2["+i+"]");
			a2[i]=s1.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(i%2 == 0){
				sum_even = sum_even + a2[i];
			}
			else if(i%2 != 0){
				sum_odd = sum_odd + a2[i];
			}
		}
	    System.out.println("sum of even numbers is" +" "+ sum_even);
	    System.out.println("sum of even numbers is" +" "+ sum_odd);
	}
}