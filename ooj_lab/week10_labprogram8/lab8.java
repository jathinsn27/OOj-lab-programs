import java.util.Scanner;

class WrongAge extends Exception{
	double age;

	WrongAge(double x){
		age = x;
	}

	public String toString(){
        return "Age of son " + age + " is invalid";
	}
}

class Father {
	double fage;
	Father (double father_age){
        fage = father_age;
	}	
}

class Son extends Father{
	double sage;

	Son(double fage, double age){
	    super(fage);
	    sage = age;
    }

    void calculate() throws WrongAge{
    	if(sage>=fage){
    		throw new WrongAge(sage);
    	}
    	else{
    		System.out.println("The age of Father is: " +fage);
    		System.out.println("The age of Son is: " +sage);
    	}
    }
}

class ExeMain{
	public static void main(String args[]){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter father's age:");
		double f = s1.nextDouble();
		System.out.println("Enter son's age:");
		double s = s1.nextDouble();
		Son sa = new Son(f, s);
		try{
			sa.calculate();
		}
		catch(WrongAge e){
			System.out.println("Input invalid"+ e);
		}
	}    
}