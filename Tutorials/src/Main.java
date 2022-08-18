
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car vette = new Car();
		Human bob = new Human("bob", 24, 180);
		
		System.out.println(bob);
		
		System.out.println(bob.name);
		System.out.println(bob.age);
		System.out.println(bob.weight);
		
		bob.eat();
		
		System.out.println(vette.model);
		System.out.println(vette.make);
		System.out.println(vette.year);
		System.out.println(vette.color);
		
		vette.drive();
		//ctrl + spacebar completes code
		System.out.println(0);
		
		

	}

}
