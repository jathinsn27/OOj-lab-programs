import java.util.Scanner;
class array4{
	public static void main(String args[]){
		int A[],B[],C[];
		int sum=0,count=0;
		double avg;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = s1.nextInt();
		A=new int[n];
		B=new int[n];
		C=new int[n];
		for(int i=0; i<n; i++){
			System.out.println("Enter value of A["+i+"]");
			A[i] = s1.nextInt();
			if(A[i]%2 == 0){
				C[i] = A[i];
				System.out.println(C[i]);
                sum = sum + C[i];
                count = count + 1;
			}
			else if(A[i]%2 != 0){
				B[i] = A[i];				
			}
		}
		int max=C[0], min=C[0];
		for(int i=0; i<n; i++){
			if(C[i]>max){
				max = C[i];
			}
			else if(C[i]<min){
				min = C[i];
			}
		}
		avg = sum/count;
		System.out.println("The sum is:" +sum);
		System.out.println("The average is:" +avg);
		System.out.println("The maximum number is:" +max);
		System.out.println("The minimum number is:" +min);
	}
}