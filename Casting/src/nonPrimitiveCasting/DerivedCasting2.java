package nonPrimitiveCasting;

	class Member{
		long phone;
		void chat() {
			System.out.println("Chatting in whatsapp group with"+phone);
		}
	}
	class Admin extends Member{
		void addNumber() {
			System.out.println("Adding new user number in whatsapp group");
		}
	}
public class DerivedCasting2 {

	public static void main(String[] args) {
		
		Member m1= new Admin();
		m1.phone= 9764446709l;
		m1.chat();
		System.out.println("*************After DownCasting***********************");
		Admin ad=(Admin)m1;//downcasting 
		ad.addNumber();
		ad.chat();
		System.out.println(ad.phone);
		// Admin a1=new Member();  this direct downcasting is not possible in java or invalid
	}
	

}
