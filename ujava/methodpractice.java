package ujava;

public class methodpractice {

	public static void main(String[] args) {
		methodpractice obj=new methodpractice();
		obj.login("Usman", "test123");
	

	}
	public void login(String username ,String password)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println("click login");
	}
	

}
//class contains Variable and Methods or Functions

	//Methods or Functions:
			
	/*Defnition: 
			
	Whenever we feel some set of lines of code can be reused multiple times, then we will place 
	that code in a Method and call that method when needed. Method should be created only outside Main
	*/

	// Methods can be called by creating an object
	