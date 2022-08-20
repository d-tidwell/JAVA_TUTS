
public class MyGenericClassExample <T>{
	
	T x;
	
	MyGenericClassExample(T x){
		
		this.x = x;
	}
	public T getValue() {
		return x;
	}
}
