import java.util.Scanner;
public class transpose{
public static void main(String ss[]){
int i,j;
System.out.println("ENTER NO OF ROWS AND COLUMNS");
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int column = sc.nextInt();
int array[][] = new int[row][column];
System.out.println("ENTER MATRIX");
for(i = 0; i<row ; i++){
for(j=0;j<column;j++){
array[i][j] =sc.nextInt();
System.out.print("");
}
}
System.out.println("MATRIX ENETERED IS :");
for(i=0;i<row;i++){
for(j=0;j<column;j++){
System.out.print(array[i][j]+" ");
}
System.out.println(" ");
}
System.out.println("MATRIX AFTER TRANSPOSE :");
for(i=0;i<column;i++){
for(j=0;j<row;j++){
System.out.print(array[j][i]+" ");
}
System.out.println(" ");
}
}
}