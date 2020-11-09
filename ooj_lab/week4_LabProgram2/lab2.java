import java.util.Scanner;
class student{
    private int a_cred[], total_cred=0;
	private double a_mark[],a_cal[], sum=0, sgpa, num[];
	private String name, usn;

	void acceptDetails()
	{
		System.out.println("Enter student details:");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter name:");
		name = s1.nextLine();
		System.out.println("Enter usn:");
		usn = s1.nextLine();
		a_mark = new double[5];
		a_cred = new int[5];
		a_cal = new double[5];
		for(int i=0; i<5; i++){
			System.out.println("Enter a_mark["+i+"]");
			a_mark[i]=s1.nextDouble();
		} 
		for(int i=0; i<5; i++){
			System.out.println("Enter a_cred["+i+"]");
			a_cred[i]=s1.nextInt();
		} 	
	}

	void displayDetails()
	{
		System.out.println("name:" +name);
		System.out.println("usn:" +usn);
		System.out.println("Marks of student are:");
		for(int i=0; i<5; i++){
			System.out.println("a_mark["+i+"]"+":"+a_mark[i]);
		}
	}

	void calculate(){
		num = new double[5];
		for(int i=0; i<5; i++){
		if(a_mark[i]>100){
			System.out.println("invalid marks");
		}
		else if(a_mark[i]>=90){
            num[i] = 10;
        }
        else if(a_mark[i]>=80 && a_mark[i]<90){
            num[i] = 9;
        }
        else if(a_mark[i]>=70 && a_mark[i]<80){
            num[i] = 8;
        }
        else if(a_mark[i]>=60 && a_mark[i]<70){
            num[i] = 7;
        }
        else if(a_mark[i]>=50 && a_mark[i]<60){
            num[i] = 5;
        }
        else if(a_mark[i]>=40 && a_mark[i]<50){
            num[i] = 4;
        }
        else{
            num[i] = 0;
        }
        a_cal[i] = num[i]*a_cred[i];
        sum = sum + a_cal[i];
        total_cred = total_cred + a_cred[i];
    }
        sgpa = sum/total_cred;
		System.out.println("sgpa:" +sgpa);
    }
}

class StudentMain
{
    public static void main(String args[]){
        student obj = new student();
       	obj.acceptDetails();
       	obj.displayDetails();
       	obj.calculate();
    }
}
