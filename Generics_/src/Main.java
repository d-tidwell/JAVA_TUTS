
public class Main {

	public static void main(String[] args) {
		// Generics = enable tupes (classes and interfaces) to be
//					parameters when defining:
//					methods
//					classes for various data types
//					Use 1 version for all reference data types
		
		//rather than making a separate method for each of these
		// arrays, you can make one function with a generic parameter
		// here its called Thing
		
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.5,2.5,3.5,4.5,5.5};
		Character[] charArray = {'H','i','M','o','M'};
		String[] stringArray = {"Bye","Felicia","!"};
		
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		
		System.out.println(getFirstElem(intArray));
		System.out.println(getFirstElem(doubleArray));
		System.out.println(getFirstElem(charArray));
		System.out.println(getFirstElem(stringArray));
		
		//-------------------------------------------//
		//----------------Generic Class and Calls-----//
		
		MyGenericClassExample <Integer> intArr = new MyGenericClassExample(1);
		MyGenericClassExample <Double> doubleArr = new MyGenericClassExample(2.2);
		MyGenericClassExample <Character> charArr = new MyGenericClassExample('@');
		MyGenericClassExample <String> stringArr = new MyGenericClassExample('H');
		
		System.out.println(intArr.getValue());
		System.out.println(doubleArr.getValue());
		System.out.println(charArr.getValue());
		System.out.println(stringArr.getValue());
	}	
	//custom dictates replacing Thing with just T
	//can limit the data types accepted as well - "Bounded Types"
	public static <Thing> void displayArray(Thing[] array) {
		
		for(Thing x : array) {
			System.out.print(x + " ");
			
		}
		System.out.println();
	}
	
	//to return a generic type
	public static <T> T getFirstElem(T[] array) {
		return array[0];
	}
}
