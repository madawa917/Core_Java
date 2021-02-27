class Test<T,U> {
	
	private T obj1;
	private U obj2;
	
	Test(T ob1, U ob2){
		this.obj1 = ob1;
		this.obj2 = ob2;
		
	}
	
	public void print(){
		System.out.println("Object1 = " + this.obj1);
		System.out.println("Object2 = " + this.obj2);
		
	}
}
public class GenericsClass{
	
	public static void main(String[] args){
		
		Test<String, Integer> nobj = new Test<String, Integer>("Madawa", 47);
		nobj.print();
	}
	
}
