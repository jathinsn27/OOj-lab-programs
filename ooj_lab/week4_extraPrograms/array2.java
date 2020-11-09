import java.util.Scanner;
class array2{
	public static void main(String args[]){
		int a2[];
		int c1 = 0, c2 = 0, c3 = 0;
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
			if(a2[i]>0){
			    c1 = c1 + 1;			    
			}
		    else if(a2[i]<0){
			    c2 = c2 + 1;			    
            }
            else if(a2[i] == 0){
			    c3 = c3 + 1;
		    }
		}
		System.out.println("Number of positive numbers is" +" "+ c1);
		System.out.println("Number of negative numbers is" +" "+ c2);
		System.out.println("Number of zeros is" +" "+ c3);
	}
}