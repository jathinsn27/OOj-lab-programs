
import java.util.Scanner;

abstract class Account{
	String c_name, acc_type;
	int acc_num;
	double balance;
	int minbalance = 2000;
	Account(String c_name, int acc_num, double balance){
		this.c_name = c_name;
		this.acc_num = acc_num;
        this.balance = balance;
		this.acc_type = acc_type;
	}

		abstract void addbal(double amount);
        abstract void display();
        abstract void withdraw(double amount);
}

class curr_acct extends Account{
	curr_acct(String c_name, int acc_num, double balance){
		super(c_name, acc_num, balance);
		System.out.println("Details ot the customer:");
		System.out.println("Customer name: " +c_name +"\tAccount number: " +acc_num+ "\tBalance: " +balance+ "Account type: current");	    
	}
    
    void addbal(double amount){
    	this.balance += amount;
    }

    void  display(){
    	System.out.println("The balance is:" +this.balance);
    }

    void withdraw(double amount){
    	if(this.balance<amount){
    		System.out.println("Insufficient funds");
    		System.out.println("Yor balance is: " +this.balance);
    		return;
    	}
    	this.balance = this.balance - amount;
    	if(this.balance<minbalance){
            this.balance = this.balance - this.balance*0.5;
            System.out.println("A penalty of Rs. " +this.balance*0.5 + "has been charged as minimum balance is not satisfied");
            System.out.println("Updated Balance: " +this.balance);
            System.out.println("Cannot withdraw");
    	}
        else if(balance> minbalance){
        	this.balance = this.balance - amount;
        	System.out.println("Balance is: " +this.balance);
        }
    }
}

class sav_acct extends Account{
	sav_acct(String c_name, int acc_num, double balance){
		super(c_name, acc_num, balance);
		System.out.println("Customer name: " +c_name +"\tAccount number: " +acc_num+ "\tBalance: " +balance+ "Account type: savings");	    
	}
	void addbal(double amount){
    	this.balance += amount;
    }

    void  display(){
    	System.out.println("The balance is:" +this.balance);
    }

    void withdraw(double amount){
    	if(this.balance<amount){
    		System.out.println("Insufficient funds");
    		System.out.println("Yor balance is: " +this.balance);
    	}
    	this.balance = this.balance - amount;
    	if(this.balance<minbalance){
            this.balance = this.balance - this.balance*0.5;
            System.out.println("A penalty of Rs. " +this.balance*0.5 + "has been charged as minimum balance is not satisfied");
            System.out.println("Updated Balance: " +this.balance);
            System.out.println("Cannot withdraw");
    	}
        else if(balance> minbalance){
        	this.balance = this.balance - amount;
        	System.out.println("Balance is: " +this.balance);
        }
    }

    void intrest(double amount){
    	int time = 3, n=1;
    	System.out.println("Rate of intrest is 0.2");
    	this.balance = this.balance*Math.pow(1+(0.2)/n, (nt));
    }
}

class abs2Main{
	public static void main(String args[]){
		int choice,ch,n=1;
		double amount;
        Scanner s1 = new Scanner(System.in);
        curr_acct c = new curr_acct("jatin", 12345, 50000);
        sav_acct s = new sav_acct("jatin", 12345, 50000);
        System.out.println("Press 1.For Current account\nPress 2.For Savings account");
        choice = s1.nextInt();
        switch(choice){
        	case 1: System.out.println("****Current Account****");        	       
        	        while(n!=0){
        	        	System.out.println("1.AddBalance\n2.displayBalance\n3.withdraw\n4.checkbook\n5.Exit");
                        ch = s1.nextInt();
                        String reciever;
                        double recamount;
                        switch(ch){
                        	case 1:
                                System.out.println("enter amount to be added:");
                                amount = s1.nextDouble();
                                c.addbal(amount);
                                break;

                            case 2:
                                 c.display();
                                 break;

                            case 3:
                                System.out.println("enter amount to be withdrawn:");
                                amount = s1.nextDouble();
                                c.withdraw(amount);
                                break;

                            case 4:
                                System.out.println("Enter the name of the reciever:");
                                reciever = s1.next();
                                System.out.println("Enter amount to be debited to reciever:");
                                recamount = s1.nextDouble();
                                if(recamount>c.balance){
                                	System.out.println("Inssuficient Balance");
                                }
                                else{
                                	System.out.println("Amount of " +recamount+ "sent to" +reciever);
                                	c.balance = c.balance - recamount;
                                	System.out.println("Balance: " +c.balance);
                                	s.balance = c.balance;
                                }

                            case 5:
                                n=0;
                                break;

                            default: System.out.println("Invalid input");
                        }                     
                    }
                    break;
  
        	case 2: System.out.println("****Savings Account****");
        	        while(n!=0){
        	        	System.out.println("1.AddBalance\n2.displayBalance\n3.withdraw\n4.Exit");
                        ch = s1.nextInt();
                        switch(ch){
                        	case 1:
                                System.out.println("enter amount to be added:");
                                amount = s1.nextDouble();
                                s.addbal(amount);
                                break;

                            case 2:
                                 s.display();
                                 break;

                            case 3:
                                System.out.println("enter amount to be withdrawn:");
                                amount = s1.nextDouble();
                                s.withdraw(amount);
                                break;

                            case 4:
                                n=0;

                            default: System.out.println("Invalid input");                     
                        }
                    }
                    break;

        	default: System.out.println("Invalid input");          
        }
	}
}