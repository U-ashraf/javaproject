package ujava;

public class encapsulation {
	// The process of grouping variables and its methods into a single unit is called Encapsulation
		//Encapsulation is used for data hiding, it means that we don't see actual implementation
		//This is used for security reasons and to save from hackers.
		//GEtter and Setter Method
		
		private int NRN;
		private String name;
		private int phonenum;
		private String emailid;
	public static void main(String[] args) {
		encapsulation obj = new encapsulation();
		
		
		}

		public int getNRN() {
			return NRN;
		}

		public void setNRN(int nRN) {
			NRN = nRN;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPhonenum() {
			return phonenum;
		}

		public void setPhonenum(int phonenum) {
			this.phonenum = phonenum;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

	}


