package CIE;
import java.util.Scanner;

public class Internals extends Student
{
    public double[] ciem;

    public void display()
    {
        ciem = new double[5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("CIE Marks for 5 subjects out of 50:");
        for(int i=0;i<5;i++){
            ciem[i]=s1.nextDouble();
            if(ciem[i] > 50){
            	System.out.println("Please enter valid internal marks");
            }
        }
    }
}