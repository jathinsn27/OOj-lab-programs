import java.util.Scanner;
public class circledemo{
 Scanner sc = new Scanner(System.in);
 double r;
 static double area,perimeter;
 void accept(){
 System.out.println("ENTER RADIUS OF CIRCLE");
 r = sc.nextDouble();
 }
 double a(){
 area = (3.14 * r * r);
 return area;
 }
 double p(){
 perimeter = (2 * 3.14 * r);
 return perimeter;
 }
 public static void main(String[] ss){
 Scanner sc = new Scanner(System.in);
 circledemo c1 = new circledemo();
 c1.accept();
 c1.a();
 c1.p();
 System.out.println("CALCULATED DETAILS");
 System.out.println("AREA :"+circledemo.area);
 System.out.println("PERIMETER :"+circledemo.perimeter);
 }
}