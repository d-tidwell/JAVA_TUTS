import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// Serialization - converting obj to byte stream.
//							Persists the obj after program exit
//							Can be saved to file or sent over network
//							saved as .ser which is platform independant
//							
//		   Deserialization = converts bytestreamt to obj 
		
//		Steps to serialize object
//		---------------------------------------------------------
//		1. Your object class should implement Serializable interface
//		2. add import java.io.Serializable
//		3. FileOutputStream fileOut = new FileOutputStream(file path)
//		4. ObjectOutputStream out = new ObjectOutputStream(fileOut)
//		5. out.writeObject(objectName)
//		6. out.close(); fileOut.close();
//		---------------------------------------------------------
		
		 User user = new User();
		 
		 user.name = "Bob";
		 user.password = "I<3Pizza1!";
				 
		 user.sayHello();
		 
		 FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		 ObjectOutputStream out = new ObjectOutputStream(fileOut);
		 out.writeObject(user);
		 out.close();
		 fileOut.close();
		 
		 System.out.println("Object was saved!");
				   
	}

}
