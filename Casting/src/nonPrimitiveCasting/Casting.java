package nonPrimitiveCasting;
	
	class Parent100{
		void myHome() {
			System.out.println("Parent Home");
		}
	}
	class Child100 extends Parent100{
		void myCar() {
			System.out.println("Child Car");
		}
	}
public class Casting {

	public static void main(String[] args) {
		Child100 c1=new Child100();
		c1.myHome();
		c1.myCar();
		Parent100 p1=new Parent100();
		p1.myHome();
		System.out.println("****************Using Upcasting************************");
		Child100 c2= new Child100();
		c2.myCar();
		c2.myHome();
		Parent100 p2=c2; //auto upcasting
		p2.myHome();
	}

}
