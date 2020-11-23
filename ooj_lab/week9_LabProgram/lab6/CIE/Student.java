package CIE;
import java.util.Scanner;

public class Student
{
    public String name;
    public String usn;
    public int sem;
    public void display()
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("Name:");
        name=s2.next();
        System.out.println("USN:");
        usn=s2.next();
        System.out.println("Semester:");
        sem=s2.nextInt();
    }
}