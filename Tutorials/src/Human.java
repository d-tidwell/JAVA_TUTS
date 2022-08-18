
public class Human {
	
	String name;
	int age;
	double weight;
	
	//constructor call
	Human(String name, int age, double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;	
	}
	Human(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	Human(String name){
		
		this.name = name;	
	}
	
	
	//self referencing method
	void eat() {
		System.out.println(this.name+ " is eating.");
	}
	

}
