abstract class Shape{
	double dim1,dim2;
	abstract double printArea();
}

class Rectangle extends Shape{
	Rectangle(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	double printArea(){
		System.out.println("Inside the Rectangle");
		return dim1*dim2;
	}
}

class Triangle extends Shape{
	Triangle(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	double printArea(){
		System.out.println("Inside the Triangle");
		return dim1*dim2/2;
	}
}

class Circle extends Shape{
	Circle(double a){
        dim1 = a;
	}
	double printArea(){
		System.out.println("Inside the Circle");
		return 3.14*dim1*dim1;
	}
}

class abs1Main{
	public static void main(String args[]){
		Rectangle r = new Rectangle(10,20);
		Triangle t = new Triangle(20,30);
		Circle c = new Circle(35);

		System.out.println("Area of Rectangle is:" +r.printArea());
		System.out.println("Area of Triangle is:" +t.printArea());
		System.out.println("Area of Circle is:" +c.printArea());
	}
}
