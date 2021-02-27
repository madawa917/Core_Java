public class BoundedTypeParameter{
	
	public static void main(String[] args){
		display(10);
		display(10.5F);
		display(345L);
	
	}
	public static <T extends Number> void display(T value){
		System.out.println(value);
	
	}
	
}

	






