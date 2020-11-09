import java.util.Scanner;

abstract class Player{
	String name;
	int matches_played;
	double average;
	abstract void cal_average(String na, int map, int z);
}

class Batsmen extends Player{
	int runs_scored;
	void cal_average(String na, int map, int z){
		name = na; 
		matches_played = map; 
		runs_scored = z;
		average = (double)runs_scored/matches_played;
	    System.out.println("Average runs scored by "+name+ "is:" +average);
	}
}
class Bowler extends Player{
	int runs_given;
	void cal_average(String a, int b, int c){
		name = a; 
		matches_played = b; 
		runs_given = c;
		average = (double)runs_given/matches_played;
	    System.out.println("Average runs given by "+name+ "is:" +average);
    }
}
class Smain{
	public static void main(String args[]){
		int n,m;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number of batsmen:");
        m = s1.nextInt();
        System.out.println("Enter number of bowlers:");
        n = s1.nextInt();
		Batsmen[] b1 = new Batsmen[m];
		Bowler[] b2 = new Bowler[n];
		System.out.println("***Batsmen***");
		for(int i=0; i<m; i++){
			b1[i] = new Batsmen();
			System.out.println("enter name of player:");
			b1[i].name = s1.next();
			System.out.println("enter number of matches played:");
			b1[i].matches_played = s1.nextInt();
			System.out.println("enter number of runs scored:");
			b1[i].runs_scored= s1.nextInt();
		}
		System.out.println("***Bowler***");
		for(int i=0; i<n; i++){
			b2[i] = new Bowler();
			System.out.println("enter name of player:");
			b2[i].name = s1.next();
			System.out.println("enter number of matches played:");
			b2[i].matches_played = s1.nextInt();
			System.out.println("enter number of runs given:");
			b2[i].runs_given= s1.nextInt();
		}
		for(int i=0; i<m; i++){
			b1[i].cal_average(b1[i].name,b1[i].matches_played,b1[i].runs_scored);
		}	
		for(int i=0; i<n; i++){
			b1[i].cal_average(b2[i].name,b2[i].matches_played,b2[i].runs_given);
		}	
	}
}