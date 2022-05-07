package nonPrimitiveCasting;

	class Parent{
		void show() {
			System.out.println("Parent Show Method");
		}
		void callme() {
		System.out.println("Parent Callme Method");
		}
	}
	class Child extends Parent{
		void draw() {
			System.out.println("Child Draw Method");
		}
	}
public class DerivedCasting1 {

	public static void main(String[] args) {
		
		Child c1= new Child();
		c1.show();
		c1.callme();
		c1.draw();
		Parent p1=c1;
		// or Parent p1=(Parent) c1;  or Parent p1=(Parent)new Child();
		p1.show();
		p1.callme();
	
	}

}
