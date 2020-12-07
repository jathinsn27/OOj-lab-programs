class MultipleGen<T, V, J>{
	T ob1;
	V ob2;
	J ob3;

MultipleGen(T o1, V o2, J o3){
	ob1 = o1;
	ob2 = o2;
	ob3 = o3;
}

void typeDisplay(){
	System.out.println("Type of T is " + ob1.getClass().getName());
	System.out.println("Type of V is " + ob2.getClass().getName());
	System.out.println("Type of J is " + ob3.getClass().getName());
}

T getob1(){ 
	return ob1;
}

V getob2(){
	return ob2;
}

J getob3(){
	return ob3;
}
}

class GenMain{
	public static void main(String args[]){
	MultipleGen<Integer, String, Double> mgobj = new MultipleGen<Integer, String, Double>(100, "jathin", 99.99);
	mgobj.typeDisplay();
	int a = mgobj.getob1();
	System.out.println("Value: " + a);
	String b = mgobj.getob2();
	System.out.println("Value: " + b);
	double c = mgobj.getob3();
	System.out.println("Value: " + c);
    }
}
