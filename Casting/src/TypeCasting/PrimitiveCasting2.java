package TypeCasting;
class Sample{
	void test1(double d) {
		System.out.println("d value :"+d);
	}
	//void test1(int k) {
	//	System.out.println("k value :"+k);
	//}
}

public class PrimitiveCasting2 {

	public static void main(String[] args) {
		Sample s=new Sample();
		s.test1(7);

	}

}
