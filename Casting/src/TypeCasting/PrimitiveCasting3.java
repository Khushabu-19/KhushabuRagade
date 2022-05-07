package TypeCasting;
class Sample1{
	double test1() {
		System.out.println("Running test1");
		return 4;
	}
}
public class PrimitiveCasting3 {

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		//int res=(int)s.test1();
		float res=(float)s.test1();
		System.out.println("return value ="+res);

	}

}
