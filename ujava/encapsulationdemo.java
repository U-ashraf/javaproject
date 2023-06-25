package ujava;

public class encapsulationdemo {

	public static void main(String[] args) {
		encapsulation  obj = new encapsulation();
		obj.setNRN(34624573);
		obj.setName("Testing");
		obj.setEmailid("Testing@gmail.com");
		obj.setPhonenum(775376453);
		
		System.out.println(obj.getNRN());
		System.out.println(obj.getName());
		System.out.println(obj.getEmailid());
		System.out.println(obj.getPhonenum());
		
		
	}

}
