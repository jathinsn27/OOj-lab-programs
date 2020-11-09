import java.util.Scanner;

class Book{
	String name,author;
	double price;
	int num_page;
	Book()
	{}
	public Book(String name, String author, double price, int num_page)
	{
		this.name = name;
        this.author = author;
        this.price = price;
        this.num_page = num_page;
	}
	void Set(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter name of book");
		name = s1.nextLine();
		System.out.println("Enter author of book");
		author = s1.nextLine();
		System.out.println("Enter price of book");
		price = s1.nextDouble();
		System.out.println("Enter number of pages of book");
		num_page = s1.nextInt();
	}
	public String toString(){
		return "name: "+name+"\nauthor: "+author+"\nprice: "+price+"\nnumber of pages: "+num_page;
	}
}
class Bmain{
	public static void main(String args[]){
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter number of books");
		int n = s2.nextInt();
		Book b[] = new Book[n];
		for(int i=0; i<n; i++){
			b[i] = new Book();
			System.out.println("Enter details of book:"+ i);
			b[i].Set();
		}
		for(int i=0; i<n; i++){
			System.out.println("Details of book" + i + ":");
			System.out.println(b[i]);
		}
    }
}